/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.EmbedForm;
import gh.funthomas424242.svgd.Figure;
import gh.funthomas424242.svgd.FlaechenStil;
import gh.funthomas424242.svgd.Form;
import gh.funthomas424242.svgd.Import;
import gh.funthomas424242.svgd.Kreis;
import gh.funthomas424242.svgd.Linie;
import gh.funthomas424242.svgd.LinienStil;
import gh.funthomas424242.svgd.Linienart;
import gh.funthomas424242.svgd.NamedElement;
import gh.funthomas424242.svgd.Rechteck;
import gh.funthomas424242.svgd.SVGModel;
import gh.funthomas424242.svgd.SvgdFactory;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SvgdPackageImpl extends EPackageImpl implements SvgdPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rechteckEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass kreisEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass svgModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linieEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass figureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass embedFormEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linienStilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass flaechenStilEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum linienartEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see gh.funthomas424242.svgd.SvgdPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SvgdPackageImpl()
  {
    super(eNS_URI, SvgdFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SvgdPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SvgdPackage init()
  {
    if (isInited) return (SvgdPackage)EPackage.Registry.INSTANCE.getEPackage(SvgdPackage.eNS_URI);

    // Obtain or create and register package
    SvgdPackageImpl theSvgdPackage = (SvgdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SvgdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SvgdPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSvgdPackage.createPackageContents();

    // Initialize created meta-data
    theSvgdPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSvgdPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SvgdPackage.eNS_URI, theSvgdPackage);
    return theSvgdPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedElement()
  {
    return namedElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamedElement_Name()
  {
    return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getForm()
  {
    return formEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRechteck()
  {
    return rechteckEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRechteck_Hoehe()
  {
    return (EAttribute)rechteckEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRechteck_Breite()
  {
    return (EAttribute)rechteckEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRechteck_Lineprops()
  {
    return (EReference)rechteckEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRechteck_Areaprops()
  {
    return (EReference)rechteckEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKreis()
  {
    return kreisEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKreis_Radius()
  {
    return (EAttribute)kreisEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKreis_Lineprops()
  {
    return (EReference)kreisEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKreis_Areaprops()
  {
    return (EReference)kreisEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSVGModel()
  {
    return svgModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGModel_Elements()
  {
    return (EReference)svgModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSVGModel_FileName()
  {
    return (EAttribute)svgModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSVGModel_Hoehe()
  {
    return (EAttribute)svgModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSVGModel_Breite()
  {
    return (EAttribute)svgModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSVGModel_Imports()
  {
    return (EReference)svgModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSVGModel_Version()
  {
    return (EAttribute)svgModelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinie()
  {
    return linieEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinie_X2()
  {
    return (EAttribute)linieEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinie_Y2()
  {
    return (EAttribute)linieEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLinie_Lineprops()
  {
    return (EReference)linieEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFigure()
  {
    return figureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFigure_Forms()
  {
    return (EReference)figureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFigure_X()
  {
    return (EAttribute)figureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFigure_Y()
  {
    return (EAttribute)figureEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport()
  {
    return importEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImport_ImportedRessource()
  {
    return (EReference)importEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEmbedForm()
  {
    return embedFormEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedForm_X()
  {
    return (EAttribute)embedFormEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEmbedForm_Y()
  {
    return (EAttribute)embedFormEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEmbedForm_Form()
  {
    return (EReference)embedFormEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLinienStil()
  {
    return linienStilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinienStil_Zug()
  {
    return (EAttribute)linienStilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinienStil_Dicke()
  {
    return (EAttribute)linienStilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLinienStil_Farbe()
  {
    return (EAttribute)linienStilEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFlaechenStil()
  {
    return flaechenStilEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlaechenStil_Fuellung()
  {
    return (EAttribute)flaechenStilEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFlaechenStil_Muster()
  {
    return (EAttribute)flaechenStilEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getLinienart()
  {
    return linienartEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgdFactory getSvgdFactory()
  {
    return (SvgdFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    namedElementEClass = createEClass(NAMED_ELEMENT);
    createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

    formEClass = createEClass(FORM);

    rechteckEClass = createEClass(RECHTECK);
    createEAttribute(rechteckEClass, RECHTECK__HOEHE);
    createEAttribute(rechteckEClass, RECHTECK__BREITE);
    createEReference(rechteckEClass, RECHTECK__LINEPROPS);
    createEReference(rechteckEClass, RECHTECK__AREAPROPS);

    kreisEClass = createEClass(KREIS);
    createEAttribute(kreisEClass, KREIS__RADIUS);
    createEReference(kreisEClass, KREIS__LINEPROPS);
    createEReference(kreisEClass, KREIS__AREAPROPS);

    svgModelEClass = createEClass(SVG_MODEL);
    createEReference(svgModelEClass, SVG_MODEL__ELEMENTS);
    createEAttribute(svgModelEClass, SVG_MODEL__FILE_NAME);
    createEAttribute(svgModelEClass, SVG_MODEL__HOEHE);
    createEAttribute(svgModelEClass, SVG_MODEL__BREITE);
    createEReference(svgModelEClass, SVG_MODEL__IMPORTS);
    createEAttribute(svgModelEClass, SVG_MODEL__VERSION);

    linieEClass = createEClass(LINIE);
    createEAttribute(linieEClass, LINIE__X2);
    createEAttribute(linieEClass, LINIE__Y2);
    createEReference(linieEClass, LINIE__LINEPROPS);

    figureEClass = createEClass(FIGURE);
    createEReference(figureEClass, FIGURE__FORMS);
    createEAttribute(figureEClass, FIGURE__X);
    createEAttribute(figureEClass, FIGURE__Y);

    importEClass = createEClass(IMPORT);
    createEReference(importEClass, IMPORT__IMPORTED_RESSOURCE);

    embedFormEClass = createEClass(EMBED_FORM);
    createEAttribute(embedFormEClass, EMBED_FORM__X);
    createEAttribute(embedFormEClass, EMBED_FORM__Y);
    createEReference(embedFormEClass, EMBED_FORM__FORM);

    linienStilEClass = createEClass(LINIEN_STIL);
    createEAttribute(linienStilEClass, LINIEN_STIL__ZUG);
    createEAttribute(linienStilEClass, LINIEN_STIL__DICKE);
    createEAttribute(linienStilEClass, LINIEN_STIL__FARBE);

    flaechenStilEClass = createEClass(FLAECHEN_STIL);
    createEAttribute(flaechenStilEClass, FLAECHEN_STIL__FUELLUNG);
    createEAttribute(flaechenStilEClass, FLAECHEN_STIL__MUSTER);

    // Create enums
    linienartEEnum = createEEnum(LINIENART);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    formEClass.getESuperTypes().add(this.getNamedElement());
    rechteckEClass.getESuperTypes().add(this.getForm());
    kreisEClass.getESuperTypes().add(this.getForm());
    linieEClass.getESuperTypes().add(this.getForm());
    figureEClass.getESuperTypes().add(this.getForm());

    // Initialize classes and features; add operations and parameters
    initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formEClass, Form.class, "Form", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rechteckEClass, Rechteck.class, "Rechteck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRechteck_Hoehe(), ecorePackage.getEFloat(), "hoehe", null, 1, 1, Rechteck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRechteck_Breite(), ecorePackage.getEFloat(), "breite", null, 1, 1, Rechteck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRechteck_Lineprops(), this.getLinienStil(), null, "lineprops", null, 1, 1, Rechteck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRechteck_Areaprops(), this.getFlaechenStil(), null, "areaprops", null, 1, 1, Rechteck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(kreisEClass, Kreis.class, "Kreis", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKreis_Radius(), ecorePackage.getEFloat(), "radius", null, 1, 1, Kreis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKreis_Lineprops(), this.getLinienStil(), null, "lineprops", null, 1, 1, Kreis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKreis_Areaprops(), this.getFlaechenStil(), null, "areaprops", null, 1, 1, Kreis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(svgModelEClass, SVGModel.class, "SVGModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSVGModel_Elements(), this.getForm(), null, "elements", null, 1, -1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSVGModel_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSVGModel_Hoehe(), ecorePackage.getEFloat(), "hoehe", null, 1, 1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSVGModel_Breite(), ecorePackage.getEFloat(), "breite", null, 1, 1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSVGModel_Imports(), this.getImport(), null, "imports", null, 0, 1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSVGModel_Version(), ecorePackage.getEString(), "version", null, 1, 1, SVGModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linieEClass, Linie.class, "Linie", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinie_X2(), ecorePackage.getEFloat(), "x2", null, 1, 1, Linie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinie_Y2(), ecorePackage.getEFloat(), "y2", null, 1, 1, Linie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLinie_Lineprops(), this.getLinienStil(), null, "lineprops", null, 1, 1, Linie.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFigure_Forms(), this.getEmbedForm(), null, "forms", null, 1, -1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFigure_X(), ecorePackage.getEFloat(), "x", null, 1, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFigure_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImport_ImportedRessource(), this.getSVGModel(), null, "importedRessource", null, 1, -1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(embedFormEClass, EmbedForm.class, "EmbedForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEmbedForm_X(), ecorePackage.getEFloat(), "x", null, 1, 1, EmbedForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEmbedForm_Y(), ecorePackage.getEFloat(), "y", null, 1, 1, EmbedForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEmbedForm_Form(), this.getForm(), null, "form", null, 1, 1, EmbedForm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linienStilEClass, LinienStil.class, "LinienStil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLinienStil_Zug(), this.getLinienart(), "zug", "durchgezogen", 0, 1, LinienStil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinienStil_Dicke(), ecorePackage.getEString(), "dicke", "0", 0, 1, LinienStil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLinienStil_Farbe(), ecorePackage.getEString(), "farbe", "black", 0, 1, LinienStil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(flaechenStilEClass, FlaechenStil.class, "FlaechenStil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFlaechenStil_Fuellung(), ecorePackage.getEString(), "fuellung", null, 0, 1, FlaechenStil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFlaechenStil_Muster(), ecorePackage.getEString(), "muster", null, 0, 1, FlaechenStil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(linienartEEnum, Linienart.class, "Linienart");
    addEEnumLiteral(linienartEEnum, Linienart.DURCHGEZOGEN);
    addEEnumLiteral(linienartEEnum, Linienart.GESTRICHELT);
    addEEnumLiteral(linienartEEnum, Linienart.GEPUNKTET);

    // Create resource
    createResource(eNS_URI);
  }

} //SvgdPackageImpl
