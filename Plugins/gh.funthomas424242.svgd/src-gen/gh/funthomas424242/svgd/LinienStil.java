/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Linien Stil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.LinienStil#getZug <em>Zug</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.LinienStil#getDicke <em>Dicke</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.LinienStil#getFarbe <em>Farbe</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getLinienStil()
 * @model
 * @generated
 */
public interface LinienStil extends EObject
{
  /**
   * Returns the value of the '<em><b>Zug</b></em>' attribute.
   * The default value is <code>"durchgezogen"</code>.
   * The literals are from the enumeration {@link gh.funthomas424242.svgd.Linienart}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Zug</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Zug</em>' attribute.
   * @see gh.funthomas424242.svgd.Linienart
   * @see #setZug(Linienart)
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinienStil_Zug()
   * @model default="durchgezogen"
   * @generated
   */
  Linienart getZug();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.LinienStil#getZug <em>Zug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Zug</em>' attribute.
   * @see gh.funthomas424242.svgd.Linienart
   * @see #getZug()
   * @generated
   */
  void setZug(Linienart value);

  /**
   * Returns the value of the '<em><b>Dicke</b></em>' attribute.
   * The default value is <code>"0"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dicke</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dicke</em>' attribute.
   * @see #setDicke(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinienStil_Dicke()
   * @model default="0"
   * @generated
   */
  String getDicke();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.LinienStil#getDicke <em>Dicke</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dicke</em>' attribute.
   * @see #getDicke()
   * @generated
   */
  void setDicke(String value);

  /**
   * Returns the value of the '<em><b>Farbe</b></em>' attribute.
   * The default value is <code>"black"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Farbe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Farbe</em>' attribute.
   * @see #setFarbe(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getLinienStil_Farbe()
   * @model default="black"
   * @generated
   */
  String getFarbe();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.LinienStil#getFarbe <em>Farbe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Farbe</em>' attribute.
   * @see #getFarbe()
   * @generated
   */
  void setFarbe(String value);

} // LinienStil
