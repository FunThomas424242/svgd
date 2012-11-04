/**
 */
package gh.funthomas424242.svgd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.Linie#getX2 <em>X2</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Linie#getY2 <em>Y2</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Linie#getLineprops <em>Lineprops</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getLinie()
 * @model
 * @generated
 */
public interface Linie extends Form
{
  /**
   * Returns the value of the '<em><b>X2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X2</em>' attribute.
   * @see #setX2(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinie_X2()
   * @model required="true"
   * @generated
   */
  float getX2();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Linie#getX2 <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X2</em>' attribute.
   * @see #getX2()
   * @generated
   */
  void setX2(float value);

  /**
   * Returns the value of the '<em><b>Y2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y2</em>' attribute.
   * @see #setY2(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinie_Y2()
   * @model required="true"
   * @generated
   */
  float getY2();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Linie#getY2 <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y2</em>' attribute.
   * @see #getY2()
   * @generated
   */
  void setY2(float value);

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
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinie_Lineprops()
   * @model containment="true" required="true"
   * @generated
   */
  LinienStil getLineprops();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Linie#getLineprops <em>Lineprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lineprops</em>' containment reference.
   * @see #getLineprops()
   * @generated
   */
  void setLineprops(LinienStil value);

} // Linie
