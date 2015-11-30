/**
 */
package com.dsdl.dSDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.PrimaryKey#isPrimaryKey <em>Primary Key</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Property
{
  /**
   * Returns the value of the '<em><b>Primary Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary Key</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary Key</em>' attribute.
   * @see #setPrimaryKey(boolean)
   * @see com.dsdl.dSDL.DSDLPackage#getPrimaryKey_PrimaryKey()
   * @model
   * @generated
   */
  boolean isPrimaryKey();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.PrimaryKey#isPrimaryKey <em>Primary Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary Key</em>' attribute.
   * @see #isPrimaryKey()
   * @generated
   */
  void setPrimaryKey(boolean value);

} // PrimaryKey
