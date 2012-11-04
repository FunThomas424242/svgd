/**
 */
package gh.funthomas424242.svgd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.Import#getImportedRessource <em>Imported Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @see gh.funthomas424242.svgd.SvgdPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Ressource</b></em>' reference list.
   * The list contents are of type {@link gh.funthomas424242.svgd.SVGModel}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Ressource</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Ressource</em>' reference list.
   * @see gh.funthomas424242.svgd.SvgdPackage#getImport_ImportedRessource()
   * @model required="true"
   * @generated
   */
  EList<SVGModel> getImportedRessource();

} // Import
