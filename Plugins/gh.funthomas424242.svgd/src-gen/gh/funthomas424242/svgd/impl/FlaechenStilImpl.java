/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.FlaechenStil;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flaechen Stil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.FlaechenStilImpl#getFuellung <em>Fuellung</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.FlaechenStilImpl#getMuster <em>Muster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlaechenStilImpl extends EObjectImpl implements FlaechenStil
{
  /**
   * The default value of the '{@link #getFuellung() <em>Fuellung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuellung()
   * @generated
   * @ordered
   */
  protected static final String FUELLUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFuellung() <em>Fuellung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFuellung()
   * @generated
   * @ordered
   */
  protected String fuellung = FUELLUNG_EDEFAULT;

  /**
   * The default value of the '{@link #getMuster() <em>Muster</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMuster()
   * @generated
   * @ordered
   */
  protected static final String MUSTER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMuster() <em>Muster</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMuster()
   * @generated
   * @ordered
   */
  protected String muster = MUSTER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FlaechenStilImpl()
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
    return SvgdPackage.Literals.FLAECHEN_STIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFuellung()
  {
    return fuellung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFuellung(String newFuellung)
  {
    String oldFuellung = fuellung;
    fuellung = newFuellung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.FLAECHEN_STIL__FUELLUNG, oldFuellung, fuellung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMuster()
  {
    return muster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMuster(String newMuster)
  {
    String oldMuster = muster;
    muster = newMuster;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.FLAECHEN_STIL__MUSTER, oldMuster, muster));
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
      case SvgdPackage.FLAECHEN_STIL__FUELLUNG:
        return getFuellung();
      case SvgdPackage.FLAECHEN_STIL__MUSTER:
        return getMuster();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SvgdPackage.FLAECHEN_STIL__FUELLUNG:
        setFuellung((String)newValue);
        return;
      case SvgdPackage.FLAECHEN_STIL__MUSTER:
        setMuster((String)newValue);
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
      case SvgdPackage.FLAECHEN_STIL__FUELLUNG:
        setFuellung(FUELLUNG_EDEFAULT);
        return;
      case SvgdPackage.FLAECHEN_STIL__MUSTER:
        setMuster(MUSTER_EDEFAULT);
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
      case SvgdPackage.FLAECHEN_STIL__FUELLUNG:
        return FUELLUNG_EDEFAULT == null ? fuellung != null : !FUELLUNG_EDEFAULT.equals(fuellung);
      case SvgdPackage.FLAECHEN_STIL__MUSTER:
        return MUSTER_EDEFAULT == null ? muster != null : !MUSTER_EDEFAULT.equals(muster);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (fuellung: ");
    result.append(fuellung);
    result.append(", muster: ");
    result.append(muster);
    result.append(')');
    return result.toString();
  }

} //FlaechenStilImpl
