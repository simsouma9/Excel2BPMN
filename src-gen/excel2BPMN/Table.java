/**
 */
package excel2BPMN;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link excel2BPMN.Table#getColomn <em>Colomn</em>}</li>
 *   <li>{@link excel2BPMN.Table#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @see excel2BPMN.Excel2BPMNPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends EObject {
	/**
	 * Returns the value of the '<em><b>Colomn</b></em>' containment reference list.
	 * The list contents are of type {@link excel2BPMN.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colomn</em>' containment reference list.
	 * @see excel2BPMN.Excel2BPMNPackage#getTable_Colomn()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColomn();

	/**
	 * Returns the value of the '<em><b>Raw</b></em>' containment reference list.
	 * The list contents are of type {@link excel2BPMN.Raw}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Raw</em>' containment reference list.
	 * @see excel2BPMN.Excel2BPMNPackage#getTable_Raw()
	 * @model containment="true"
	 * @generated
	 */
	EList<Raw> getRaw();

} // Table
