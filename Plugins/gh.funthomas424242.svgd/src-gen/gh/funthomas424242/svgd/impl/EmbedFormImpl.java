/**
 */
package gh.funthomas424242.svgd.impl;

import gh.funthomas424242.svgd.EmbedForm;
import gh.funthomas424242.svgd.Form;
import gh.funthomas424242.svgd.SvgdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embed Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gh.funthomas424242.svgd.impl.EmbedFormImpl#getX <em>X</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.EmbedFormImpl#getY <em>Y</em>}</li>
 *   <li>{@link gh.funthomas424242.svgd.impl.EmbedFormImpl#getForm <em>Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbedFormImpl extends EObjectImpl implements EmbedForm
{
  /**
   * The default value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected static final float X_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getX() <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected float x = X_EDEFAULT;

  /**
   * The default value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected static final float Y_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getY()
   * @generated
   * @ordered
   */
  protected float y = Y_EDEFAULT;

  /**
   * The cached value of the '{@link #getForm() <em>Form</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForm()
   * @generated
   * @ordered
   */
  protected Form form;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EmbedFormImpl()
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
    return SvgdPackage.Literals.EMBED_FORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setX(float newX)
  {
    float oldX = x;
    x = newX;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.EMBED_FORM__X, oldX, x));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getY()
  {
    return y;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setY(float newY)
  {
    float oldY = y;
    y = newY;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.EMBED_FORM__Y, oldY, y));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form getForm()
  {
    if (form != null && form.eIsProxy())
    {
      InternalEObject oldForm = (InternalEObject)form;
      form = (Form)eResolveProxy(oldForm);
      if (form != oldForm)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SvgdPackage.EMBED_FORM__FORM, oldForm, form));
      }
    }
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Form basicGetForm()
  {
    return form;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForm(Form newForm)
  {
    Form oldForm = form;
    form = newForm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SvgdPackage.EMBED_FORM__FORM, oldForm, form));
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
      case SvgdPackage.EMBED_FORM__X:
        return getX();
      case SvgdPackage.EMBED_FORM__Y:
        return getY();
      case SvgdPackage.EMBED_FORM__FORM:
        if (resolve) return getForm();
        return basicGetForm();
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
      case SvgdPackage.EMBED_FORM__X:
        setX((Float)newValue);
        return;
      case SvgdPackage.EMBED_FORM__Y:
        setY((Float)newValue);
        return;
      case SvgdPackage.EMBED_FORM__FORM:
        setForm((Form)newValue);
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
      case SvgdPackage.EMBED_FORM__X:
        setX(X_EDEFAULT);
        return;
      case SvgdPackage.EMBED_FORM__Y:
        setY(Y_EDEFAULT);
        return;
      case SvgdPackage.EMBED_FORM__FORM:
        setForm((Form)null);
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
      case SvgdPackage.EMBED_FORM__X:
        return x != X_EDEFAULT;
      case SvgdPackage.EMBED_FORM__Y:
        return y != Y_EDEFAULT;
      case SvgdPackage.EMBED_FORM__FORM:
        return form != null;
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
    result.append(" (x: ");
    result.append(x);
    result.append(", y: ");
    result.append(y);
    result.append(')');
    return result.toString();
  }

} //EmbedFormImpl
