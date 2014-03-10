/**
 */
package red;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link red.Nodo#getNameNodo <em>Name Nodo</em>}</li>
 * </ul>
 * </p>
 *
 * @see red.RedPackage#getNodo()
 * @model
 * @generated
 */
public interface Nodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Name Nodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Nodo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Nodo</em>' attribute.
	 * @see #setNameNodo(String)
	 * @see red.RedPackage#getNodo_NameNodo()
	 * @model
	 * @generated
	 */
	String getNameNodo();

	/**
	 * Sets the value of the '{@link red.Nodo#getNameNodo <em>Name Nodo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Nodo</em>' attribute.
	 * @see #getNameNodo()
	 * @generated
	 */
	void setNameNodo(String value);

} // Nodo
