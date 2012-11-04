/**
 */
package gh.funthomas424242.svgd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kreis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.Kreis#getRadius <em>Radius</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Kreis#getLineprops <em>Lineprops</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Kreis#getAreaprops <em>Areaprops</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getKreis()
 * @model
 * @generated
 */
public interface Kreis extends Form
{
  /**
   * Returns the value of the '<em><b>Radius</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Radius</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Radius</em>' attribute.
   * @see #setRadius(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getKreis_Radius()
   * @model required="true"
   * @generated
   */
  float getRadius();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Kreis#getRadius <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Radius</em>' attribute.
   * @see #getRadius()
   * @generated
   */
  void setRadius(float value);

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
   * @see gh.funthomas424242.svgd.SvgdPackage#getKreis_Lineprops()
   * @model containment="true" required="true"
   * @generated
   */
  LinienStil getLineprops();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Kreis#getLineprops <em>Lineprops</em>}' containment reference.
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
   * @see gh.funthomas424242.svgd.SvgdPackage#getKreis_Areaprops()
   * @model containment="true" required="true"
   * @generated
   */
  FlaechenStil getAreaprops();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Kreis#getAreaprops <em>Areaprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Areaprops</em>' containment reference.
   * @see #getAreaprops()
   * @generated
   */
  void setAreaprops(FlaechenStil value);

} // Kreis
