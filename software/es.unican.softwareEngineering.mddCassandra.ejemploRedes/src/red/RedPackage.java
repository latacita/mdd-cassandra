/**
 */
package red;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see red.RedFactory
 * @model kind="package"
 * @generated
 */
public interface RedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "red";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://red/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "red";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedPackage eINSTANCE = red.impl.RedPackageImpl.init();

	/**
	 * The meta object id for the '{@link red.impl.NodoImpl <em>Nodo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.NodoImpl
	 * @see red.impl.RedPackageImpl#getNodo()
	 * @generated
	 */
	int NODO = 0;

	/**
	 * The feature id for the '<em><b>Name Nodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO__NAME_NODO = 0;

	/**
	 * The number of structural features of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nodo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.PCImpl <em>PC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.PCImpl
	 * @see red.impl.RedPackageImpl#getPC()
	 * @generated
	 */
	int PC = 1;

	/**
	 * The feature id for the '<em><b>Name Nodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC__NAME_NODO = NODO__NAME_NODO;

	/**
	 * The number of structural features of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_FEATURE_COUNT = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>PC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PC_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link red.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.RouterImpl
	 * @see red.impl.RedPackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 2;

	/**
	 * The feature id for the '<em><b>Name Nodo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME_NODO = NODO__NAME_NODO;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = NODO_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = NODO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link red.impl.CableImpl <em>Cable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.CableImpl
	 * @see red.impl.RedPackageImpl#getCable()
	 * @generated
	 */
	int CABLE = 3;

	/**
	 * The feature id for the '<em><b>Conexiones</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__CONEXIONES = 0;

	/**
	 * The feature id for the '<em><b>Name Cable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE__NAME_CABLE = 1;

	/**
	 * The number of structural features of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link red.impl.RedImpl <em>Red</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see red.impl.RedImpl
	 * @see red.impl.RedPackageImpl#getRed()
	 * @generated
	 */
	int RED = 4;

	/**
	 * The feature id for the '<em><b>Formado De</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED__FORMADO_DE = 0;

	/**
	 * The number of structural features of the '<em>Red</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Red</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RED_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link red.Nodo <em>Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nodo</em>'.
	 * @see red.Nodo
	 * @generated
	 */
	EClass getNodo();

	/**
	 * Returns the meta object for the attribute '{@link red.Nodo#getNameNodo <em>Name Nodo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Nodo</em>'.
	 * @see red.Nodo#getNameNodo()
	 * @see #getNodo()
	 * @generated
	 */
	EAttribute getNodo_NameNodo();

	/**
	 * Returns the meta object for class '{@link red.PC <em>PC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PC</em>'.
	 * @see red.PC
	 * @generated
	 */
	EClass getPC();

	/**
	 * Returns the meta object for class '{@link red.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see red.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link red.Cable <em>Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cable</em>'.
	 * @see red.Cable
	 * @generated
	 */
	EClass getCable();

	/**
	 * Returns the meta object for the reference list '{@link red.Cable#getConexiones <em>Conexiones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Conexiones</em>'.
	 * @see red.Cable#getConexiones()
	 * @see #getCable()
	 * @generated
	 */
	EReference getCable_Conexiones();

	/**
	 * Returns the meta object for the attribute '{@link red.Cable#getNameCable <em>Name Cable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Cable</em>'.
	 * @see red.Cable#getNameCable()
	 * @see #getCable()
	 * @generated
	 */
	EAttribute getCable_NameCable();

	/**
	 * Returns the meta object for class '{@link red.Red <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Red</em>'.
	 * @see red.Red
	 * @generated
	 */
	EClass getRed();

	/**
	 * Returns the meta object for the containment reference list '{@link red.Red#getFormadoDe <em>Formado De</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formado De</em>'.
	 * @see red.Red#getFormadoDe()
	 * @see #getRed()
	 * @generated
	 */
	EReference getRed_FormadoDe();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RedFactory getRedFactory();

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
		 * The meta object literal for the '{@link red.impl.NodoImpl <em>Nodo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.NodoImpl
		 * @see red.impl.RedPackageImpl#getNodo()
		 * @generated
		 */
		EClass NODO = eINSTANCE.getNodo();

		/**
		 * The meta object literal for the '<em><b>Name Nodo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODO__NAME_NODO = eINSTANCE.getNodo_NameNodo();

		/**
		 * The meta object literal for the '{@link red.impl.PCImpl <em>PC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.PCImpl
		 * @see red.impl.RedPackageImpl#getPC()
		 * @generated
		 */
		EClass PC = eINSTANCE.getPC();

		/**
		 * The meta object literal for the '{@link red.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.RouterImpl
		 * @see red.impl.RedPackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();

		/**
		 * The meta object literal for the '{@link red.impl.CableImpl <em>Cable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.CableImpl
		 * @see red.impl.RedPackageImpl#getCable()
		 * @generated
		 */
		EClass CABLE = eINSTANCE.getCable();

		/**
		 * The meta object literal for the '<em><b>Conexiones</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABLE__CONEXIONES = eINSTANCE.getCable_Conexiones();

		/**
		 * The meta object literal for the '<em><b>Name Cable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABLE__NAME_CABLE = eINSTANCE.getCable_NameCable();

		/**
		 * The meta object literal for the '{@link red.impl.RedImpl <em>Red</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see red.impl.RedImpl
		 * @see red.impl.RedPackageImpl#getRed()
		 * @generated
		 */
		EClass RED = eINSTANCE.getRed();

		/**
		 * The meta object literal for the '<em><b>Formado De</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RED__FORMADO_DE = eINSTANCE.getRed_FormadoDe();

	}

} //RedPackage
