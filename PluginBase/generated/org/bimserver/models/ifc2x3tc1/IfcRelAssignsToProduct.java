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
package org.bimserver.models.ifc2x3tc1;

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

public interface IfcRelAssignsToProduct extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Product</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3tc1.IfcProduct#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Product</em>' reference.
	 * @see #setRelatingProduct(IfcProduct)
	 * @see org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package#getIfcRelAssignsToProduct_RelatingProduct()
	 * @see org.bimserver.models.ifc2x3tc1.IfcProduct#getReferencedBy
	 * @model opposite="ReferencedBy"
	 * @generated
	 */
	IfcProduct getRelatingProduct();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3tc1.IfcRelAssignsToProduct#getRelatingProduct <em>Relating Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Product</em>' reference.
	 * @see #getRelatingProduct()
	 * @generated
	 */
	void setRelatingProduct(IfcProduct value);

} // IfcRelAssignsToProduct
