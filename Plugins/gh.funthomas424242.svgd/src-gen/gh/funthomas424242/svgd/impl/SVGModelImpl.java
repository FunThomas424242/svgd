/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.Form;
import gh.funthomas424242.svgd.Import;
import gh.funthomas424242.svgd.SVGModel;
import gh.funthomas424242.svgd.SvgdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getHoehe <em>Hoehe</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getBreite <em>Breite</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.SVGModelImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGModelImpl extends EObjectImpl implements SVGModel
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Form> elements;

  /**
   * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected static final String FILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected String fileName = FILE_NAME_EDEFAULT;

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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected Import imports;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SVGModelImpl()
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
    return SvgdPackage.Literals.SVG_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Form> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Form>(Form.class, this, SvgdPackage.SVG_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFileName()
  {
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(String newFileName)
  {
    String oldFileName = fileName;
    fileName = newFileName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__FILE_NAME, oldFileName, fileName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__HOEHE, oldHoehe, hoehe));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__BREITE, oldBreite, breite));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import getImports()
  {
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImports(Import newImports, NotificationChain msgs)
  {
    Import oldImports = imports;
    imports = newImports;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__IMPORTS, oldImports, newImports);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImports(Import newImports)
  {
    if (newImports != imports)
    {
      NotificationChain msgs = null;
      if (imports != null)
        msgs = ((InternalEObject)imports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.SVG_MODEL__IMPORTS, null, msgs);
      if (newImports != null)
        msgs = ((InternalEObject)newImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SvgdPackage.SVG_MODEL__IMPORTS, null, msgs);
      msgs = basicSetImports(newImports, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__IMPORTS, newImports, newImports));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.SVG_MODEL__VERSION, oldVersion, version));
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
      case SvgdPackage.SVG_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case SvgdPackage.SVG_MODEL__IMPORTS:
        return basicSetImports(null, msgs);
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
      case SvgdPackage.SVG_MODEL__ELEMENTS:
        return getElements();
      case SvgdPackage.SVG_MODEL__FILE_NAME:
        return getFileName();
      case SvgdPackage.SVG_MODEL__HOEHE:
        return getHoehe();
      case SvgdPackage.SVG_MODEL__BREITE:
        return getBreite();
      case SvgdPackage.SVG_MODEL__IMPORTS:
        return getImports();
      case SvgdPackage.SVG_MODEL__VERSION:
        return getVersion();
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
      case SvgdPackage.SVG_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Form>)newValue);
        return;
      case SvgdPackage.SVG_MODEL__FILE_NAME:
        setFileName((String)newValue);
        return;
      case SvgdPackage.SVG_MODEL__HOEHE:
        setHoehe((Float)newValue);
        return;
      case SvgdPackage.SVG_MODEL__BREITE:
        setBreite((Float)newValue);
        return;
      case SvgdPackage.SVG_MODEL__IMPORTS:
        setImports((Import)newValue);
        return;
      case SvgdPackage.SVG_MODEL__VERSION:
        setVersion((String)newValue);
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
      case SvgdPackage.SVG_MODEL__ELEMENTS:
        getElements().clear();
        return;
      case SvgdPackage.SVG_MODEL__FILE_NAME:
        setFileName(FILE_NAME_EDEFAULT);
        return;
      case SvgdPackage.SVG_MODEL__HOEHE:
        setHoehe(HOEHE_EDEFAULT);
        return;
      case SvgdPackage.SVG_MODEL__BREITE:
        setBreite(BREITE_EDEFAULT);
        return;
      case SvgdPackage.SVG_MODEL__IMPORTS:
        setImports((Import)null);
        return;
      case SvgdPackage.SVG_MODEL__VERSION:
        setVersion(VERSION_EDEFAULT);
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
      case SvgdPackage.SVG_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case SvgdPackage.SVG_MODEL__FILE_NAME:
        return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
      case SvgdPackage.SVG_MODEL__HOEHE:
        return hoehe != HOEHE_EDEFAULT;
      case SvgdPackage.SVG_MODEL__BREITE:
        return breite != BREITE_EDEFAULT;
      case SvgdPackage.SVG_MODEL__IMPORTS:
        return imports != null;
      case SvgdPackage.SVG_MODEL__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
    result.append(" (fileName: ");
    result.append(fileName);
    result.append(", hoehe: ");
    result.append(hoehe);
    result.append(", breite: ");
    result.append(breite);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //SVGModelImpl
