/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gh.funthomas424242.svgd.SvgdPackage
 * @generated
 */
public interface SvgdFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SvgdFactory eINSTANCE = gh.funthomas424242.svgd.impl.SvgdFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Rechteck</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rechteck</em>'.
   * @generated
   */
  Rechteck createRechteck();

  /**
   * Returns a new object of class '<em>Kreis</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Kreis</em>'.
   * @generated
   */
  Kreis createKreis();

  /**
   * Returns a new object of class '<em>SVG Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SVG Model</em>'.
   * @generated
   */
  SVGModel createSVGModel();

  /**
   * Returns a new object of class '<em>Linie</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linie</em>'.
   * @generated
   */
  Linie createLinie();

  /**
   * Returns a new object of class '<em>Figure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Figure</em>'.
   * @generated
   */
  Figure createFigure();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  Import createImport();

  /**
   * Returns a new object of class '<em>Embed Form</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Embed Form</em>'.
   * @generated
   */
  EmbedForm createEmbedForm();

  /**
   * Returns a new object of class '<em>Linien Stil</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Linien Stil</em>'.
   * @generated
   */
  LinienStil createLinienStil();

  /**
   * Returns a new object of class '<em>Flaechen Stil</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Flaechen Stil</em>'.
   * @generated
   */
  FlaechenStil createFlaechenStil();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SvgdPackage getSvgdPackage();

} //SvgdFactory
