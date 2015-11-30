package com.dsdl;

import com.dsdl.dSDL.*;
import com.dsdl.dSDL.Integer;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class Parser {

    private List<String> errors = Lists.newArrayList();
    private Map<String, Table> tables;

    public static void main(String args[]) {
        Parser parser = new Parser();
        System.out.println(parser.parseFile("res/test.dsdl"));
        System.out.println(parser.getErrors().size() + " error(s) was found:");
        for (String error : parser.getErrors()) {
            System.out.println(error);
        }
    }

    public List<String> getErrors() {
        return errors;
    }

    public String parseContent(String content) {
        Injector injector = new DSDLStandaloneSetup().createInjectorAndDoEMFRegistration();
        IResourceValidator iResourceValidator = injector.getInstance(IResourceValidator.class);
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(URI.createURI("dummy:/example.dsdl"));
        InputStream in = new ByteArrayInputStream(content.getBytes());
        try {
            resource.load(in, resourceSet.getLoadOptions());
            return parse(resource, iResourceValidator);
        } catch (IOException e) {
            errors.add(e.getMessage());
            return "";
        }
    }

    public String parseFile(String filename) {
        Injector injector = new DSDLStandaloneSetup().createInjectorAndDoEMFRegistration();
        IResourceValidator iResourceValidator = injector.getInstance(IResourceValidator.class);
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
        Resource resource = resourceSet.getResource(URI.createURI(filename), true);

        return parse(resource, iResourceValidator);
    }

    public String parse(Resource resource, IResourceValidator iResourceValidator) {
        for (Resource.Diagnostic diagnostic : resource.getErrors()) {
            System.err.println(diagnostic);
        }

        errors = Lists.newArrayList();
        List<Issue> issues = iResourceValidator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
        if (issues.size() != 0) {
            for (Issue issue : issues) {
                errors.add(issue.toString());
            }
        }

        if (errors.isEmpty()) {
            Database database = (Database)resource.getContents().get(0);
            String ddlQuery = generateDdlQuery(database);
            if (errors.isEmpty()) {
                return ddlQuery;
            } else {
                return "";
            }
        } else {
            return "";
        }
    }

    private String generateDdlQuery(Database database) {
        StringBuilder queryBuilder = new StringBuilder();

        tables = Maps.newHashMap();
        List<ForeignKey> foreignKeys = Lists.newArrayList();
        queryBuilder.append(generateDatabaseDefinition(database)).append("\n\n");
        for (Table table : database.getTable()) {
            if (tables.containsKey(table.getName())) {
                errors.add("Found duplicate for table " + table.getName());
            } else {
                tables.put(table.getName(), table);
            }
            queryBuilder.append(generateTableDefinition(table)).append("\n");
            for (Attribute attribute : table.getAttribute()) {
                for (Property property : attribute.getProperty()) {
                    if (property instanceof ForeignKey) {
                        foreignKeys.add((ForeignKey)property);
                    }
                }
            }
        }
        for (ForeignKey foreignKey : foreignKeys) {
            queryBuilder.append(generateForeignKeyDefinition(foreignKey)).append("\n");
        }

        return queryBuilder.toString();
    }

    private String generateDatabaseDefinition(Database database) {
        return "CREATE DATABASE IF NOT EXISTS `" + database.getName() + "` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;\n" +
                "USE `" + database.getName() + "`;";
    }

    private String generateTableDefinition(Table table) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("CREATE TABLE IF NOT EXISTS `" + table.getName() + "` (");
        boolean first = true;
        for (Attribute attribute : table.getAttribute()) {
            if (!first) {
                queryBuilder.append(",\n");
            } else {
                queryBuilder.append("\n");
                first = false;
            }
            queryBuilder.append("\t" + generateAttributeDefinition(attribute));
        }
        queryBuilder.append("\n);");
        return queryBuilder.toString();
    }

    private String generateAttributeDefinition(Attribute attribute) {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("`" + attribute.getAttributeName() + "` " + generateTypeDefinition(attribute.getType()));
        boolean notNull = true;
        for (Property property : attribute.getProperty()) {
            if (property instanceof Nullable) {
                notNull = false;
            } else if (property instanceof AutoIncrement) {
                queryBuilder.append(" AUTO_INCREMENT");
            } else if (property instanceof PrimaryKey) {
                queryBuilder.append(" PRIMARY KEY");
            } else if (property instanceof ForeignKey) {
                // do nothing
            } else {
                throw new IllegalArgumentException("Unknown property class: " + property.getClass().getName());
            }
        }
        if (notNull) {
            queryBuilder.append(" NOT NULL");
        }
        return queryBuilder.toString();
    }

    private String generateTypeDefinition(Type type) {
        if (type instanceof Integer) {
            return "int(" + ((Integer) type).getLength() + ")";
        } else if (type instanceof Varchar) {
            return "varchar(" + ((Varchar) type).getLength() + ")";
        } else if (type instanceof Text) {
            return "text";
        } else if (type instanceof DateTime) {
            return "datetime";
        } else {
            throw new IllegalArgumentException("Unknown type class: " + type.getClass().getName());
        }
    }

    private String generateForeignKeyDefinition(ForeignKey foreignKey) {
        Attribute attribute = (Attribute)foreignKey.eContainer();
        Table table = (Table)attribute.eContainer();
        if (!tables.containsKey(foreignKey.getTableName())) {
            errors.add("No tables with name " + foreignKey.getTableName() + " was found");
            return "";
        } else {
            Table thatTable = tables.get(foreignKey.getTableName());
            for (Attribute thatAttribute : thatTable.getAttribute()) {
                if (thatAttribute.getAttributeName().equals(foreignKey.getAttributeName())) {
                    if (generateTypeDefinition(attribute.getType()).equals(generateTypeDefinition(thatAttribute.getType()))) {
                        return "ALTER TABLE `" + table.getName() + "`\n\t" +
                                "ADD CONSTRAINT `" + (foreignKey.getTableName() + "_" + table.getName() + "_fk") + "` " +
                                "FOREIGN KEY (`" + attribute.getAttributeName() + "`) " +
                                "REFERENCES `" + foreignKey.getTableName() + "` (`" + foreignKey.getAttributeName() + "`) " +
                                "ON DELETE CASCADE ON UPDATE CASCADE;";
                    }
                }
            }
            errors.add("No matching attribute (" + foreignKey.getAttributeName() + ") was found");
            return "";
        }
    }

}
