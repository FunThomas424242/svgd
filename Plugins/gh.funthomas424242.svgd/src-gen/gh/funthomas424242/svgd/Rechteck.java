/**
 */
package gh.funthomas424242.svgd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rechteck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.Rechteck#getHoehe <em>Hoehe</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Rechteck#getBreite <em>Breite</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Rechteck#getLineprops <em>Lineprops</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Rechteck#getAreaprops <em>Areaprops</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getRechteck()
 * @model
 * @generated
 */
public interface Rechteck extends Form
{
  /**
   * Returns the value of the '<em><b>Hoehe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hoehe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hoehe</em>' attribute.
   * @see #setHoehe(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getRechteck_Hoehe()
   * @model required="true"
   * @generated
   */
  float getHoehe();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Rechteck#getHoehe <em>Hoehe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hoehe</em>' attribute.
   * @see #getHoehe()
   * @generated
   */
  void setHoehe(float value);

  /**
   * Returns the value of the '<em><b>Breite</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Breite</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Breite</em>' attribute.
   * @see #setBreite(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getRechteck_Breite()
   * @model required="true"
   * @generated
   */
  float getBreite();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Rechteck#getBreite <em>Breite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Breite</em>' attribute.
   * @see #getBreite()
   * @generated
   */
  void setBreite(float value);

  /**
   * Returns the value of the '<em><b>Lineprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lineprops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lineprops</em>' containment reference.
   * @see #setLineprops(LinienStil)
   * @see gh.funthomas424242.svgd.SvgdPackage#getRechteck_Lineprops()
   * @model containment="true" required="true"
   * @generated
   */
  LinienStil getLineprops();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Rechteck#getLineprops <em>Lineprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lineprops</em>' containment reference.
   * @see #getLineprops()
   * @generated
   */
  void setLineprops(LinienStil value);

  /**
   * Returns the value of the '<em><b>Areaprops</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Areaprops</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Areaprops</em>' containment reference.
   * @see #setAreaprops(FlaechenStil)
   * @see gh.funthomas424242.svgd.SvgdPackage#getRechteck_Areaprops()
   * @model containment="true" required="true"
   * @generated
   */
  FlaechenStil getAreaprops();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Rechteck#getAreaprops <em>Areaprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Areaprops</em>' containment reference.
   * @see #getAreaprops()
   * @generated
   */
  void setAreaprops(FlaechenStil value);

} // Rechteck
