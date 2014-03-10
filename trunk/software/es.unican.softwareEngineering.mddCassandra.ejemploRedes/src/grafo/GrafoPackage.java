/**
 */
package grafo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see grafo.GrafoFactory
 * @model kind="package"
 * @generated
 */
public interface GrafoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grafo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://grafo/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grafo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrafoPackage eINSTANCE = grafo.impl.GrafoPackageImpl.init();

	/**
	 * The meta object id for the '{@link grafo.impl.GrafoImpl <em>Grafo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.GrafoImpl
	 * @see grafo.impl.GrafoPackageImpl#getGrafo()
	 * @generated
	 */
	int GRAFO = 0;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO__CONEXIONES = 0;

	/**
	 * The number of structural features of the '<em>Grafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grafo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafo.impl.AristaImpl <em>Arista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.AristaImpl
	 * @see grafo.impl.GrafoPackageImpl#getArista()
	 * @generated
	 */
	int ARISTA = 1;

	/**
	 * The number of structural features of the '<em>Arista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARISTA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Arista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARISTA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafo.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.impl.NodoImpl
	 * @see grafo.impl.GrafoPackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 2;

	/**
	 * The feature id for the '<em><b>Nodos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__NODOS = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__COLOR = 1;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grafo.TColor <em>TColor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grafo.TColor
	 * @see grafo.impl.GrafoPackageImpl#getTColor()
	 * @generated
	 */
	int TCOLOR = 3;


	/**
	 * Returns the meta object for class '{@link grafo.Grafo <em>Grafo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grafo</em>'.
	 * @see grafo.Grafo
	 * @generated
	 */
	EClass getGrafo();

	/**
	 * Returns the meta object for the containment reference list '{@link grafo.Grafo#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conexiones</em>'.
	 * @see grafo.Grafo#getConexiones()
	 * @see #getGrafo()
	 * @generated
	 */
	EReference getGrafo_Conexiones();

	/**
	 * Returns the meta object for class '{@link grafo.Arista <em>Arista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arista</em>'.
	 * @see grafo.Arista
	 * @generated
	 */
	EClass getArista();

	/**
	 * Returns the meta object for class '{@link grafo.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see grafo.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the containment reference list '{@link grafo.Nodo#getNodos <em>Nodos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodos</em>'.
	 * @see grafo.Nodo#getNodos()
	 * @see #getNodo()
	 * @generated
	 */
	EReference getNodo_Nodos();

	/**
	 * Returns the meta object for the attribute '{@link grafo.Nodo#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see grafo.Nodo#getColor()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_Color();

	/**
	 * Returns the meta object for enum '{@link grafo.TColor <em>TColor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TColor</em>'.
	 * @see grafo.TColor
	 * @generated
	 */
	EEnum getTColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrafoFactory getGrafoFactory();

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
		 * The meta object literal for the '{@link grafo.impl.GrafoImpl <em>Grafo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.GrafoImpl
		 * @see grafo.impl.GrafoPackageImpl#getGrafo()
		 * @generated
		 */
		EClass GRAFO = eINSTANCE.getGrafo();

		/**
		 * The meta object literal for the '<em><b>Conexiones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAFO__CONEXIONES = eINSTANCE.getGrafo_Conexiones();

		/**
		 * The meta object literal for the '{@link grafo.impl.AristaImpl <em>Arista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.AristaImpl
		 * @see grafo.impl.GrafoPackageImpl#getArista()
		 * @generated
		 */
		EClass ARISTA = eINSTANCE.getArista();

		/**
		 * The meta object literal for the '{@link grafo.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.impl.NodoImpl
		 * @see grafo.impl.GrafoPackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Nodos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODO__NODOS = eINSTANCE.getNodo_Nodos();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__COLOR = eINSTANCE.getNodo_Color();

		/**
		 * The meta object literal for the '{@link grafo.TColor <em>TColor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grafo.TColor
		 * @see grafo.impl.GrafoPackageImpl#getTColor()
		 * @generated
		 */
		EEnum TCOLOR = eINSTANCE.getTColor();

	}

} //GrafoPackage
