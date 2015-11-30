/**
 */
package com.dsdl.dSDL.impl;

import com.dsdl.dSDL.Attribute;
import com.dsdl.dSDL.AutoIncrement;
import com.dsdl.dSDL.DSDLFactory;
import com.dsdl.dSDL.DSDLPackage;
import com.dsdl.dSDL.Database;
import com.dsdl.dSDL.DateTime;
import com.dsdl.dSDL.ForeignKey;
import com.dsdl.dSDL.Nullable;
import com.dsdl.dSDL.PrimaryKey;
import com.dsdl.dSDL.Property;
import com.dsdl.dSDL.Table;
import com.dsdl.dSDL.Text;
import com.dsdl.dSDL.Type;
import com.dsdl.dSDL.Varchar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSDLPackageImpl extends EPackageImpl implements DSDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varcharEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateTimeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass autoIncrementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass foreignKeyEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.dsdl.dSDL.DSDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DSDLPackageImpl()
  {
    super(eNS_URI, DSDLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DSDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DSDLPackage init()
  {
    if (isInited) return (DSDLPackage)EPackage.Registry.INSTANCE.getEPackage(DSDLPackage.eNS_URI);

    // Obtain or create and register package
    DSDLPackageImpl theDSDLPackage = (DSDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DSDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DSDLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDSDLPackage.createPackageContents();

    // Initialize created meta-data
    theDSDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDSDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DSDLPackage.eNS_URI, theDSDLPackage);
    return theDSDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabase()
  {
    return databaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabase_Name()
  {
    return (EAttribute)databaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabase_Table()
  {
    return (EReference)databaseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTable()
  {
    return tableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTable_Name()
  {
    return (EAttribute)tableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTable_Attribute()
  {
    return (EReference)tableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_AttributeName()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Type()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Property()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInteger()
  {
    return integerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_Integer()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInteger_Length()
  {
    return (EAttribute)integerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarchar()
  {
    return varcharEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarchar_Varchar()
  {
    return (EAttribute)varcharEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarchar_Length()
  {
    return (EAttribute)varcharEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getText()
  {
    return textEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getText_Text()
  {
    return (EAttribute)textEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDateTime()
  {
    return dateTimeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDateTime_Date()
  {
    return (EAttribute)dateTimeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryKey()
  {
    return primaryKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimaryKey_PrimaryKey()
  {
    return (EAttribute)primaryKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAutoIncrement()
  {
    return autoIncrementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAutoIncrement_AutoIncrement()
  {
    return (EAttribute)autoIncrementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullable()
  {
    return nullableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullable_Nullable()
  {
    return (EAttribute)nullableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForeignKey()
  {
    return foreignKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForeignKey_TableName()
  {
    return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getForeignKey_AttributeName()
  {
    return (EAttribute)foreignKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSDLFactory getDSDLFactory()
  {
    return (DSDLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    databaseEClass = createEClass(DATABASE);
    createEAttribute(databaseEClass, DATABASE__NAME);
    createEReference(databaseEClass, DATABASE__TABLE);

    tableEClass = createEClass(TABLE);
    createEAttribute(tableEClass, TABLE__NAME);
    createEReference(tableEClass, TABLE__ATTRIBUTE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);
    createEReference(attributeEClass, ATTRIBUTE__TYPE);
    createEReference(attributeEClass, ATTRIBUTE__PROPERTY);

    typeEClass = createEClass(TYPE);

    propertyEClass = createEClass(PROPERTY);

    integerEClass = createEClass(INTEGER);
    createEAttribute(integerEClass, INTEGER__INTEGER);
    createEAttribute(integerEClass, INTEGER__LENGTH);

    varcharEClass = createEClass(VARCHAR);
    createEAttribute(varcharEClass, VARCHAR__VARCHAR);
    createEAttribute(varcharEClass, VARCHAR__LENGTH);

    textEClass = createEClass(TEXT);
    createEAttribute(textEClass, TEXT__TEXT);

    dateTimeEClass = createEClass(DATE_TIME);
    createEAttribute(dateTimeEClass, DATE_TIME__DATE);

    primaryKeyEClass = createEClass(PRIMARY_KEY);
    createEAttribute(primaryKeyEClass, PRIMARY_KEY__PRIMARY_KEY);

    autoIncrementEClass = createEClass(AUTO_INCREMENT);
    createEAttribute(autoIncrementEClass, AUTO_INCREMENT__AUTO_INCREMENT);

    nullableEClass = createEClass(NULLABLE);
    createEAttribute(nullableEClass, NULLABLE__NULLABLE);

    foreignKeyEClass = createEClass(FOREIGN_KEY);
    createEAttribute(foreignKeyEClass, FOREIGN_KEY__TABLE_NAME);
    createEAttribute(foreignKeyEClass, FOREIGN_KEY__ATTRIBUTE_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    integerEClass.getESuperTypes().add(this.getType());
    varcharEClass.getESuperTypes().add(this.getType());
    textEClass.getESuperTypes().add(this.getType());
    dateTimeEClass.getESuperTypes().add(this.getType());
    primaryKeyEClass.getESuperTypes().add(this.getProperty());
    autoIncrementEClass.getESuperTypes().add(this.getProperty());
    nullableEClass.getESuperTypes().add(this.getProperty());
    foreignKeyEClass.getESuperTypes().add(this.getProperty());

    // Initialize classes and features; add operations and parameters
    initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabase_Name(), ecorePackage.getEString(), "name", null, 0, 1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabase_Table(), this.getTable(), null, "table", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTable_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Type(), this.getType(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Property(), this.getProperty(), null, "property", null, 0, -1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(integerEClass, com.dsdl.dSDL.Integer.class, "Integer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInteger_Integer(), ecorePackage.getEString(), "integer", null, 0, 1, com.dsdl.dSDL.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInteger_Length(), ecorePackage.getEInt(), "length", null, 0, 1, com.dsdl.dSDL.Integer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(varcharEClass, Varchar.class, "Varchar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarchar_Varchar(), ecorePackage.getEString(), "varchar", null, 0, 1, Varchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVarchar_Length(), ecorePackage.getEInt(), "length", null, 0, 1, Varchar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateTimeEClass, DateTime.class, "DateTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDateTime_Date(), ecorePackage.getEString(), "date", null, 0, 1, DateTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryKeyEClass, PrimaryKey.class, "PrimaryKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimaryKey_PrimaryKey(), ecorePackage.getEBoolean(), "primaryKey", null, 0, 1, PrimaryKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(autoIncrementEClass, AutoIncrement.class, "AutoIncrement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAutoIncrement_AutoIncrement(), ecorePackage.getEBoolean(), "autoIncrement", null, 0, 1, AutoIncrement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullableEClass, Nullable.class, "Nullable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullable_Nullable(), ecorePackage.getEBoolean(), "nullable", null, 0, 1, Nullable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(foreignKeyEClass, ForeignKey.class, "ForeignKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getForeignKey_TableName(), ecorePackage.getEString(), "tableName", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getForeignKey_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, ForeignKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DSDLPackageImpl
