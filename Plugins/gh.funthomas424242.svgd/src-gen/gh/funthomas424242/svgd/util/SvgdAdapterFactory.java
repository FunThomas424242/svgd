/**
 */
package gh.funthomas424242.svgd.util;

import gh.funthomas424242.svgd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gh.funthomas424242.svgd.SvgdPackage
 * @generated
 */
public class SvgdAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SvgdPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgdAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SvgdPackage.eINSTANCE;
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
  protected SvgdSwitch<Adapter> modelSwitch =
    new SvgdSwitch<Adapter>()
    {
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseForm(Form object)
      {
        return createFormAdapter();
      }
      @Override
      public Adapter caseRechteck(Rechteck object)
      {
        return createRechteckAdapter();
      }
      @Override
      public Adapter caseKreis(Kreis object)
      {
        return createKreisAdapter();
      }
      @Override
      public Adapter caseSVGModel(SVGModel object)
      {
        return createSVGModelAdapter();
      }
      @Override
      public Adapter caseLinie(Linie object)
      {
        return createLinieAdapter();
      }
      @Override
      public Adapter caseFigure(Figure object)
      {
        return createFigureAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter caseEmbedForm(EmbedForm object)
      {
        return createEmbedFormAdapter();
      }
      @Override
      public Adapter caseLinienStil(LinienStil object)
      {
        return createLinienStilAdapter();
      }
      @Override
      public Adapter caseFlaechenStil(FlaechenStil object)
      {
        return createFlaechenStilAdapter();
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
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Form
   * @generated
   */
  public Adapter createFormAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Rechteck <em>Rechteck</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Rechteck
   * @generated
   */
  public Adapter createRechteckAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Kreis <em>Kreis</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Kreis
   * @generated
   */
  public Adapter createKreisAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.SVGModel <em>SVG Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.SVGModel
   * @generated
   */
  public Adapter createSVGModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Linie <em>Linie</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Linie
   * @generated
   */
  public Adapter createLinieAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Figure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Figure
   * @generated
   */
  public Adapter createFigureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.EmbedForm <em>Embed Form</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.EmbedForm
   * @generated
   */
  public Adapter createEmbedFormAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.LinienStil <em>Linien Stil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.LinienStil
   * @generated
   */
  public Adapter createLinienStilAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link gh.funthomas424242.svgd.FlaechenStil <em>Flaechen Stil</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see gh.funthomas424242.svgd.FlaechenStil
   * @generated
   */
  public Adapter createFlaechenStilAdapter()
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

} //SvgdAdapterFactory
