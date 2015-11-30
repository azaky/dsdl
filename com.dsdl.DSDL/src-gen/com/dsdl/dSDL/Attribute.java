/**
 */
package com.dsdl.dSDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.Attribute#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link com.dsdl.dSDL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link com.dsdl.dSDL.Attribute#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
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
   * @see com.dsdl.dSDL.DSDLPackage#getAttribute_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Attribute#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see com.dsdl.dSDL.DSDLPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' containment reference list.
   * The list contents are of type {@link com.dsdl.dSDL.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' containment reference list.
   * @see com.dsdl.dSDL.DSDLPackage#getAttribute_Property()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperty();

} // Attribute
