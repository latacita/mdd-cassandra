/**
 */
package grafo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nodo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.Nodo#getNodos <em>Nodos</em>}</li>
 *   <li>{@link grafo.Nodo#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getNodo()
 * @model
 * @generated
 */
public interface Nodo extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodos</b></em>' containment reference list.
	 * The list contents are of type {@link grafo.Arista}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodos</em>' containment reference list.
	 * @see grafo.GrafoPackage#getNodo_Nodos()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Arista> getNodos();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link grafo.TColor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see grafo.TColor
	 * @see #setColor(TColor)
	 * @see grafo.GrafoPackage#getNodo_Color()
	 * @model
	 * @generated
	 */
	TColor getColor();

	/**
	 * Sets the value of the '{@link grafo.Nodo#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see grafo.TColor
	 * @see #getColor()
	 * @generated
	 */
	void setColor(TColor value);

} // Nodo
