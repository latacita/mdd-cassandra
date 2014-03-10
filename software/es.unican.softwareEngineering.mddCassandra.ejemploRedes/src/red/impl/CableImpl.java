/**
 */
package red.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import red.Cable;
import red.Nodo;
import red.RedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link red.impl.CableImpl#getConexiones <em>Conexiones</em>}</li>
 *   <li>{@link red.impl.CableImpl#getNameCable <em>Name Cable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CableImpl extends MinimalEObjectImpl.Container implements Cable {
	/**
	 * The cached value of the '{@link #getConexiones() <em>Conexiones</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConexiones()
	 * @generated
	 * @ordered
	 */
	protected EList<Nodo> conexiones;

	/**
	 * The default value of the '{@link #getNameCable() <em>Name Cable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCable()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_CABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNameCable() <em>Name Cable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNameCable()
	 * @generated
	 * @ordered
	 */
	protected String nameCable = NAME_CABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.CABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Nodo> getConexiones() {
		if (conexiones == null) {
			conexiones = new EObjectResolvingEList<Nodo>(Nodo.class, this, RedPackage.CABLE__CONEXIONES);
		}
		return conexiones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNameCable() {
		return nameCable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNameCable(String newNameCable) {
		String oldNameCable = nameCable;
		nameCable = newNameCable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RedPackage.CABLE__NAME_CABLE, oldNameCable, nameCable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.CABLE__CONEXIONES:
				return getConexiones();
			case RedPackage.CABLE__NAME_CABLE:
				return getNameCable();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RedPackage.CABLE__CONEXIONES:
				getConexiones().clear();
				getConexiones().addAll((Collection<? extends Nodo>)newValue);
				return;
			case RedPackage.CABLE__NAME_CABLE:
				setNameCable((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RedPackage.CABLE__CONEXIONES:
				getConexiones().clear();
				return;
			case RedPackage.CABLE__NAME_CABLE:
				setNameCable(NAME_CABLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RedPackage.CABLE__CONEXIONES:
				return conexiones != null && !conexiones.isEmpty();
			case RedPackage.CABLE__NAME_CABLE:
				return NAME_CABLE_EDEFAULT == null ? nameCable != null : !NAME_CABLE_EDEFAULT.equals(nameCable);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nameCable: ");
		result.append(nameCable);
		result.append(')');
		return result.toString();
	}

} //CableImpl
