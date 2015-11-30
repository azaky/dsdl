/**
 */
package com.dsdl.dSDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Varchar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.Varchar#getVarchar <em>Varchar</em>}</li>
 *   <li>{@link com.dsdl.dSDL.Varchar#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getVarchar()
 * @model
 * @generated
 */
public interface Varchar extends Type
{
  /**
   * Returns the value of the '<em><b>Varchar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Varchar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Varchar</em>' attribute.
   * @see #setVarchar(String)
   * @see com.dsdl.dSDL.DSDLPackage#getVarchar_Varchar()
   * @model
   * @generated
   */
  String getVarchar();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Varchar#getVarchar <em>Varchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Varchar</em>' attribute.
   * @see #getVarchar()
   * @generated
   */
  void setVarchar(String value);

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute.
   * @see #setLength(int)
   * @see com.dsdl.dSDL.DSDLPackage#getVarchar_Length()
   * @model
   * @generated
   */
  int getLength();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Varchar#getLength <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Length</em>' attribute.
   * @see #getLength()
   * @generated
   */
  void setLength(int value);

} // Varchar
