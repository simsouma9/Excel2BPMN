/**
 */
package excel2BPMN;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see excel2BPMN.Excel2BPMNFactory
 * @model kind="package"
 * @generated
 */
public interface Excel2BPMNPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "excel2BPMN";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/excel2BPMN";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "excel2BPMN";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Excel2BPMNPackage eINSTANCE = excel2BPMN.impl.Excel2BPMNPackageImpl.init();

	/**
	 * The meta object id for the '{@link excel2BPMN.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see excel2BPMN.impl.TableImpl
	 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Colomn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLOMN = 0;

	/**
	 * The feature id for the '<em><b>Raw</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RAW = 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link excel2BPMN.impl.RawImpl <em>Raw</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see excel2BPMN.impl.RawImpl
	 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getRaw()
	 * @generated
	 */
	int RAW = 1;

	/**
	 * The number of structural features of the '<em>Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Raw</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link excel2BPMN.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see excel2BPMN.impl.ColumnImpl
	 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link excel2BPMN.impl.ExcelImpl <em>Excel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see excel2BPMN.impl.ExcelImpl
	 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getExcel()
	 * @generated
	 */
	int EXCEL = 3;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL__TABLE = 0;

	/**
	 * The number of structural features of the '<em>Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Excel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link excel2BPMN.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see excel2BPMN.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link excel2BPMN.Table#getColomn <em>Colomn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colomn</em>'.
	 * @see excel2BPMN.Table#getColomn()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Colomn();

	/**
	 * Returns the meta object for the containment reference list '{@link excel2BPMN.Table#getRaw <em>Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Raw</em>'.
	 * @see excel2BPMN.Table#getRaw()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Raw();

	/**
	 * Returns the meta object for class '{@link excel2BPMN.Raw <em>Raw</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raw</em>'.
	 * @see excel2BPMN.Raw
	 * @generated
	 */
	EClass getRaw();

	/**
	 * Returns the meta object for class '{@link excel2BPMN.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see excel2BPMN.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link excel2BPMN.Excel <em>Excel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excel</em>'.
	 * @see excel2BPMN.Excel
	 * @generated
	 */
	EClass getExcel();

	/**
	 * Returns the meta object for the containment reference list '{@link excel2BPMN.Excel#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see excel2BPMN.Excel#getTable()
	 * @see #getExcel()
	 * @generated
	 */
	EReference getExcel_Table();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Excel2BPMNFactory getExcel2BPMNFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link excel2BPMN.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see excel2BPMN.impl.TableImpl
		 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Colomn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLOMN = eINSTANCE.getTable_Colomn();

		/**
		 * The meta object literal for the '<em><b>Raw</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__RAW = eINSTANCE.getTable_Raw();

		/**
		 * The meta object literal for the '{@link excel2BPMN.impl.RawImpl <em>Raw</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see excel2BPMN.impl.RawImpl
		 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getRaw()
		 * @generated
		 */
		EClass RAW = eINSTANCE.getRaw();

		/**
		 * The meta object literal for the '{@link excel2BPMN.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see excel2BPMN.impl.ColumnImpl
		 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link excel2BPMN.impl.ExcelImpl <em>Excel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see excel2BPMN.impl.ExcelImpl
		 * @see excel2BPMN.impl.Excel2BPMNPackageImpl#getExcel()
		 * @generated
		 */
		EClass EXCEL = eINSTANCE.getExcel();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEL__TABLE = eINSTANCE.getExcel_Table();

	}

} //Excel2BPMNPackage
