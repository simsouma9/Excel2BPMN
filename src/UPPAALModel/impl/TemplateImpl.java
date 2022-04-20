/**
 */
package UPPAALModel.impl;

import UPPAALModel.Declaration;
import UPPAALModel.Init;
import UPPAALModel.Location;
import UPPAALModel.Name;
import UPPAALModel.Parameter;
import UPPAALModel.Template;
import UPPAALModel.Transition;
import UPPAALModel.UPPAALModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getName <em>Name</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getInit <em>Init</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link UPPAALModel.impl.TemplateImpl#getNameTemplate <em>Name Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends MinimalEObjectImpl.Container implements Template {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter parameter;

	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected Declaration declaration;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getInit() <em>Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInit()
	 * @generated
	 * @ordered
	 */
	protected Init init;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transition;

	/**
	 * The default value of the '{@link #getNameTemplate() <em>Name Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameTemplate() <em>Name Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameTemplate()
	 * @generated
	 * @ordered
	 */
	protected String nameTemplate = NAME_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPPAALModelPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getParameter() {
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(Parameter newParameter, NotificationChain msgs) {
		Parameter oldParameter = parameter;
		parameter = newParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__PARAMETER, oldParameter, newParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(Parameter newParameter) {
		if (newParameter != parameter) {
			NotificationChain msgs = null;
			if (parameter != null)
				msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__PARAMETER, null, msgs);
			if (newParameter != null)
				msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__PARAMETER, null, msgs);
			msgs = basicSetParameter(newParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__PARAMETER, newParameter, newParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Declaration getDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs) {
		Declaration oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__DECLARATION, oldDeclaration, newDeclaration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(Declaration newDeclaration) {
		if (newDeclaration != declaration) {
			NotificationChain msgs = null;
			if (declaration != null)
				msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__DECLARATION, newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, UPPAALModelPackage.TEMPLATE__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Init getInit() {
		return init;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInit(Init newInit, NotificationChain msgs) {
		Init oldInit = init;
		init = newInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__INIT, oldInit, newInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInit(Init newInit) {
		if (newInit != init) {
			NotificationChain msgs = null;
			if (init != null)
				msgs = ((InternalEObject)init).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__INIT, null, msgs);
			if (newInit != null)
				msgs = ((InternalEObject)newInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TEMPLATE__INIT, null, msgs);
			msgs = basicSetInit(newInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__INIT, newInit, newInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransition() {
		if (transition == null) {
			transition = new EObjectContainmentEList<Transition>(Transition.class, this, UPPAALModelPackage.TEMPLATE__TRANSITION);
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameTemplate() {
		return nameTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameTemplate(String newNameTemplate) {
		String oldNameTemplate = nameTemplate;
		nameTemplate = newNameTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TEMPLATE__NAME_TEMPLATE, oldNameTemplate, nameTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UPPAALModelPackage.TEMPLATE__NAME:
				return basicSetName(null, msgs);
			case UPPAALModelPackage.TEMPLATE__PARAMETER:
				return basicSetParameter(null, msgs);
			case UPPAALModelPackage.TEMPLATE__DECLARATION:
				return basicSetDeclaration(null, msgs);
			case UPPAALModelPackage.TEMPLATE__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case UPPAALModelPackage.TEMPLATE__INIT:
				return basicSetInit(null, msgs);
			case UPPAALModelPackage.TEMPLATE__TRANSITION:
				return ((InternalEList<?>)getTransition()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UPPAALModelPackage.TEMPLATE__NAME:
				return getName();
			case UPPAALModelPackage.TEMPLATE__PARAMETER:
				return getParameter();
			case UPPAALModelPackage.TEMPLATE__DECLARATION:
				return getDeclaration();
			case UPPAALModelPackage.TEMPLATE__LOCATION:
				return getLocation();
			case UPPAALModelPackage.TEMPLATE__INIT:
				return getInit();
			case UPPAALModelPackage.TEMPLATE__TRANSITION:
				return getTransition();
			case UPPAALModelPackage.TEMPLATE__NAME_TEMPLATE:
				return getNameTemplate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UPPAALModelPackage.TEMPLATE__NAME:
				setName((Name)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__PARAMETER:
				setParameter((Parameter)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__DECLARATION:
				setDeclaration((Declaration)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__INIT:
				setInit((Init)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__TRANSITION:
				getTransition().clear();
				getTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case UPPAALModelPackage.TEMPLATE__NAME_TEMPLATE:
				setNameTemplate((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case UPPAALModelPackage.TEMPLATE__NAME:
				setName((Name)null);
				return;
			case UPPAALModelPackage.TEMPLATE__PARAMETER:
				setParameter((Parameter)null);
				return;
			case UPPAALModelPackage.TEMPLATE__DECLARATION:
				setDeclaration((Declaration)null);
				return;
			case UPPAALModelPackage.TEMPLATE__LOCATION:
				getLocation().clear();
				return;
			case UPPAALModelPackage.TEMPLATE__INIT:
				setInit((Init)null);
				return;
			case UPPAALModelPackage.TEMPLATE__TRANSITION:
				getTransition().clear();
				return;
			case UPPAALModelPackage.TEMPLATE__NAME_TEMPLATE:
				setNameTemplate(NAME_TEMPLATE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UPPAALModelPackage.TEMPLATE__NAME:
				return name != null;
			case UPPAALModelPackage.TEMPLATE__PARAMETER:
				return parameter != null;
			case UPPAALModelPackage.TEMPLATE__DECLARATION:
				return declaration != null;
			case UPPAALModelPackage.TEMPLATE__LOCATION:
				return location != null && !location.isEmpty();
			case UPPAALModelPackage.TEMPLATE__INIT:
				return init != null;
			case UPPAALModelPackage.TEMPLATE__TRANSITION:
				return transition != null && !transition.isEmpty();
			case UPPAALModelPackage.TEMPLATE__NAME_TEMPLATE:
				return NAME_TEMPLATE_EDEFAULT == null ? nameTemplate != null : !NAME_TEMPLATE_EDEFAULT.equals(nameTemplate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nameTemplate: ");
		result.append(nameTemplate);
		result.append(')');
		return result.toString();
	}

} //TemplateImpl
