/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc4.impl;

/******************************************************************************
 * Copyright (C) 2009-2019  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see {@literal<http://www.gnu.org/licenses/>}.
 *****************************************************************************/

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcCurve;
import org.bimserver.models.ifc4.IfcTrimmedCurve;
import org.bimserver.models.ifc4.IfcTrimmingPreference;
import org.bimserver.models.ifc4.IfcTrimmingSelect;
import org.bimserver.models.ifc4.Tristate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Trimmed Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTrimmedCurveImpl#getBasisCurve <em>Basis Curve</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTrimmedCurveImpl#getTrim1 <em>Trim1</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTrimmedCurveImpl#getTrim2 <em>Trim2</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTrimmedCurveImpl#getSenseAgreement <em>Sense Agreement</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcTrimmedCurveImpl#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcTrimmedCurveImpl extends IfcBoundedCurveImpl implements IfcTrimmedCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTrimmedCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_TRIMMED_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcCurve getBasisCurve() {
		return (IfcCurve) eGet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__BASIS_CURVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBasisCurve(IfcCurve newBasisCurve) {
		eSet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__BASIS_CURVE, newBasisCurve);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcTrimmingSelect> getTrim1() {
		return (EList<IfcTrimmingSelect>) eGet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__TRIM1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<IfcTrimmingSelect> getTrim2() {
		return (EList<IfcTrimmingSelect>) eGet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__TRIM2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tristate getSenseAgreement() {
		return (Tristate) eGet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__SENSE_AGREEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSenseAgreement(Tristate newSenseAgreement) {
		eSet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__SENSE_AGREEMENT, newSenseAgreement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IfcTrimmingPreference getMasterRepresentation() {
		return (IfcTrimmingPreference) eGet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMasterRepresentation(IfcTrimmingPreference newMasterRepresentation) {
		eSet(Ifc4Package.Literals.IFC_TRIMMED_CURVE__MASTER_REPRESENTATION, newMasterRepresentation);
	}

} //IfcTrimmedCurveImpl
