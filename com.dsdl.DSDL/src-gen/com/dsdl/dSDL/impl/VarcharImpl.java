/**
 */
package com.dsdl.dSDL.impl;

import com.dsdl.dSDL.DSDLPackage;
import com.dsdl.dSDL.Varchar;

import java.lang.Integer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Varchar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.impl.VarcharImpl#getVarchar <em>Varchar</em>}</li>
 *   <li>{@link com.dsdl.dSDL.impl.VarcharImpl#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarcharImpl extends TypeImpl implements Varchar
{
  /**
   * The default value of the '{@link #getVarchar() <em>Varchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarchar()
   * @generated
   * @ordered
   */
  protected static final String VARCHAR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarchar() <em>Varchar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarchar()
   * @generated
   * @ordered
   */
  protected String varchar = VARCHAR_EDEFAULT;

  /**
   * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected static final int LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected int length = LENGTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarcharImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DSDLPackage.Literals.VARCHAR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVarchar()
  {
    return varchar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarchar(String newVarchar)
  {
    String oldVarchar = varchar;
    varchar = newVarchar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSDLPackage.VARCHAR__VARCHAR, oldVarchar, varchar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(int newLength)
  {
    int oldLength = length;
    length = newLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSDLPackage.VARCHAR__LENGTH, oldLength, length));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DSDLPackage.VARCHAR__VARCHAR:
        return getVarchar();
      case DSDLPackage.VARCHAR__LENGTH:
        return getLength();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSDLPackage.VARCHAR__VARCHAR:
        setVarchar((String)newValue);
        return;
      case DSDLPackage.VARCHAR__LENGTH:
        setLength((Integer)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DSDLPackage.VARCHAR__VARCHAR:
        setVarchar(VARCHAR_EDEFAULT);
        return;
      case DSDLPackage.VARCHAR__LENGTH:
        setLength(LENGTH_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DSDLPackage.VARCHAR__VARCHAR:
        return VARCHAR_EDEFAULT == null ? varchar != null : !VARCHAR_EDEFAULT.equals(varchar);
      case DSDLPackage.VARCHAR__LENGTH:
        return length != LENGTH_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (varchar: ");
    result.append(varchar);
    result.append(", length: ");
    result.append(length);
    result.append(')');
    return result.toString();
  }

} //VarcharImpl
