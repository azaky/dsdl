/**
 */
package com.dsdl.dSDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nullable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.Nullable#isNullable <em>Nullable</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getNullable()
 * @model
 * @generated
 */
public interface Nullable extends Property
{
  /**
   * Returns the value of the '<em><b>Nullable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nullable</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nullable</em>' attribute.
   * @see #setNullable(boolean)
   * @see com.dsdl.dSDL.DSDLPackage#getNullable_Nullable()
   * @model
   * @generated
   */
  boolean isNullable();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Nullable#isNullable <em>Nullable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nullable</em>' attribute.
   * @see #isNullable()
   * @generated
   */
  void setNullable(boolean value);

} // Nullable
