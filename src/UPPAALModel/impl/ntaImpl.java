/**
 */
package UPPAALModel.impl;

import UPPAALModel.Declaration;
import UPPAALModel.Template;
import UPPAALModel.UPPAALModelPackage;
import UPPAALModel.nta;

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
 * An implementation of the model object '<em><b>nta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.impl.ntaImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link UPPAALModel.impl.ntaImpl#getTemplate <em>Template</em>}</li>
 *   <li>{@link UPPAALModel.impl.ntaImpl#getSystem <em>System</em>}</li>
 *   <li>{@link UPPAALModel.impl.ntaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ntaImpl extends MinimalEObjectImpl.Container implements nta {
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
	 * The cached value of the '{@link #getTemplate() <em>Template</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplate()
	 * @generated
	 * @ordered
	 */
	protected EList<Template> template;

	/**
	 * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem()
	 * @generated
	 * @ordered
	 */
	protected UPPAALModel.System system;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPPAALModelPackage.Literals.NTA;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.NTA__DECLARATION, oldDeclaration, newDeclaration);
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
				msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.NTA__DECLARATION, null, msgs);
			if (newDeclaration != null)
				msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.NTA__DECLARATION, null, msgs);
			msgs = basicSetDeclaration(newDeclaration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.NTA__DECLARATION, newDeclaration, newDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Template> getTemplate() {
		if (template == null) {
			template = new EObjectContainmentEList<Template>(Template.class, this, UPPAALModelPackage.NTA__TEMPLATE);
		}
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UPPAALModel.System getSystem() {
		return system;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystem(UPPAALModel.System newSystem, NotificationChain msgs) {
		UPPAALModel.System oldSystem = system;
		system = newSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.NTA__SYSTEM, oldSystem, newSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem(UPPAALModel.System newSystem) {
		if (newSystem != system) {
			NotificationChain msgs = null;
			if (system != null)
				msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.NTA__SYSTEM, null, msgs);
			if (newSystem != null)
				msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.NTA__SYSTEM, null, msgs);
			msgs = basicSetSystem(newSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.NTA__SYSTEM, newSystem, newSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.NTA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UPPAALModelPackage.NTA__DECLARATION:
				return basicSetDeclaration(null, msgs);
			case UPPAALModelPackage.NTA__TEMPLATE:
				return ((InternalEList<?>)getTemplate()).basicRemove(otherEnd, msgs);
			case UPPAALModelPackage.NTA__SYSTEM:
				return basicSetSystem(null, msgs);
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
			case UPPAALModelPackage.NTA__DECLARATION:
				return getDeclaration();
			case UPPAALModelPackage.NTA__TEMPLATE:
				return getTemplate();
			case UPPAALModelPackage.NTA__SYSTEM:
				return getSystem();
			case UPPAALModelPackage.NTA__NAME:
				return getName();
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
			case UPPAALModelPackage.NTA__DECLARATION:
				setDeclaration((Declaration)newValue);
				return;
			case UPPAALModelPackage.NTA__TEMPLATE:
				getTemplate().clear();
				getTemplate().addAll((Collection<? extends Template>)newValue);
				return;
			case UPPAALModelPackage.NTA__SYSTEM:
				setSystem((UPPAALModel.System)newValue);
				return;
			case UPPAALModelPackage.NTA__NAME:
				setName((String)newValue);
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
			case UPPAALModelPackage.NTA__DECLARATION:
				setDeclaration((Declaration)null);
				return;
			case UPPAALModelPackage.NTA__TEMPLATE:
				getTemplate().clear();
				return;
			case UPPAALModelPackage.NTA__SYSTEM:
				setSystem((UPPAALModel.System)null);
				return;
			case UPPAALModelPackage.NTA__NAME:
				setName(NAME_EDEFAULT);
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
			case UPPAALModelPackage.NTA__DECLARATION:
				return declaration != null;
			case UPPAALModelPackage.NTA__TEMPLATE:
				return template != null && !template.isEmpty();
			case UPPAALModelPackage.NTA__SYSTEM:
				return system != null;
			case UPPAALModelPackage.NTA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ntaImpl
