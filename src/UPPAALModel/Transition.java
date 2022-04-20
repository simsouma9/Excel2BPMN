/**
 */
package UPPAALModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link UPPAALModel.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link UPPAALModel.Transition#getLabel <em>Label</em>}</li>
 *   <li>{@link UPPAALModel.Transition#getTg <em>Tg</em>}</li>
 *   <li>{@link UPPAALModel.Transition#getSrc <em>Src</em>}</li>
 *   <li>{@link UPPAALModel.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UPPAALModel.UPPAALModelPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link UPPAALModel.Transition#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link UPPAALModel.Transition#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link UPPAALModel.Label}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Label()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabel();

	/**
	 * Returns the value of the '<em><b>Tg</b></em>' reference list.
	 * The list contents are of type {@link UPPAALModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tg</em>' reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Tg()
	 * @model required="true"
	 * @generated
	 */
	EList<Location> getTg();

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference list.
	 * The list contents are of type {@link UPPAALModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Src()
	 * @model required="true"
	 * @generated
	 */
	EList<Location> getSrc();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UPPAALModel.UPPAALModelPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UPPAALModel.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
