/**
 */
package com.dsdl.dSDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.ForeignKey#getTableName <em>Table Name</em>}</li>
 *   <li>{@link com.dsdl.dSDL.ForeignKey#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Property
{
  /**
   * Returns the value of the '<em><b>Table Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Table Name</em>' attribute.
   * @see #setTableName(String)
   * @see com.dsdl.dSDL.DSDLPackage#getForeignKey_TableName()
   * @model
   * @generated
   */
  String getTableName();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.ForeignKey#getTableName <em>Table Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Table Name</em>' attribute.
   * @see #getTableName()
   * @generated
   */
  void setTableName(String value);

  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' attribute.
   * @see #setAttributeName(String)
   * @see com.dsdl.dSDL.DSDLPackage#getForeignKey_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.ForeignKey#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

} // ForeignKey
