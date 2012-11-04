/**
 */
package gh.funthomas424242.svgd.util;

import gh.funthomas424242.svgd.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gh.funthomas424242.svgd.SvgdPackage
 * @generated
 */
public class SvgdSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SvgdPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgdSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SvgdPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SvgdPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.FORM:
      {
        Form form = (Form)theEObject;
        T result = caseForm(form);
        if (result == null) result = caseNamedElement(form);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.RECHTECK:
      {
        Rechteck rechteck = (Rechteck)theEObject;
        T result = caseRechteck(rechteck);
        if (result == null) result = caseForm(rechteck);
        if (result == null) result = caseNamedElement(rechteck);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.KREIS:
      {
        Kreis kreis = (Kreis)theEObject;
        T result = caseKreis(kreis);
        if (result == null) result = caseForm(kreis);
        if (result == null) result = caseNamedElement(kreis);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.SVG_MODEL:
      {
        SVGModel svgModel = (SVGModel)theEObject;
        T result = caseSVGModel(svgModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.LINIE:
      {
        Linie linie = (Linie)theEObject;
        T result = caseLinie(linie);
        if (result == null) result = caseForm(linie);
        if (result == null) result = caseNamedElement(linie);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.FIGURE:
      {
        Figure figure = (Figure)theEObject;
        T result = caseFigure(figure);
        if (result == null) result = caseForm(figure);
        if (result == null) result = caseNamedElement(figure);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.EMBED_FORM:
      {
        EmbedForm embedForm = (EmbedForm)theEObject;
        T result = caseEmbedForm(embedForm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.LINIEN_STIL:
      {
        LinienStil linienStil = (LinienStil)theEObject;
        T result = caseLinienStil(linienStil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgdPackage.FLAECHEN_STIL:
      {
        FlaechenStil flaechenStil = (FlaechenStil)theEObject;
        T result = caseFlaechenStil(flaechenStil);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForm(Form object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rechteck</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rechteck</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRechteck(Rechteck object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Kreis</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Kreis</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKreis(Kreis object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SVG Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SVG Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSVGModel(SVGModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linie</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linie</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinie(Linie object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Figure</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Figure</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFigure(Figure object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Embed Form</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Embed Form</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEmbedForm(EmbedForm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Linien Stil</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Linien Stil</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLinienStil(LinienStil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flaechen Stil</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flaechen Stil</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlaechenStil(FlaechenStil object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SvgdSwitch
