/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgdFactoryImpl extends EFactoryImpl implements SvgdFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SvgdFactory init()
  {
    try
    {
      SvgdFactory theSvgdFactory = (SvgdFactory)EPackage.Registry.INSTANCE.getEFactory("http://devtool.sourceforge.net/language/svgd"); 
      if (theSvgdFactory != null)
      {
        return theSvgdFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SvgdFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgdFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SvgdPackage.RECHTECK: return createRechteck();
      case SvgdPackage.KREIS: return createKreis();
      case SvgdPackage.SVG_MODEL: return createSVGModel();
      case SvgdPackage.LINIE: return createLinie();
      case SvgdPackage.FIGURE: return createFigure();
      case SvgdPackage.IMPORT: return createImport();
      case SvgdPackage.EMBED_FORM: return createEmbedForm();
      case SvgdPackage.LINIEN_STIL: return createLinienStil();
      case SvgdPackage.FLAECHEN_STIL: return createFlaechenStil();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SvgdPackage.LINIENART:
        return createLinienartFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case SvgdPackage.LINIENART:
        return convertLinienartToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rechteck createRechteck()
  {
    RechteckImpl rechteck = new RechteckImpl();
    return rechteck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Kreis createKreis()
  {
    KreisImpl kreis = new KreisImpl();
    return kreis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SVGModel createSVGModel()
  {
    SVGModelImpl svgModel = new SVGModelImpl();
    return svgModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Linie createLinie()
  {
    LinieImpl linie = new LinieImpl();
    return linie;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Figure createFigure()
  {
    FigureImpl figure = new FigureImpl();
    return figure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmbedForm createEmbedForm()
  {
    EmbedFormImpl embedForm = new EmbedFormImpl();
    return embedForm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinienStil createLinienStil()
  {
    LinienStilImpl linienStil = new LinienStilImpl();
    return linienStil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlaechenStil createFlaechenStil()
  {
    FlaechenStilImpl flaechenStil = new FlaechenStilImpl();
    return flaechenStil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Linienart createLinienartFromString(EDataType eDataType, String initialValue)
  {
    Linienart result = Linienart.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLinienartToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgdPackage getSvgdPackage()
  {
    return (SvgdPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SvgdPackage getPackage()
  {
    return SvgdPackage.eINSTANCE;
  }

} //SvgdFactoryImpl
