/**
 */
package com.dsdl.dSDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.DateTime#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getDateTime()
 * @model
 * @generated
 */
public interface DateTime extends Type
{
  /**
   * Returns the value of the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date</em>' attribute.
   * @see #setDate(String)
   * @see com.dsdl.dSDL.DSDLPackage#getDateTime_Date()
   * @model
   * @generated
   */
  String getDate();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.DateTime#getDate <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date</em>' attribute.
   * @see #getDate()
   * @generated
   */
  void setDate(String value);

} // DateTime
