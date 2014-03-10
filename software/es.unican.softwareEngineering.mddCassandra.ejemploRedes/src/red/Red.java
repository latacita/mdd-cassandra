/**
 */
package red;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Red</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link red.Red#getFormadoDe <em>Formado De</em>}</li>
 * </ul>
 * </p>
 *
 * @see red.RedPackage#getRed()
 * @model
 * @generated
 */
public interface Red extends EObject {
	/**
	 * Returns the value of the '<em><b>Formado De</b></em>' containment reference list.
	 * The list contents are of type {@link red.Cable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formado De</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formado De</em>' containment reference list.
	 * @see red.RedPackage#getRed_FormadoDe()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cable> getFormadoDe();

} // Red
