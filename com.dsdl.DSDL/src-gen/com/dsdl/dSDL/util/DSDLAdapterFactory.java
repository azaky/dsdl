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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.dsdl.dSDL.DSDLPackage
 * @generated
 */
public class DSDLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DSDLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSDLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DSDLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DSDLSwitch<Adapter> modelSwitch =
    new DSDLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDatabase(Database object)
      {
        return createDatabaseAdapter();
      }
      @Override
      public Adapter caseTable(Table object)
      {
        return createTableAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseInteger(com.dsdl.dSDL.Integer object)
      {
        return createIntegerAdapter();
      }
      @Override
      public Adapter caseVarchar(Varchar object)
      {
        return createVarcharAdapter();
      }
      @Override
      public Adapter caseText(Text object)
      {
        return createTextAdapter();
      }
      @Override
      public Adapter caseDateTime(DateTime object)
      {
        return createDateTimeAdapter();
      }
      @Override
      public Adapter casePrimaryKey(PrimaryKey object)
      {
        return createPrimaryKeyAdapter();
      }
      @Override
      public Adapter caseAutoIncrement(AutoIncrement object)
      {
        return createAutoIncrementAdapter();
      }
      @Override
      public Adapter caseNullable(Nullable object)
      {
        return createNullableAdapter();
      }
      @Override
      public Adapter caseForeignKey(ForeignKey object)
      {
        return createForeignKeyAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Database <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Database
   * @generated
   */
  public Adapter createDatabaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Table <em>Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Table
   * @generated
   */
  public Adapter createTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Integer <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Integer
   * @generated
   */
  public Adapter createIntegerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Varchar <em>Varchar</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Varchar
   * @generated
   */
  public Adapter createVarcharAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Text <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Text
   * @generated
   */
  public Adapter createTextAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.DateTime <em>Date Time</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.DateTime
   * @generated
   */
  public Adapter createDateTimeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.PrimaryKey <em>Primary Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.PrimaryKey
   * @generated
   */
  public Adapter createPrimaryKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.AutoIncrement <em>Auto Increment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.AutoIncrement
   * @generated
   */
  public Adapter createAutoIncrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.Nullable <em>Nullable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.Nullable
   * @generated
   */
  public Adapter createNullableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.dsdl.dSDL.ForeignKey <em>Foreign Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.dsdl.dSDL.ForeignKey
   * @generated
   */
  public Adapter createForeignKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DSDLAdapterFactory
