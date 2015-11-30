/**
 */
package com.dsdl.dSDL.impl;

import com.dsdl.dSDL.AutoIncrement;
import com.dsdl.dSDL.DSDLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Increment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.impl.AutoIncrementImpl#isAutoIncrement <em>Auto Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AutoIncrementImpl extends PropertyImpl implements AutoIncrement
{
  /**
   * The default value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoIncrement()
   * @generated
   * @ordered
   */
  protected static final boolean AUTO_INCREMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAutoIncrement() <em>Auto Increment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAutoIncrement()
   * @generated
   * @ordered
   */
  protected boolean autoIncrement = AUTO_INCREMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AutoIncrementImpl()
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
    return DSDLPackage.Literals.AUTO_INCREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAutoIncrement()
  {
    return autoIncrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoIncrement(boolean newAutoIncrement)
  {
    boolean oldAutoIncrement = autoIncrement;
    autoIncrement = newAutoIncrement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSDLPackage.AUTO_INCREMENT__AUTO_INCREMENT, oldAutoIncrement, autoIncrement));
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
      case DSDLPackage.AUTO_INCREMENT__AUTO_INCREMENT:
        return isAutoIncrement();
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
      case DSDLPackage.AUTO_INCREMENT__AUTO_INCREMENT:
        setAutoIncrement((Boolean)newValue);
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
      case DSDLPackage.AUTO_INCREMENT__AUTO_INCREMENT:
        setAutoIncrement(AUTO_INCREMENT_EDEFAULT);
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
      case DSDLPackage.AUTO_INCREMENT__AUTO_INCREMENT:
        return autoIncrement != AUTO_INCREMENT_EDEFAULT;
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
    result.append(" (autoIncrement: ");
    result.append(autoIncrement);
    result.append(')');
    return result.toString();
  }

} //AutoIncrementImpl
