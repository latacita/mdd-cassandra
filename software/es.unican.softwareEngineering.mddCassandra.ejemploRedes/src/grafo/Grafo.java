/**
 */
package grafo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grafo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link grafo.Grafo#getConexiones <em>Conexiones</em>}</li>
 * </ul>
 * </p>
 *
 * @see grafo.GrafoPackage#getGrafo()
 * @model
 * @generated
 */
public interface Grafo extends EObject {
	/**
	 * Returns the value of the '<em><b>Conexiones</b></em>' containment reference list.
	 * The list contents are of type {@link grafo.Nodo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conexiones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conexiones</em>' containment reference list.
	 * @see grafo.GrafoPackage#getGrafo_Conexiones()
	 * @model containment="true"
	 * @generated
	 */
	EList<Nodo> getConexiones();

} // Grafo
