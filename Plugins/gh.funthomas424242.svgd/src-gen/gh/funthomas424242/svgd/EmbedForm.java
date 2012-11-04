/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embed Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.EmbedForm#getX <em>X</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.EmbedForm#getY <em>Y</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.EmbedForm#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getEmbedForm()
 * @model
 * @generated
 */
public interface EmbedForm extends EObject
{
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
   * @see gh.funthomas424242.svgd.SvgdPackage#getEmbedForm_X()
   * @model required="true"
   * @generated
   */
  float getX();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.EmbedForm#getX <em>X</em>}' attribute.
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
   * @see gh.funthomas424242.svgd.SvgdPackage#getEmbedForm_Y()
   * @model required="true"
   * @generated
   */
  float getY();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.EmbedForm#getY <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' attribute.
   * @see #getY()
   * @generated
   */
  void setY(float value);

  /**
   * Returns the value of the '<em><b>Form</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Form</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Form</em>' reference.
   * @see #setForm(Form)
   * @see gh.funthomas424242.svgd.SvgdPackage#getEmbedForm_Form()
   * @model required="true"
   * @generated
   */
  Form getForm();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.EmbedForm#getForm <em>Form</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Form</em>' reference.
   * @see #getForm()
   * @generated
   */
  void setForm(Form value);

} // EmbedForm
