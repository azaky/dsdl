/**
 */
package com.dsdl.dSDL.impl;

import com.dsdl.dSDL.Attribute;
import com.dsdl.dSDL.DSDLPackage;
import com.dsdl.dSDL.Property;
import com.dsdl.dSDL.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.dsdl.dSDL.impl.AttributeImpl#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link com.dsdl.dSDL.impl.AttributeImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.dsdl.dSDL.impl.AttributeImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected static final String ATTRIBUTE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAttributeName() <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeName()
   * @generated
   * @ordered
   */
  protected String attributeName = ATTRIBUTE_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EList<Property> property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return DSDLPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAttributeName()
  {
    return attributeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeName(String newAttributeName)
  {
    String oldAttributeName = attributeName;
    attributeName = newAttributeName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSDLPackage.ATTRIBUTE__ATTRIBUTE_NAME, oldAttributeName, attributeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DSDLPackage.ATTRIBUTE__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DSDLPackage.ATTRIBUTE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DSDLPackage.ATTRIBUTE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSDLPackage.ATTRIBUTE__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Property> getProperty()
  {
    if (property == null)
    {
      property = new EObjectContainmentEList<Property>(Property.class, this, DSDLPackage.ATTRIBUTE__PROPERTY);
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DSDLPackage.ATTRIBUTE__TYPE:
        return basicSetType(null, msgs);
      case DSDLPackage.ATTRIBUTE__PROPERTY:
        return ((InternalEList<?>)getProperty()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DSDLPackage.ATTRIBUTE__ATTRIBUTE_NAME:
        return getAttributeName();
      case DSDLPackage.ATTRIBUTE__TYPE:
        return getType();
      case DSDLPackage.ATTRIBUTE__PROPERTY:
        return getProperty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DSDLPackage.ATTRIBUTE__ATTRIBUTE_NAME:
        setAttributeName((String)newValue);
        return;
      case DSDLPackage.ATTRIBUTE__TYPE:
        setType((Type)newValue);
        return;
      case DSDLPackage.ATTRIBUTE__PROPERTY:
        getProperty().clear();
        getProperty().addAll((Collection<? extends Property>)newValue);
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
      case DSDLPackage.ATTRIBUTE__ATTRIBUTE_NAME:
        setAttributeName(ATTRIBUTE_NAME_EDEFAULT);
        return;
      case DSDLPackage.ATTRIBUTE__TYPE:
        setType((Type)null);
        return;
      case DSDLPackage.ATTRIBUTE__PROPERTY:
        getProperty().clear();
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
      case DSDLPackage.ATTRIBUTE__ATTRIBUTE_NAME:
        return ATTRIBUTE_NAME_EDEFAULT == null ? attributeName != null : !ATTRIBUTE_NAME_EDEFAULT.equals(attributeName);
      case DSDLPackage.ATTRIBUTE__TYPE:
        return type != null;
      case DSDLPackage.ATTRIBUTE__PROPERTY:
        return property != null && !property.isEmpty();
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
    result.append(" (attributeName: ");
    result.append(attributeName);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
