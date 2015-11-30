/**
 */
package com.dsdl.dSDL.util;

import com.dsdl.dSDL.Attribute;
import com.dsdl.dSDL.AutoIncrement;
import com.dsdl.dSDL.DSDLPackage;
import com.dsdl.dSDL.Database;
import com.dsdl.dSDL.DateTime;
import com.dsdl.dSDL.ForeignKey;
import com.dsdl.dSDL.Nullable;
import com.dsdl.dSDL.PrimaryKey;
import com.dsdl.dSDL.Property;
import com.dsdl.dSDL.Table;
import com.dsdl.dSDL.Text;
import com.dsdl.dSDL.Type;
import com.dsdl.dSDL.Varchar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.dsdl.dSDL.DSDLPackage
 * @generated
 */
public class DSDLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSDLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSDLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DSDLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DSDLPackage.DATABASE:
      {
        Database database = (Database)theEObject;
        T result = caseDatabase(database);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.TABLE:
      {
        Table table = (Table)theEObject;
        T result = caseTable(table);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.INTEGER:
      {
        com.dsdl.dSDL.Integer integer = (com.dsdl.dSDL.Integer)theEObject;
        T result = caseInteger(integer);
        if (result == null) result = caseType(integer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.VARCHAR:
      {
        Varchar varchar = (Varchar)theEObject;
        T result = caseVarchar(varchar);
        if (result == null) result = caseType(varchar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.TEXT:
      {
        Text text = (Text)theEObject;
        T result = caseText(text);
        if (result == null) result = caseType(text);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.DATE_TIME:
      {
        DateTime dateTime = (DateTime)theEObject;
        T result = caseDateTime(dateTime);
        if (result == null) result = caseType(dateTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.PRIMARY_KEY:
      {
        PrimaryKey primaryKey = (PrimaryKey)theEObject;
        T result = casePrimaryKey(primaryKey);
        if (result == null) result = caseProperty(primaryKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.AUTO_INCREMENT:
      {
        AutoIncrement autoIncrement = (AutoIncrement)theEObject;
        T result = caseAutoIncrement(autoIncrement);
        if (result == null) result = caseProperty(autoIncrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.NULLABLE:
      {
        Nullable nullable = (Nullable)theEObject;
        T result = caseNullable(nullable);
        if (result == null) result = caseProperty(nullable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DSDLPackage.FOREIGN_KEY:
      {
        ForeignKey foreignKey = (ForeignKey)theEObject;
        T result = caseForeignKey(foreignKey);
        if (result == null) result = caseProperty(foreignKey);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabase(Database object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Table</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTable(Table object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInteger(com.dsdl.dSDL.Integer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Varchar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Varchar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarchar(Varchar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseText(Text object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDateTime(DateTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primary Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimaryKey(PrimaryKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Auto Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Auto Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAutoIncrement(AutoIncrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nullable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nullable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullable(Nullable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foreign Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForeignKey(ForeignKey object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DSDLSwitch
