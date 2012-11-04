/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SVG Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getElements <em>Elements</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getFileName <em>File Name</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getHoehe <em>Hoehe</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getBreite <em>Breite</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getImports <em>Imports</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.SVGModel#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel()
 * @model
 * @generated
 */
public interface SVGModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link gh.funthomas424242.svgd.Form}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_Elements()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Form> getElements();

  /**
   * Returns the value of the '<em><b>File Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' attribute.
   * @see #setFileName(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_FileName()
   * @model required="true"
   * @generated
   */
  String getFileName();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.SVGModel#getFileName <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' attribute.
   * @see #getFileName()
   * @generated
   */
  void setFileName(String value);

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
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_Hoehe()
   * @model required="true"
   * @generated
   */
  float getHoehe();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.SVGModel#getHoehe <em>Hoehe</em>}' attribute.
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
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_Breite()
   * @model required="true"
   * @generated
   */
  float getBreite();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.SVGModel#getBreite <em>Breite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Breite</em>' attribute.
   * @see #getBreite()
   * @generated
   */
  void setBreite(float value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(Import)
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_Imports()
   * @model containment="true"
   * @generated
   */
  Import getImports();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.SVGModel#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(Import value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see gh.funthomas424242.svgd.SvgdPackage#getSVGModel_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link gh.funthomas424242.svgd.SVGModel#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

} // SVGModel
