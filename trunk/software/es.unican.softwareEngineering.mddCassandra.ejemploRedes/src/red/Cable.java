/**
 */
package red;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link red.Cable#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link red.Cable#getNameCable <em>Name Cable</em>}</li>
 * </ul>
 * </p>
 *
 * @see red.RedPackage#getCable()
 * @model
 * @generated
 */
public interface Cable extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexiones</b></em>' reference list.
	 * The list contents are of type {@link red.Nodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conexiones</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexiones</em>' reference list.
	 * @see red.RedPackage#getCable_Conexiones()
	 * @model lower="2" upper="2"
	 * @generated
	 */
	EList<Nodo> getConexiones();

	/**
	 * Returns the value of the '<em><b>Name Cable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Cable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Cable</em>' attribute.
	 * @see #setNameCable(String)
	 * @see red.RedPackage#getCable_NameCable()
	 * @model
	 * @generated
	 */
	String getNameCable();

	/**
	 * Sets the value of the '{@link red.Cable#getNameCable <em>Name Cable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Cable</em>' attribute.
	 * @see #getNameCable()
	 * @generated
	 */
	void setNameCable(String value);

} // Cable
