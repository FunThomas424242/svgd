/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gh.funthomas424242.svgd.SvgdFactory
 * @model kind="package"
 * @generated
 */
public interface SvgdPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "svgd";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://devtool.sourceforge.net/language/svgd";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "svgd";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SvgdPackage eINSTANCE = gh.funthomas424242.svgd.impl.SvgdPackageImpl.init();

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.NamedElementImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.FormImpl <em>Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.FormImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getForm()
   * @generated
   */
  int FORM = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.RechteckImpl <em>Rechteck</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.RechteckImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getRechteck()
   * @generated
   */
  int RECHTECK = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK__NAME = FORM__NAME;

  /**
   * The feature id for the '<em><b>Hoehe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK__HOEHE = FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Breite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK__BREITE = FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lineprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK__LINEPROPS = FORM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Areaprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK__AREAPROPS = FORM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Rechteck</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECHTECK_FEATURE_COUNT = FORM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.KreisImpl <em>Kreis</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.KreisImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getKreis()
   * @generated
   */
  int KREIS = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KREIS__NAME = FORM__NAME;

  /**
   * The feature id for the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KREIS__RADIUS = FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lineprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KREIS__LINEPROPS = FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Areaprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KREIS__AREAPROPS = FORM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Kreis</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KREIS_FEATURE_COUNT = FORM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.SVGModelImpl <em>SVG Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.SVGModelImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getSVGModel()
   * @generated
   */
  int SVG_MODEL = 4;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__ELEMENTS = 0;

  /**
   * The feature id for the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__FILE_NAME = 1;

  /**
   * The feature id for the '<em><b>Hoehe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__HOEHE = 2;

  /**
   * The feature id for the '<em><b>Breite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__BREITE = 3;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__IMPORTS = 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL__VERSION = 5;

  /**
   * The number of structural features of the '<em>SVG Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SVG_MODEL_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.LinieImpl <em>Linie</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.LinieImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinie()
   * @generated
   */
  int LINIE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIE__NAME = FORM__NAME;

  /**
   * The feature id for the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIE__X2 = FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIE__Y2 = FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Lineprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIE__LINEPROPS = FORM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Linie</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIE_FEATURE_COUNT = FORM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.FigureImpl <em>Figure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.FigureImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getFigure()
   * @generated
   */
  int FIGURE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE__NAME = FORM__NAME;

  /**
   * The feature id for the '<em><b>Forms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE__FORMS = FORM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE__X = FORM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE__Y = FORM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Figure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIGURE_FEATURE_COUNT = FORM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.ImportImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 7;

  /**
   * The feature id for the '<em><b>Imported Ressource</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_RESSOURCE = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.EmbedFormImpl <em>Embed Form</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.EmbedFormImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getEmbedForm()
   * @generated
   */
  int EMBED_FORM = 8;

  /**
   * The feature id for the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_FORM__X = 0;

  /**
   * The feature id for the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_FORM__Y = 1;

  /**
   * The feature id for the '<em><b>Form</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_FORM__FORM = 2;

  /**
   * The number of structural features of the '<em>Embed Form</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMBED_FORM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.LinienStilImpl <em>Linien Stil</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.LinienStilImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinienStil()
   * @generated
   */
  int LINIEN_STIL = 9;

  /**
   * The feature id for the '<em><b>Zug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIEN_STIL__ZUG = 0;

  /**
   * The feature id for the '<em><b>Dicke</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIEN_STIL__DICKE = 1;

  /**
   * The feature id for the '<em><b>Farbe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIEN_STIL__FARBE = 2;

  /**
   * The number of structural features of the '<em>Linien Stil</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINIEN_STIL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.impl.FlaechenStilImpl <em>Flaechen Stil</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.impl.FlaechenStilImpl
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getFlaechenStil()
   * @generated
   */
  int FLAECHEN_STIL = 10;

  /**
   * The feature id for the '<em><b>Fuellung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAECHEN_STIL__FUELLUNG = 0;

  /**
   * The feature id for the '<em><b>Muster</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAECHEN_STIL__MUSTER = 1;

  /**
   * The number of structural features of the '<em>Flaechen Stil</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLAECHEN_STIL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link gh.funthomas424242.svgd.Linienart <em>Linienart</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see gh.funthomas424242.svgd.Linienart
   * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinienart()
   * @generated
   */
  int LINIENART = 11;


  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see gh.funthomas424242.svgd.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see gh.funthomas424242.svgd.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Form <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Form</em>'.
   * @see gh.funthomas424242.svgd.Form
   * @generated
   */
  EClass getForm();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Rechteck <em>Rechteck</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rechteck</em>'.
   * @see gh.funthomas424242.svgd.Rechteck
   * @generated
   */
  EClass getRechteck();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Rechteck#getHoehe <em>Hoehe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hoehe</em>'.
   * @see gh.funthomas424242.svgd.Rechteck#getHoehe()
   * @see #getRechteck()
   * @generated
   */
  EAttribute getRechteck_Hoehe();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Rechteck#getBreite <em>Breite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Breite</em>'.
   * @see gh.funthomas424242.svgd.Rechteck#getBreite()
   * @see #getRechteck()
   * @generated
   */
  EAttribute getRechteck_Breite();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.Rechteck#getLineprops <em>Lineprops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineprops</em>'.
   * @see gh.funthomas424242.svgd.Rechteck#getLineprops()
   * @see #getRechteck()
   * @generated
   */
  EReference getRechteck_Lineprops();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.Rechteck#getAreaprops <em>Areaprops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Areaprops</em>'.
   * @see gh.funthomas424242.svgd.Rechteck#getAreaprops()
   * @see #getRechteck()
   * @generated
   */
  EReference getRechteck_Areaprops();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Kreis <em>Kreis</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Kreis</em>'.
   * @see gh.funthomas424242.svgd.Kreis
   * @generated
   */
  EClass getKreis();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Kreis#getRadius <em>Radius</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Radius</em>'.
   * @see gh.funthomas424242.svgd.Kreis#getRadius()
   * @see #getKreis()
   * @generated
   */
  EAttribute getKreis_Radius();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.Kreis#getLineprops <em>Lineprops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineprops</em>'.
   * @see gh.funthomas424242.svgd.Kreis#getLineprops()
   * @see #getKreis()
   * @generated
   */
  EReference getKreis_Lineprops();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.Kreis#getAreaprops <em>Areaprops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Areaprops</em>'.
   * @see gh.funthomas424242.svgd.Kreis#getAreaprops()
   * @see #getKreis()
   * @generated
   */
  EReference getKreis_Areaprops();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.SVGModel <em>SVG Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SVG Model</em>'.
   * @see gh.funthomas424242.svgd.SVGModel
   * @generated
   */
  EClass getSVGModel();

  /**
   * Returns the meta object for the containment reference list '{@link gh.funthomas424242.svgd.SVGModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getElements()
   * @see #getSVGModel()
   * @generated
   */
  EReference getSVGModel_Elements();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.SVGModel#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File Name</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getFileName()
   * @see #getSVGModel()
   * @generated
   */
  EAttribute getSVGModel_FileName();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.SVGModel#getHoehe <em>Hoehe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hoehe</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getHoehe()
   * @see #getSVGModel()
   * @generated
   */
  EAttribute getSVGModel_Hoehe();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.SVGModel#getBreite <em>Breite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Breite</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getBreite()
   * @see #getSVGModel()
   * @generated
   */
  EAttribute getSVGModel_Breite();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.SVGModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getImports()
   * @see #getSVGModel()
   * @generated
   */
  EReference getSVGModel_Imports();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.SVGModel#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see gh.funthomas424242.svgd.SVGModel#getVersion()
   * @see #getSVGModel()
   * @generated
   */
  EAttribute getSVGModel_Version();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Linie <em>Linie</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linie</em>'.
   * @see gh.funthomas424242.svgd.Linie
   * @generated
   */
  EClass getLinie();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Linie#getX2 <em>X2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X2</em>'.
   * @see gh.funthomas424242.svgd.Linie#getX2()
   * @see #getLinie()
   * @generated
   */
  EAttribute getLinie_X2();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Linie#getY2 <em>Y2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y2</em>'.
   * @see gh.funthomas424242.svgd.Linie#getY2()
   * @see #getLinie()
   * @generated
   */
  EAttribute getLinie_Y2();

  /**
   * Returns the meta object for the containment reference '{@link gh.funthomas424242.svgd.Linie#getLineprops <em>Lineprops</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lineprops</em>'.
   * @see gh.funthomas424242.svgd.Linie#getLineprops()
   * @see #getLinie()
   * @generated
   */
  EReference getLinie_Lineprops();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Figure <em>Figure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Figure</em>'.
   * @see gh.funthomas424242.svgd.Figure
   * @generated
   */
  EClass getFigure();

  /**
   * Returns the meta object for the containment reference list '{@link gh.funthomas424242.svgd.Figure#getForms <em>Forms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Forms</em>'.
   * @see gh.funthomas424242.svgd.Figure#getForms()
   * @see #getFigure()
   * @generated
   */
  EReference getFigure_Forms();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Figure#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see gh.funthomas424242.svgd.Figure#getX()
   * @see #getFigure()
   * @generated
   */
  EAttribute getFigure_X();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.Figure#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see gh.funthomas424242.svgd.Figure#getY()
   * @see #getFigure()
   * @generated
   */
  EAttribute getFigure_Y();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see gh.funthomas424242.svgd.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the reference list '{@link gh.funthomas424242.svgd.Import#getImportedRessource <em>Imported Ressource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Ressource</em>'.
   * @see gh.funthomas424242.svgd.Import#getImportedRessource()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportedRessource();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.EmbedForm <em>Embed Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Embed Form</em>'.
   * @see gh.funthomas424242.svgd.EmbedForm
   * @generated
   */
  EClass getEmbedForm();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.EmbedForm#getX <em>X</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>X</em>'.
   * @see gh.funthomas424242.svgd.EmbedForm#getX()
   * @see #getEmbedForm()
   * @generated
   */
  EAttribute getEmbedForm_X();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.EmbedForm#getY <em>Y</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Y</em>'.
   * @see gh.funthomas424242.svgd.EmbedForm#getY()
   * @see #getEmbedForm()
   * @generated
   */
  EAttribute getEmbedForm_Y();

  /**
   * Returns the meta object for the reference '{@link gh.funthomas424242.svgd.EmbedForm#getForm <em>Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Form</em>'.
   * @see gh.funthomas424242.svgd.EmbedForm#getForm()
   * @see #getEmbedForm()
   * @generated
   */
  EReference getEmbedForm_Form();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.LinienStil <em>Linien Stil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Linien Stil</em>'.
   * @see gh.funthomas424242.svgd.LinienStil
   * @generated
   */
  EClass getLinienStil();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.LinienStil#getZug <em>Zug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Zug</em>'.
   * @see gh.funthomas424242.svgd.LinienStil#getZug()
   * @see #getLinienStil()
   * @generated
   */
  EAttribute getLinienStil_Zug();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.LinienStil#getDicke <em>Dicke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dicke</em>'.
   * @see gh.funthomas424242.svgd.LinienStil#getDicke()
   * @see #getLinienStil()
   * @generated
   */
  EAttribute getLinienStil_Dicke();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.LinienStil#getFarbe <em>Farbe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Farbe</em>'.
   * @see gh.funthomas424242.svgd.LinienStil#getFarbe()
   * @see #getLinienStil()
   * @generated
   */
  EAttribute getLinienStil_Farbe();

  /**
   * Returns the meta object for class '{@link gh.funthomas424242.svgd.FlaechenStil <em>Flaechen Stil</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flaechen Stil</em>'.
   * @see gh.funthomas424242.svgd.FlaechenStil
   * @generated
   */
  EClass getFlaechenStil();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.FlaechenStil#getFuellung <em>Fuellung</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fuellung</em>'.
   * @see gh.funthomas424242.svgd.FlaechenStil#getFuellung()
   * @see #getFlaechenStil()
   * @generated
   */
  EAttribute getFlaechenStil_Fuellung();

  /**
   * Returns the meta object for the attribute '{@link gh.funthomas424242.svgd.FlaechenStil#getMuster <em>Muster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Muster</em>'.
   * @see gh.funthomas424242.svgd.FlaechenStil#getMuster()
   * @see #getFlaechenStil()
   * @generated
   */
  EAttribute getFlaechenStil_Muster();

  /**
   * Returns the meta object for enum '{@link gh.funthomas424242.svgd.Linienart <em>Linienart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Linienart</em>'.
   * @see gh.funthomas424242.svgd.Linienart
   * @generated
   */
  EEnum getLinienart();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SvgdFactory getSvgdFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.NamedElementImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.FormImpl <em>Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.FormImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getForm()
     * @generated
     */
    EClass FORM = eINSTANCE.getForm();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.RechteckImpl <em>Rechteck</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.RechteckImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getRechteck()
     * @generated
     */
    EClass RECHTECK = eINSTANCE.getRechteck();

    /**
     * The meta object literal for the '<em><b>Hoehe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECHTECK__HOEHE = eINSTANCE.getRechteck_Hoehe();

    /**
     * The meta object literal for the '<em><b>Breite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECHTECK__BREITE = eINSTANCE.getRechteck_Breite();

    /**
     * The meta object literal for the '<em><b>Lineprops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECHTECK__LINEPROPS = eINSTANCE.getRechteck_Lineprops();

    /**
     * The meta object literal for the '<em><b>Areaprops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECHTECK__AREAPROPS = eINSTANCE.getRechteck_Areaprops();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.KreisImpl <em>Kreis</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.KreisImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getKreis()
     * @generated
     */
    EClass KREIS = eINSTANCE.getKreis();

    /**
     * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KREIS__RADIUS = eINSTANCE.getKreis_Radius();

    /**
     * The meta object literal for the '<em><b>Lineprops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KREIS__LINEPROPS = eINSTANCE.getKreis_Lineprops();

    /**
     * The meta object literal for the '<em><b>Areaprops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KREIS__AREAPROPS = eINSTANCE.getKreis_Areaprops();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.SVGModelImpl <em>SVG Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.SVGModelImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getSVGModel()
     * @generated
     */
    EClass SVG_MODEL = eINSTANCE.getSVGModel();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SVG_MODEL__ELEMENTS = eINSTANCE.getSVGModel_Elements();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SVG_MODEL__FILE_NAME = eINSTANCE.getSVGModel_FileName();

    /**
     * The meta object literal for the '<em><b>Hoehe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SVG_MODEL__HOEHE = eINSTANCE.getSVGModel_Hoehe();

    /**
     * The meta object literal for the '<em><b>Breite</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SVG_MODEL__BREITE = eINSTANCE.getSVGModel_Breite();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SVG_MODEL__IMPORTS = eINSTANCE.getSVGModel_Imports();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SVG_MODEL__VERSION = eINSTANCE.getSVGModel_Version();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.LinieImpl <em>Linie</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.LinieImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinie()
     * @generated
     */
    EClass LINIE = eINSTANCE.getLinie();

    /**
     * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINIE__X2 = eINSTANCE.getLinie_X2();

    /**
     * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINIE__Y2 = eINSTANCE.getLinie_Y2();

    /**
     * The meta object literal for the '<em><b>Lineprops</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINIE__LINEPROPS = eINSTANCE.getLinie_Lineprops();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.FigureImpl <em>Figure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.FigureImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getFigure()
     * @generated
     */
    EClass FIGURE = eINSTANCE.getFigure();

    /**
     * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIGURE__FORMS = eINSTANCE.getFigure_Forms();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIGURE__X = eINSTANCE.getFigure_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIGURE__Y = eINSTANCE.getFigure_Y();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.ImportImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Ressource</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORTED_RESSOURCE = eINSTANCE.getImport_ImportedRessource();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.EmbedFormImpl <em>Embed Form</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.EmbedFormImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getEmbedForm()
     * @generated
     */
    EClass EMBED_FORM = eINSTANCE.getEmbedForm();

    /**
     * The meta object literal for the '<em><b>X</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMBED_FORM__X = eINSTANCE.getEmbedForm_X();

    /**
     * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EMBED_FORM__Y = eINSTANCE.getEmbedForm_Y();

    /**
     * The meta object literal for the '<em><b>Form</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMBED_FORM__FORM = eINSTANCE.getEmbedForm_Form();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.LinienStilImpl <em>Linien Stil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.LinienStilImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinienStil()
     * @generated
     */
    EClass LINIEN_STIL = eINSTANCE.getLinienStil();

    /**
     * The meta object literal for the '<em><b>Zug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINIEN_STIL__ZUG = eINSTANCE.getLinienStil_Zug();

    /**
     * The meta object literal for the '<em><b>Dicke</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINIEN_STIL__DICKE = eINSTANCE.getLinienStil_Dicke();

    /**
     * The meta object literal for the '<em><b>Farbe</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINIEN_STIL__FARBE = eINSTANCE.getLinienStil_Farbe();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.impl.FlaechenStilImpl <em>Flaechen Stil</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.impl.FlaechenStilImpl
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getFlaechenStil()
     * @generated
     */
    EClass FLAECHEN_STIL = eINSTANCE.getFlaechenStil();

    /**
     * The meta object literal for the '<em><b>Fuellung</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLAECHEN_STIL__FUELLUNG = eINSTANCE.getFlaechenStil_Fuellung();

    /**
     * The meta object literal for the '<em><b>Muster</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLAECHEN_STIL__MUSTER = eINSTANCE.getFlaechenStil_Muster();

    /**
     * The meta object literal for the '{@link gh.funthomas424242.svgd.Linienart <em>Linienart</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see gh.funthomas424242.svgd.Linienart
     * @see gh.funthomas424242.svgd.impl.SvgdPackageImpl#getLinienart()
     * @generated
     */
    EEnum LINIENART = eINSTANCE.getLinienart();

  }

} //SvgdPackage
