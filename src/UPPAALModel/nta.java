/**
 */
package UPPAALModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>nta</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.nta#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link UPPAALModel.nta#getTemplate <em>Template</em>}</li>
 *   <li>{@link UPPAALModel.nta#getSystem <em>System</em>}</li>
 *   <li>{@link UPPAALModel.nta#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UPPAALModel.UPPAALModelPackage#getnta()
 * @model
 * @generated
 */
public interface nta extends EObject {
	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(Declaration)
	 * @see UPPAALModel.UPPAALModelPackage#getnta_Declaration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Declaration getDeclaration();

	/**
	 * Sets the value of the '{@link UPPAALModel.nta#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Declaration value);

	/**
	 * Returns the value of the '<em><b>Template</b></em>' containment reference list.
	 * The list contents are of type {@link UPPAALModel.Template}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' containment reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getnta_Template()
	 * @model containment="true"
	 * @generated
	 */
	EList<Template> getTemplate();

	/**
	 * Returns the value of the '<em><b>System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' containment reference.
	 * @see #setSystem(UPPAALModel.System)
	 * @see UPPAALModel.UPPAALModelPackage#getnta_System()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UPPAALModel.System getSystem();

	/**
	 * Sets the value of the '{@link UPPAALModel.nta#getSystem <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' containment reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(UPPAALModel.System value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UPPAALModel.UPPAALModelPackage#getnta_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UPPAALModel.nta#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // nta
