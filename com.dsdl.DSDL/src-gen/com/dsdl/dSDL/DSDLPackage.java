/**
 */
package com.dsdl.dSDL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.dsdl.dSDL.DSDLFactory
 * @model kind="package"
 * @generated
 */
public interface DSDLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dSDL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsdl.com/DSDL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dSDL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DSDLPackage eINSTANCE = com.dsdl.dSDL.impl.DSDLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.DatabaseImpl <em>Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.DatabaseImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getDatabase()
   * @generated
   */
  int DATABASE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__NAME = 0;

  /**
   * The feature id for the '<em><b>Table</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE__TABLE = 1;

  /**
   * The number of structural features of the '<em>Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.TableImpl <em>Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.TableImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getTable()
   * @generated
   */
  int TABLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE__ATTRIBUTE = 1;

  /**
   * The number of structural features of the '<em>Table</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.AttributeImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__PROPERTY = 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.TypeImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.PropertyImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.IntegerImpl <em>Integer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.IntegerImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getInteger()
   * @generated
   */
  int INTEGER = 5;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__INTEGER = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER__LENGTH = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Integer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.VarcharImpl <em>Varchar</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.VarcharImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getVarchar()
   * @generated
   */
  int VARCHAR = 6;

  /**
   * The feature id for the '<em><b>Varchar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARCHAR__VARCHAR = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARCHAR__LENGTH = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Varchar</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARCHAR_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.TextImpl <em>Text</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.TextImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getText()
   * @generated
   */
  int TEXT = 7;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT__TEXT = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Text</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.DateTimeImpl <em>Date Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.DateTimeImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getDateTime()
   * @generated
   */
  int DATE_TIME = 8;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME__DATE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_TIME_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.PrimaryKeyImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getPrimaryKey()
   * @generated
   */
  int PRIMARY_KEY = 9;

  /**
   * The feature id for the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY__PRIMARY_KEY = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primary Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_KEY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.AutoIncrementImpl <em>Auto Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.AutoIncrementImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getAutoIncrement()
   * @generated
   */
  int AUTO_INCREMENT = 10;

  /**
   * The feature id for the '<em><b>Auto Increment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_INCREMENT__AUTO_INCREMENT = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Auto Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTO_INCREMENT_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.NullableImpl <em>Nullable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.NullableImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getNullable()
   * @generated
   */
  int NULLABLE = 11;

  /**
   * The feature id for the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE__NULLABLE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nullable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULLABLE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.dsdl.dSDL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.dsdl.dSDL.impl.ForeignKeyImpl
   * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getForeignKey()
   * @generated
   */
  int FOREIGN_KEY = 12;

  /**
   * The feature id for the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__TABLE_NAME = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY__ATTRIBUTE_NAME = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Foreign Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOREIGN_KEY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database</em>'.
   * @see com.dsdl.dSDL.Database
   * @generated
   */
  EClass getDatabase();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Database#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsdl.dSDL.Database#getName()
   * @see #getDatabase()
   * @generated
   */
  EAttribute getDatabase_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.dsdl.dSDL.Database#getTable <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Table</em>'.
   * @see com.dsdl.dSDL.Database#getTable()
   * @see #getDatabase()
   * @generated
   */
  EReference getDatabase_Table();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Table</em>'.
   * @see com.dsdl.dSDL.Table
   * @generated
   */
  EClass getTable();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Table#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.dsdl.dSDL.Table#getName()
   * @see #getTable()
   * @generated
   */
  EAttribute getTable_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.dsdl.dSDL.Table#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attribute</em>'.
   * @see com.dsdl.dSDL.Table#getAttribute()
   * @see #getTable()
   * @generated
   */
  EReference getTable_Attribute();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.dsdl.dSDL.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see com.dsdl.dSDL.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for the containment reference '{@link com.dsdl.dSDL.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.dsdl.dSDL.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the containment reference list '{@link com.dsdl.dSDL.Attribute#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Property</em>'.
   * @see com.dsdl.dSDL.Attribute#getProperty()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Property();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.dsdl.dSDL.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see com.dsdl.dSDL.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer</em>'.
   * @see com.dsdl.dSDL.Integer
   * @generated
   */
  EClass getInteger();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Integer#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see com.dsdl.dSDL.Integer#getInteger()
   * @see #getInteger()
   * @generated
   */
  EAttribute getInteger_Integer();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Integer#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.dsdl.dSDL.Integer#getLength()
   * @see #getInteger()
   * @generated
   */
  EAttribute getInteger_Length();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Varchar <em>Varchar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Varchar</em>'.
   * @see com.dsdl.dSDL.Varchar
   * @generated
   */
  EClass getVarchar();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Varchar#getVarchar <em>Varchar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Varchar</em>'.
   * @see com.dsdl.dSDL.Varchar#getVarchar()
   * @see #getVarchar()
   * @generated
   */
  EAttribute getVarchar_Varchar();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Varchar#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see com.dsdl.dSDL.Varchar#getLength()
   * @see #getVarchar()
   * @generated
   */
  EAttribute getVarchar_Length();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text</em>'.
   * @see com.dsdl.dSDL.Text
   * @generated
   */
  EClass getText();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Text#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see com.dsdl.dSDL.Text#getText()
   * @see #getText()
   * @generated
   */
  EAttribute getText_Text();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.DateTime <em>Date Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date Time</em>'.
   * @see com.dsdl.dSDL.DateTime
   * @generated
   */
  EClass getDateTime();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.DateTime#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see com.dsdl.dSDL.DateTime#getDate()
   * @see #getDateTime()
   * @generated
   */
  EAttribute getDateTime_Date();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary Key</em>'.
   * @see com.dsdl.dSDL.PrimaryKey
   * @generated
   */
  EClass getPrimaryKey();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.PrimaryKey#isPrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primary Key</em>'.
   * @see com.dsdl.dSDL.PrimaryKey#isPrimaryKey()
   * @see #getPrimaryKey()
   * @generated
   */
  EAttribute getPrimaryKey_PrimaryKey();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.AutoIncrement <em>Auto Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Auto Increment</em>'.
   * @see com.dsdl.dSDL.AutoIncrement
   * @generated
   */
  EClass getAutoIncrement();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.AutoIncrement#isAutoIncrement <em>Auto Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auto Increment</em>'.
   * @see com.dsdl.dSDL.AutoIncrement#isAutoIncrement()
   * @see #getAutoIncrement()
   * @generated
   */
  EAttribute getAutoIncrement_AutoIncrement();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.Nullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nullable</em>'.
   * @see com.dsdl.dSDL.Nullable
   * @generated
   */
  EClass getNullable();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.Nullable#isNullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nullable</em>'.
   * @see com.dsdl.dSDL.Nullable#isNullable()
   * @see #getNullable()
   * @generated
   */
  EAttribute getNullable_Nullable();

  /**
   * Returns the meta object for class '{@link com.dsdl.dSDL.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Foreign Key</em>'.
   * @see com.dsdl.dSDL.ForeignKey
   * @generated
   */
  EClass getForeignKey();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.ForeignKey#getTableName <em>Table Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Table Name</em>'.
   * @see com.dsdl.dSDL.ForeignKey#getTableName()
   * @see #getForeignKey()
   * @generated
   */
  EAttribute getForeignKey_TableName();

  /**
   * Returns the meta object for the attribute '{@link com.dsdl.dSDL.ForeignKey#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see com.dsdl.dSDL.ForeignKey#getAttributeName()
   * @see #getForeignKey()
   * @generated
   */
  EAttribute getForeignKey_AttributeName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DSDLFactory getDSDLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.DatabaseImpl <em>Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.DatabaseImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getDatabase()
     * @generated
     */
    EClass DATABASE = eINSTANCE.getDatabase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE__NAME = eINSTANCE.getDatabase_Name();

    /**
     * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE__TABLE = eINSTANCE.getDatabase_Table();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.TableImpl <em>Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.TableImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getTable()
     * @generated
     */
    EClass TABLE = eINSTANCE.getTable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLE__ATTRIBUTE = eINSTANCE.getTable_Attribute();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.AttributeImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__PROPERTY = eINSTANCE.getAttribute_Property();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.TypeImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.PropertyImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.IntegerImpl <em>Integer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.IntegerImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getInteger()
     * @generated
     */
    EClass INTEGER = eINSTANCE.getInteger();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER__INTEGER = eINSTANCE.getInteger_Integer();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER__LENGTH = eINSTANCE.getInteger_Length();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.VarcharImpl <em>Varchar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.VarcharImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getVarchar()
     * @generated
     */
    EClass VARCHAR = eINSTANCE.getVarchar();

    /**
     * The meta object literal for the '<em><b>Varchar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARCHAR__VARCHAR = eINSTANCE.getVarchar_Varchar();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARCHAR__LENGTH = eINSTANCE.getVarchar_Length();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.TextImpl <em>Text</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.TextImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getText()
     * @generated
     */
    EClass TEXT = eINSTANCE.getText();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.DateTimeImpl <em>Date Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.DateTimeImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getDateTime()
     * @generated
     */
    EClass DATE_TIME = eINSTANCE.getDateTime();

    /**
     * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE_TIME__DATE = eINSTANCE.getDateTime_Date();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.PrimaryKeyImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getPrimaryKey()
     * @generated
     */
    EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

    /**
     * The meta object literal for the '<em><b>Primary Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY_KEY__PRIMARY_KEY = eINSTANCE.getPrimaryKey_PrimaryKey();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.AutoIncrementImpl <em>Auto Increment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.AutoIncrementImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getAutoIncrement()
     * @generated
     */
    EClass AUTO_INCREMENT = eINSTANCE.getAutoIncrement();

    /**
     * The meta object literal for the '<em><b>Auto Increment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTO_INCREMENT__AUTO_INCREMENT = eINSTANCE.getAutoIncrement_AutoIncrement();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.NullableImpl <em>Nullable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.NullableImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getNullable()
     * @generated
     */
    EClass NULLABLE = eINSTANCE.getNullable();

    /**
     * The meta object literal for the '<em><b>Nullable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULLABLE__NULLABLE = eINSTANCE.getNullable_Nullable();

    /**
     * The meta object literal for the '{@link com.dsdl.dSDL.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.dsdl.dSDL.impl.ForeignKeyImpl
     * @see com.dsdl.dSDL.impl.DSDLPackageImpl#getForeignKey()
     * @generated
     */
    EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

    /**
     * The meta object literal for the '<em><b>Table Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOREIGN_KEY__TABLE_NAME = eINSTANCE.getForeignKey_TableName();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FOREIGN_KEY__ATTRIBUTE_NAME = eINSTANCE.getForeignKey_AttributeName();

  }

} //DSDLPackage
