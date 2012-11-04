/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.FlaechenStil;
import gh.funthomas424242.svgd.LinienStil;
import gh.funthomas424242.svgd.Rechteck;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rechteck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.RechteckImpl#getHoehe <em>Hoehe</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.RechteckImpl#getBreite <em>Breite</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.RechteckImpl#getLineprops <em>Lineprops</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.RechteckImpl#getAreaprops <em>Areaprops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RechteckImpl extends FormImpl implements Rechteck
{
  /**
   * The default value of the '{@link #getHoehe() <em>Hoehe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoehe()
   * @generated
   * @ordered
   */
  protected static final float HOEHE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getHoehe() <em>Hoehe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHoehe()
   * @generated
   * @ordered
   */
  protected float hoehe = HOEHE_EDEFAULT;

  /**
   * The default value of the '{@link #getBreite() <em>Breite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreite()
   * @generated
   * @ordered
   */
  protected static final float BREITE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getBreite() <em>Breite</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBreite()
   * @generated
   * @ordered
   */
  protected float breite = BREITE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLineprops() <em>Lineprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLineprops()
   * @generated
   * @ordered
   */
  protected LinienStil lineprops;

  /**
   * The cached value of the '{@link #getAreaprops() <em>Areaprops</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAreaprops()
   * @generated
   * @ordered
   */
  protected FlaechenStil areaprops;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RechteckImpl()
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
    return SvgdPackage.Literals.RECHTECK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getHoehe()
  {
    return hoehe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHoehe(float newHoehe)
  {
    float oldHoehe = hoehe;
    hoehe = newHoehe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__HOEHE, oldHoehe, hoehe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getBreite()
  {
    return breite;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBreite(float newBreite)
  {
    float oldBreite = breite;
    breite = newBreite;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__BREITE, oldBreite, breite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinienStil getLineprops()
  {
    return lineprops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLineprops(LinienStil newLineprops, NotificationChain msgs)
  {
    LinienStil oldLineprops = lineprops;
    lineprops = newLineprops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__LINEPROPS, oldLineprops, newLineprops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLineprops(LinienStil newLineprops)
  {
    if (newLineprops != lineprops)
    {
      NotificationChain msgs = null;
      if (lineprops != null)
        msgs = ((InternalEObject)lineprops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.RECHTECK__LINEPROPS, null, msgs);
      if (newLineprops != null)
        msgs = ((InternalEObject)newLineprops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.RECHTECK__LINEPROPS, null, msgs);
      msgs = basicSetLineprops(newLineprops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__LINEPROPS, newLineprops, newLineprops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlaechenStil getAreaprops()
  {
    return areaprops;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAreaprops(FlaechenStil newAreaprops, NotificationChain msgs)
  {
    FlaechenStil oldAreaprops = areaprops;
    areaprops = newAreaprops;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__AREAPROPS, oldAreaprops, newAreaprops);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAreaprops(FlaechenStil newAreaprops)
  {
    if (newAreaprops != areaprops)
    {
      NotificationChain msgs = null;
      if (areaprops != null)
        msgs = ((InternalEObject)areaprops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.RECHTECK__AREAPROPS, null, msgs);
      if (newAreaprops != null)
        msgs = ((InternalEObject)newAreaprops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.RECHTECK__AREAPROPS, null, msgs);
      msgs = basicSetAreaprops(newAreaprops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.RECHTECK__AREAPROPS, newAreaprops, newAreaprops));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SvgdPackage.RECHTECK__LINEPROPS:
        return basicSetLineprops(null, msgs);
      case SvgdPackage.RECHTECK__AREAPROPS:
        return basicSetAreaprops(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SvgdPackage.RECHTECK__HOEHE:
        return getHoehe();
      case SvgdPackage.RECHTECK__BREITE:
        return getBreite();
      case SvgdPackage.RECHTECK__LINEPROPS:
        return getLineprops();
      case SvgdPackage.RECHTECK__AREAPROPS:
        return getAreaprops();
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
      case SvgdPackage.RECHTECK__HOEHE:
        setHoehe((Float)newValue);
        return;
      case SvgdPackage.RECHTECK__BREITE:
        setBreite((Float)newValue);
        return;
      case SvgdPackage.RECHTECK__LINEPROPS:
        setLineprops((LinienStil)newValue);
        return;
      case SvgdPackage.RECHTECK__AREAPROPS:
        setAreaprops((FlaechenStil)newValue);
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
      case SvgdPackage.RECHTECK__HOEHE:
        setHoehe(HOEHE_EDEFAULT);
        return;
      case SvgdPackage.RECHTECK__BREITE:
        setBreite(BREITE_EDEFAULT);
        return;
      case SvgdPackage.RECHTECK__LINEPROPS:
        setLineprops((LinienStil)null);
        return;
      case SvgdPackage.RECHTECK__AREAPROPS:
        setAreaprops((FlaechenStil)null);
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
      case SvgdPackage.RECHTECK__HOEHE:
        return hoehe != HOEHE_EDEFAULT;
      case SvgdPackage.RECHTECK__BREITE:
        return breite != BREITE_EDEFAULT;
      case SvgdPackage.RECHTECK__LINEPROPS:
        return lineprops != null;
      case SvgdPackage.RECHTECK__AREAPROPS:
        return areaprops != null;
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
    result.append(" (hoehe: ");
    result.append(hoehe);
    result.append(", breite: ");
    result.append(breite);
    result.append(')');
    return result.toString();
  }

} //RechteckImpl
