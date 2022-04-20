/**
 */
package UPPAALModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.Template#getName <em>Name</em>}</li>
 *   <li>{@link UPPAALModel.Template#getParameter <em>Parameter</em>}</li>
 *   <li>{@link UPPAALModel.Template#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link UPPAALModel.Template#getLocation <em>Location</em>}</li>
 *   <li>{@link UPPAALModel.Template#getInit <em>Init</em>}</li>
 *   <li>{@link UPPAALModel.Template#getTransition <em>Transition</em>}</li>
 *   <li>{@link UPPAALModel.Template#getNameTemplate <em>Name Template</em>}</li>
 * </ul>
 *
 * @see UPPAALModel.UPPAALModelPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Name()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link UPPAALModel.Template#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(Parameter)
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link UPPAALModel.Template#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference.
	 * @see #setDeclaration(Declaration)
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	Declaration getDeclaration();

	/**
	 * Sets the value of the '{@link UPPAALModel.Template#getDeclaration <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' containment reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(Declaration value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link UPPAALModel.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init</em>' containment reference.
	 * @see #setInit(Init)
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Init()
	 * @model containment="true"
	 * @generated
	 */
	Init getInit();

	/**
	 * Sets the value of the '{@link UPPAALModel.Template#getInit <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init</em>' containment reference.
	 * @see #getInit()
	 * @generated
	 */
	void setInit(Init value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link UPPAALModel.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_Transition()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Name Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Template</em>' attribute.
	 * @see #setNameTemplate(String)
	 * @see UPPAALModel.UPPAALModelPackage#getTemplate_NameTemplate()
	 * @model
	 * @generated
	 */
	String getNameTemplate();

	/**
	 * Sets the value of the '{@link UPPAALModel.Template#getNameTemplate <em>Name Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Template</em>' attribute.
	 * @see #getNameTemplate()
	 * @generated
	 */
	void setNameTemplate(String value);

} // Template
