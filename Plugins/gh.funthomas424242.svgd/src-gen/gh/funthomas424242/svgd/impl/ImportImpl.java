/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.Import;
import gh.funthomas424242.svgd.SVGModel;
import gh.funthomas424242.svgd.SvgdPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.ImportImpl#getImportedRessource <em>Imported Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends EObjectImpl implements Import
{
  /**
   * The cached value of the '{@link #getImportedRessource() <em>Imported Ressource</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedRessource()
   * @generated
   * @ordered
   */
  protected EList<SVGModel> importedRessource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SvgdPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SVGModel> getImportedRessource()
  {
    if (importedRessource == null)
    {
      importedRessource = new EObjectResolvingEList<SVGModel>(SVGModel.class, this, SvgdPackage.IMPORT__IMPORTED_RESSOURCE);
    }
    return importedRessource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SvgdPackage.IMPORT__IMPORTED_RESSOURCE:
        return getImportedRessource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SvgdPackage.IMPORT__IMPORTED_RESSOURCE:
        getImportedRessource().clear();
        getImportedRessource().addAll((Collection<? extends SVGModel>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SvgdPackage.IMPORT__IMPORTED_RESSOURCE:
        getImportedRessource().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SvgdPackage.IMPORT__IMPORTED_RESSOURCE:
        return importedRessource != null && !importedRessource.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImportImpl
