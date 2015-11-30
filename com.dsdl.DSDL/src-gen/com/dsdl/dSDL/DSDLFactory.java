/**
 */
package com.dsdl.dSDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.dsdl.dSDL.DSDLPackage
 * @generated
 */
public interface DSDLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DSDLFactory eINSTANCE = com.dsdl.dSDL.impl.DSDLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database</em>'.
   * @generated
   */
  Database createDatabase();

  /**
   * Returns a new object of class '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Table</em>'.
   * @generated
   */
  Table createTable();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer</em>'.
   * @generated
   */
  Integer createInteger();

  /**
   * Returns a new object of class '<em>Varchar</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Varchar</em>'.
   * @generated
   */
  Varchar createVarchar();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  Text createText();

  /**
   * Returns a new object of class '<em>Date Time</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date Time</em>'.
   * @generated
   */
  DateTime createDateTime();

  /**
   * Returns a new object of class '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Key</em>'.
   * @generated
   */
  PrimaryKey createPrimaryKey();

  /**
   * Returns a new object of class '<em>Auto Increment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Auto Increment</em>'.
   * @generated
   */
  AutoIncrement createAutoIncrement();

  /**
   * Returns a new object of class '<em>Nullable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nullable</em>'.
   * @generated
   */
  Nullable createNullable();

  /**
   * Returns a new object of class '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreign Key</em>'.
   * @generated
   */
  ForeignKey createForeignKey();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DSDLPackage getDSDLPackage();

} //DSDLFactory
