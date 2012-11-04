/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.FlaechenStil;
import gh.funthomas424242.svgd.Kreis;
import gh.funthomas424242.svgd.LinienStil;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kreis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.KreisImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.KreisImpl#getLineprops <em>Lineprops</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.KreisImpl#getAreaprops <em>Areaprops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KreisImpl extends FormImpl implements Kreis
{
  /**
   * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected static final float RADIUS_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRadius()
   * @generated
   * @ordered
   */
  protected float radius = RADIUS_EDEFAULT;

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
  protected KreisImpl()
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
    return SvgdPackage.Literals.KREIS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getRadius()
  {
    return radius;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRadius(float newRadius)
  {
    float oldRadius = radius;
    radius = newRadius;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.KREIS__RADIUS, oldRadius, radius));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.KREIS__LINEPROPS, oldLineprops, newLineprops);
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
        msgs = ((InternalEObject)lineprops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.KREIS__LINEPROPS, null, msgs);
      if (newLineprops != null)
        msgs = ((InternalEObject)newLineprops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.KREIS__LINEPROPS, null, msgs);
      msgs = basicSetLineprops(newLineprops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.KREIS__LINEPROPS, newLineprops, newLineprops));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.KREIS__AREAPROPS, oldAreaprops, newAreaprops);
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
        msgs = ((InternalEObject)areaprops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.KREIS__AREAPROPS, null, msgs);
      if (newAreaprops != null)
        msgs = ((InternalEObject)newAreaprops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.KREIS__AREAPROPS, null, msgs);
      msgs = basicSetAreaprops(newAreaprops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.KREIS__AREAPROPS, newAreaprops, newAreaprops));
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
      case SvgdPackage.KREIS__LINEPROPS:
        return basicSetLineprops(null, msgs);
      case SvgdPackage.KREIS__AREAPROPS:
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
      case SvgdPackage.KREIS__RADIUS:
        return getRadius();
      case SvgdPackage.KREIS__LINEPROPS:
        return getLineprops();
      case SvgdPackage.KREIS__AREAPROPS:
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
      case SvgdPackage.KREIS__RADIUS:
        setRadius((Float)newValue);
        return;
      case SvgdPackage.KREIS__LINEPROPS:
        setLineprops((LinienStil)newValue);
        return;
      case SvgdPackage.KREIS__AREAPROPS:
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
      case SvgdPackage.KREIS__RADIUS:
        setRadius(RADIUS_EDEFAULT);
        return;
      case SvgdPackage.KREIS__LINEPROPS:
        setLineprops((LinienStil)null);
        return;
      case SvgdPackage.KREIS__AREAPROPS:
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
      case SvgdPackage.KREIS__RADIUS:
        return radius != RADIUS_EDEFAULT;
      case SvgdPackage.KREIS__LINEPROPS:
        return lineprops != null;
      case SvgdPackage.KREIS__AREAPROPS:
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
    result.append(" (radius: ");
    result.append(radius);
    result.append(')');
    return result.toString();
  }

} //KreisImpl
