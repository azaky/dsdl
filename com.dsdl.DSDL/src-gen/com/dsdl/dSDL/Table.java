/**
 */
package com.dsdl.dSDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.Table#getName <em>Name</em>}</li>
 *   <li>{@link com.dsdl.dSDL.Table#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see com.dsdl.dSDL.DSDLPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.dsdl.dSDL.DSDLPackage#getTable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.dsdl.dSDL.Table#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link com.dsdl.dSDL.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see com.dsdl.dSDL.DSDLPackage#getTable_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // Table
