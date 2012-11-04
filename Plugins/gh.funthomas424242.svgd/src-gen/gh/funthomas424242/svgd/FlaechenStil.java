/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flaechen Stil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.FlaechenStil#getFuellung <em>Fuellung</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.FlaechenStil#getMuster <em>Muster</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getFlaechenStil()
 * @model
 * @generated
 */
public interface FlaechenStil extends EObject
{
  /**
   * Returns the value of the '<em><b>Fuellung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fuellung</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fuellung</em>' attribute.
   * @see #setFuellung(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getFlaechenStil_Fuellung()
   * @model
   * @generated
   */
  String getFuellung();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.FlaechenStil#getFuellung <em>Fuellung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fuellung</em>' attribute.
   * @see #getFuellung()
   * @generated
   */
  void setFuellung(String value);

  /**
   * Returns the value of the '<em><b>Muster</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Muster</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Muster</em>' attribute.
   * @see #setMuster(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getFlaechenStil_Muster()
   * @model
   * @generated
   */
  String getMuster();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.FlaechenStil#getMuster <em>Muster</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Muster</em>' attribute.
   * @see #getMuster()
   * @generated
   */
  void setMuster(String value);

} // FlaechenStil
