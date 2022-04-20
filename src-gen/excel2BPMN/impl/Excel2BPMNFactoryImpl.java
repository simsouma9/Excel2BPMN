/**
 */
package excel2BPMN.impl;

import excel2BPMN.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Excel2BPMNFactoryImpl extends EFactoryImpl implements Excel2BPMNFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Excel2BPMNFactory init() {
		try {
			Excel2BPMNFactory theExcel2BPMNFactory = (Excel2BPMNFactory) EPackage.Registry.INSTANCE
					.getEFactory(Excel2BPMNPackage.eNS_URI);
			if (theExcel2BPMNFactory != null) {
				return theExcel2BPMNFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Excel2BPMNFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel2BPMNFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Excel2BPMNPackage.TABLE:
			return createTable();
		case Excel2BPMNPackage.RAW:
			return createRaw();
		case Excel2BPMNPackage.COLUMN:
			return createColumn();
		case Excel2BPMNPackage.EXCEL:
			return createExcel();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Raw createRaw() {
		RawImpl raw = new RawImpl();
		return raw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel createExcel() {
		ExcelImpl excel = new ExcelImpl();
		return excel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Excel2BPMNPackage getExcel2BPMNPackage() {
		return (Excel2BPMNPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Excel2BPMNPackage getPackage() {
		return Excel2BPMNPackage.eINSTANCE;
	}

} //Excel2BPMNFactoryImpl
