/**
 */
package UPPAALModel.impl;

import UPPAALModel.Label;
import UPPAALModel.Location;
import UPPAALModel.Source;
import UPPAALModel.Target;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link UPPAALModel.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Target target;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> label;

	/**
	 * The cached value of the '{@link #getTg() <em>Tg</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTg()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> tg;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> src;

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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UPPAALModelPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TRANSITION__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TRANSITION__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs) {
		Target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TRANSITION__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UPPAALModelPackage.TRANSITION__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<Label>(Label.class, this, UPPAALModelPackage.TRANSITION__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getTg() {
		if (tg == null) {
			tg = new EObjectResolvingEList<Location>(Location.class, this, UPPAALModelPackage.TRANSITION__TG);
		}
		return tg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getSrc() {
		if (src == null) {
			src = new EObjectResolvingEList<Location>(Location.class, this, UPPAALModelPackage.TRANSITION__SRC);
		}
		return src;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UPPAALModelPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UPPAALModelPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case UPPAALModelPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case UPPAALModelPackage.TRANSITION__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case UPPAALModelPackage.TRANSITION__SOURCE:
				return getSource();
			case UPPAALModelPackage.TRANSITION__TARGET:
				return getTarget();
			case UPPAALModelPackage.TRANSITION__LABEL:
				return getLabel();
			case UPPAALModelPackage.TRANSITION__TG:
				return getTg();
			case UPPAALModelPackage.TRANSITION__SRC:
				return getSrc();
			case UPPAALModelPackage.TRANSITION__NAME:
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
			case UPPAALModelPackage.TRANSITION__SOURCE:
				setSource((Source)newValue);
				return;
			case UPPAALModelPackage.TRANSITION__TARGET:
				setTarget((Target)newValue);
				return;
			case UPPAALModelPackage.TRANSITION__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends Label>)newValue);
				return;
			case UPPAALModelPackage.TRANSITION__TG:
				getTg().clear();
				getTg().addAll((Collection<? extends Location>)newValue);
				return;
			case UPPAALModelPackage.TRANSITION__SRC:
				getSrc().clear();
				getSrc().addAll((Collection<? extends Location>)newValue);
				return;
			case UPPAALModelPackage.TRANSITION__NAME:
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
			case UPPAALModelPackage.TRANSITION__SOURCE:
				setSource((Source)null);
				return;
			case UPPAALModelPackage.TRANSITION__TARGET:
				setTarget((Target)null);
				return;
			case UPPAALModelPackage.TRANSITION__LABEL:
				getLabel().clear();
				return;
			case UPPAALModelPackage.TRANSITION__TG:
				getTg().clear();
				return;
			case UPPAALModelPackage.TRANSITION__SRC:
				getSrc().clear();
				return;
			case UPPAALModelPackage.TRANSITION__NAME:
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
			case UPPAALModelPackage.TRANSITION__SOURCE:
				return source != null;
			case UPPAALModelPackage.TRANSITION__TARGET:
				return target != null;
			case UPPAALModelPackage.TRANSITION__LABEL:
				return label != null && !label.isEmpty();
			case UPPAALModelPackage.TRANSITION__TG:
				return tg != null && !tg.isEmpty();
			case UPPAALModelPackage.TRANSITION__SRC:
				return src != null && !src.isEmpty();
			case UPPAALModelPackage.TRANSITION__NAME:
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

} //TransitionImpl
