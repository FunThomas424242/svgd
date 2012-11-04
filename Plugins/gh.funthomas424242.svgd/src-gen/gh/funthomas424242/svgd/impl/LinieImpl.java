/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.Linie;
import gh.funthomas424242.svgd.LinienStil;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linie</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinieImpl#getX2 <em>X2</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinieImpl#getY2 <em>Y2</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinieImpl#getLineprops <em>Lineprops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinieImpl extends FormImpl implements Linie
{
  /**
   * The default value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected static final float X2_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getX2() <em>X2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX2()
   * @generated
   * @ordered
   */
  protected float x2 = X2_EDEFAULT;

  /**
   * The default value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected static final float Y2_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getY2() <em>Y2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY2()
   * @generated
   * @ordered
   */
  protected float y2 = Y2_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinieImpl()
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
    return SvgdPackage.Literals.LINIE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getX2()
  {
    return x2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX2(float newX2)
  {
    float oldX2 = x2;
    x2 = newX2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIE__X2, oldX2, x2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getY2()
  {
    return y2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY2(float newY2)
  {
    float oldY2 = y2;
    y2 = newY2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIE__Y2, oldY2, y2));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIE__LINEPROPS, oldLineprops, newLineprops);
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
        msgs = ((InternalEObject)lineprops).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.LINIE__LINEPROPS, null, msgs);
      if (newLineprops != null)
        msgs = ((InternalEObject)newLineprops).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.LINIE__LINEPROPS, null, msgs);
      msgs = basicSetLineprops(newLineprops, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIE__LINEPROPS, newLineprops, newLineprops));
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
      case SvgdPackage.LINIE__LINEPROPS:
        return basicSetLineprops(null, msgs);
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
      case SvgdPackage.LINIE__X2:
        return getX2();
      case SvgdPackage.LINIE__Y2:
        return getY2();
      case SvgdPackage.LINIE__LINEPROPS:
        return getLineprops();
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
      case SvgdPackage.LINIE__X2:
        setX2((Float)newValue);
        return;
      case SvgdPackage.LINIE__Y2:
        setY2((Float)newValue);
        return;
      case SvgdPackage.LINIE__LINEPROPS:
        setLineprops((LinienStil)newValue);
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
      case SvgdPackage.LINIE__X2:
        setX2(X2_EDEFAULT);
        return;
      case SvgdPackage.LINIE__Y2:
        setY2(Y2_EDEFAULT);
        return;
      case SvgdPackage.LINIE__LINEPROPS:
        setLineprops((LinienStil)null);
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
      case SvgdPackage.LINIE__X2:
        return x2 != X2_EDEFAULT;
      case SvgdPackage.LINIE__Y2:
        return y2 != Y2_EDEFAULT;
      case SvgdPackage.LINIE__LINEPROPS:
        return lineprops != null;
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
    result.append(" (x2: ");
    result.append(x2);
    result.append(", y2: ");
    result.append(y2);
    result.append(')');
    return result.toString();
  }

} //LinieImpl
