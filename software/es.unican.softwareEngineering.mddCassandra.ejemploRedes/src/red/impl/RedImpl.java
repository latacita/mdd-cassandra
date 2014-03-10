/**
 */
package red.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import red.Cable;
import red.Red;
import red.RedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Red</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link red.impl.RedImpl#getFormadoDe <em>Formado De</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RedImpl extends MinimalEObjectImpl.Container implements Red {
	/**
	 * The cached value of the '{@link #getFormadoDe() <em>Formado De</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormadoDe()
	 * @generated
	 * @ordered
	 */
	protected EList<Cable> formadoDe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RedPackage.Literals.RED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cable> getFormadoDe() {
		if (formadoDe == null) {
			formadoDe = new EObjectContainmentEList<Cable>(Cable.class, this, RedPackage.RED__FORMADO_DE);
		}
		return formadoDe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RedPackage.RED__FORMADO_DE:
				return ((InternalEList<?>)getFormadoDe()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RedPackage.RED__FORMADO_DE:
				return getFormadoDe();
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
			case RedPackage.RED__FORMADO_DE:
				getFormadoDe().clear();
				getFormadoDe().addAll((Collection<? extends Cable>)newValue);
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
			case RedPackage.RED__FORMADO_DE:
				getFormadoDe().clear();
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
			case RedPackage.RED__FORMADO_DE:
				return formadoDe != null && !formadoDe.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RedImpl
