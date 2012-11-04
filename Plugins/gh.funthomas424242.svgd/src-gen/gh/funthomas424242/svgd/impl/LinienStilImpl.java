/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.LinienStil;
import gh.funthomas424242.svgd.Linienart;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Linien Stil</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinienStilImpl#getZug <em>Zug</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinienStilImpl#getDicke <em>Dicke</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.LinienStilImpl#getFarbe <em>Farbe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinienStilImpl extends EObjectImpl implements LinienStil
{
  /**
   * The default value of the '{@link #getZug() <em>Zug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZug()
   * @generated
   * @ordered
   */
  protected static final Linienart ZUG_EDEFAULT = Linienart.DURCHGEZOGEN;

  /**
   * The cached value of the '{@link #getZug() <em>Zug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getZug()
   * @generated
   * @ordered
   */
  protected Linienart zug = ZUG_EDEFAULT;

  /**
   * The default value of the '{@link #getDicke() <em>Dicke</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDicke()
   * @generated
   * @ordered
   */
  protected static final String DICKE_EDEFAULT = "0";

  /**
   * The cached value of the '{@link #getDicke() <em>Dicke</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDicke()
   * @generated
   * @ordered
   */
  protected String dicke = DICKE_EDEFAULT;

  /**
   * The default value of the '{@link #getFarbe() <em>Farbe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFarbe()
   * @generated
   * @ordered
   */
  protected static final String FARBE_EDEFAULT = "black";

  /**
   * The cached value of the '{@link #getFarbe() <em>Farbe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFarbe()
   * @generated
   * @ordered
   */
  protected String farbe = FARBE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinienStilImpl()
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
    return SvgdPackage.Literals.LINIEN_STIL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Linienart getZug()
  {
    return zug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setZug(Linienart newZug)
  {
    Linienart oldZug = zug;
    zug = newZug == null ? ZUG_EDEFAULT : newZug;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIEN_STIL__ZUG, oldZug, zug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDicke()
  {
    return dicke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDicke(String newDicke)
  {
    String oldDicke = dicke;
    dicke = newDicke;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIEN_STIL__DICKE, oldDicke, dicke));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFarbe()
  {
    return farbe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFarbe(String newFarbe)
  {
    String oldFarbe = farbe;
    farbe = newFarbe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.LINIEN_STIL__FARBE, oldFarbe, farbe));
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
      case SvgdPackage.LINIEN_STIL__ZUG:
        return getZug();
      case SvgdPackage.LINIEN_STIL__DICKE:
        return getDicke();
      case SvgdPackage.LINIEN_STIL__FARBE:
        return getFarbe();
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
      case SvgdPackage.LINIEN_STIL__ZUG:
        setZug((Linienart)newValue);
        return;
      case SvgdPackage.LINIEN_STIL__DICKE:
        setDicke((String)newValue);
        return;
      case SvgdPackage.LINIEN_STIL__FARBE:
        setFarbe((String)newValue);
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
      case SvgdPackage.LINIEN_STIL__ZUG:
        setZug(ZUG_EDEFAULT);
        return;
      case SvgdPackage.LINIEN_STIL__DICKE:
        setDicke(DICKE_EDEFAULT);
        return;
      case SvgdPackage.LINIEN_STIL__FARBE:
        setFarbe(FARBE_EDEFAULT);
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
      case SvgdPackage.LINIEN_STIL__ZUG:
        return zug != ZUG_EDEFAULT;
      case SvgdPackage.LINIEN_STIL__DICKE:
        return DICKE_EDEFAULT == null ? dicke != null : !DICKE_EDEFAULT.equals(dicke);
      case SvgdPackage.LINIEN_STIL__FARBE:
        return FARBE_EDEFAULT == null ? farbe != null : !FARBE_EDEFAULT.equals(farbe);
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
    result.append(" (zug: ");
    result.append(zug);
    result.append(", dicke: ");
    result.append(dicke);
    result.append(", farbe: ");
    result.append(farbe);
    result.append(')');
    return result.toString();
  }

} //LinienStilImpl
