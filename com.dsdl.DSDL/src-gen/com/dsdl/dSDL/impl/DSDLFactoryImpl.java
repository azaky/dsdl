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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DSDLFactoryImpl extends EFactoryImpl implements DSDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSDLFactory init()
  {
    try
    {
      DSDLFactory theDSDLFactory = (DSDLFactory)EPackage.Registry.INSTANCE.getEFactory(DSDLPackage.eNS_URI);
      if (theDSDLFactory != null)
      {
        return theDSDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DSDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DSDLPackage.DATABASE: return createDatabase();
      case DSDLPackage.TABLE: return createTable();
      case DSDLPackage.ATTRIBUTE: return createAttribute();
      case DSDLPackage.TYPE: return createType();
      case DSDLPackage.PROPERTY: return createProperty();
      case DSDLPackage.INTEGER: return createInteger();
      case DSDLPackage.VARCHAR: return createVarchar();
      case DSDLPackage.TEXT: return createText();
      case DSDLPackage.DATE_TIME: return createDateTime();
      case DSDLPackage.PRIMARY_KEY: return createPrimaryKey();
      case DSDLPackage.AUTO_INCREMENT: return createAutoIncrement();
      case DSDLPackage.NULLABLE: return createNullable();
      case DSDLPackage.FOREIGN_KEY: return createForeignKey();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Database createDatabase()
  {
    DatabaseImpl database = new DatabaseImpl();
    return database;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Table createTable()
  {
    TableImpl table = new TableImpl();
    return table;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.dsdl.dSDL.Integer createInteger()
  {
    IntegerImpl integer = new IntegerImpl();
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Varchar createVarchar()
  {
    VarcharImpl varchar = new VarcharImpl();
    return varchar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Text createText()
  {
    TextImpl text = new TextImpl();
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateTime createDateTime()
  {
    DateTimeImpl dateTime = new DateTimeImpl();
    return dateTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryKey createPrimaryKey()
  {
    PrimaryKeyImpl primaryKey = new PrimaryKeyImpl();
    return primaryKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AutoIncrement createAutoIncrement()
  {
    AutoIncrementImpl autoIncrement = new AutoIncrementImpl();
    return autoIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nullable createNullable()
  {
    NullableImpl nullable = new NullableImpl();
    return nullable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForeignKey createForeignKey()
  {
    ForeignKeyImpl foreignKey = new ForeignKeyImpl();
    return foreignKey;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSDLPackage getDSDLPackage()
  {
    return (DSDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DSDLPackage getPackage()
  {
    return DSDLPackage.eINSTANCE;
  }

} //DSDLFactoryImpl
