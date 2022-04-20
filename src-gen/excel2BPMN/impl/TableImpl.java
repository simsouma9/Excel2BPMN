/**
 */
package excel2BPMN.impl;

import excel2BPMN.Column;
import excel2BPMN.Excel2BPMNPackage;
import excel2BPMN.Raw;
import excel2BPMN.Table;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link excel2BPMN.impl.TableImpl#getColomn <em>Colomn</em>}</li>
 *   <li>{@link excel2BPMN.impl.TableImpl#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends MinimalEObjectImpl.Container implements Table {
	/**
	 * The cached value of the '{@link #getColomn() <em>Colomn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColomn()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> colomn;

	/**
	 * The cached value of the '{@link #getRaw() <em>Raw</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRaw()
	 * @generated
	 * @ordered
	 */
	protected EList<Raw> raw;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Excel2BPMNPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColomn() {
		if (colomn == null) {
			colomn = new EObjectContainmentEList<Column>(Column.class, this, Excel2BPMNPackage.TABLE__COLOMN);
		}
		return colomn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Raw> getRaw() {
		if (raw == null) {
			raw = new EObjectContainmentEList<Raw>(Raw.class, this, Excel2BPMNPackage.TABLE__RAW);
		}
		return raw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Excel2BPMNPackage.TABLE__COLOMN:
			return ((InternalEList<?>) getColomn()).basicRemove(otherEnd, msgs);
		case Excel2BPMNPackage.TABLE__RAW:
			return ((InternalEList<?>) getRaw()).basicRemove(otherEnd, msgs);
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
		case Excel2BPMNPackage.TABLE__COLOMN:
			return getColomn();
		case Excel2BPMNPackage.TABLE__RAW:
			return getRaw();
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
		case Excel2BPMNPackage.TABLE__COLOMN:
			getColomn().clear();
			getColomn().addAll((Collection<? extends Column>) newValue);
			return;
		case Excel2BPMNPackage.TABLE__RAW:
			getRaw().clear();
			getRaw().addAll((Collection<? extends Raw>) newValue);
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
		case Excel2BPMNPackage.TABLE__COLOMN:
			getColomn().clear();
			return;
		case Excel2BPMNPackage.TABLE__RAW:
			getRaw().clear();
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
		case Excel2BPMNPackage.TABLE__COLOMN:
			return colomn != null && !colomn.isEmpty();
		case Excel2BPMNPackage.TABLE__RAW:
			return raw != null && !raw.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
