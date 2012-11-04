/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.Figure#getForms <em>Forms</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Figure#getX <em>X</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.Figure#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends Form
{
  /**
   * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
   * The list contents are of type {@link gh.funthomas424242.svgd.EmbedForm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Forms</em>' containment reference list.
   * @see gh.funthomas424242.svgd.SvgdPackage#getFigure_Forms()
   * @model containment="true" required="true"
   * @generated
   */
  EList<EmbedForm> getForms();

  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getFigure_X()
   * @model required="true"
   * @generated
   */
  float getX();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Figure#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(float value);

  /**
   * Returns the value of the '<em><b>Y</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' attribute.
   * @see #setY(float)
   * @see gh.funthomas424242.svgd.SvgdPackage#getFigure_Y()
   * @model required="true"
   * @generated
   */
  float getY();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.Figure#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(float value);

} // Figure
