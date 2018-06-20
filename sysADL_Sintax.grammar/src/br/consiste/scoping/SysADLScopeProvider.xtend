/*
 * generated by Xtext 2.10.0
 */
package br.consiste.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.Scopes
import sysADL_Sintax.DataTypeAccessExpression
import sysADL_Sintax.DataTypeDef
import sysADL_Sintax.SysADLPackage

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class SysADLScopeProvider extends AbstractSysADLScopeProvider {
	override getScope(EObject context, EReference ref) {
		if (context instanceof DataTypeAccessExpression && ref == SysADLPackage.eINSTANCE.dataTypeAccessExpression_Attr) {
			return scope_DataTypeAccessExpression_Attr(context as DataTypeAccessExpression);
		}
		return super.getScope(context, ref)
	}
	
	def scope_DataTypeAccessExpression_Attr(DataTypeAccessExpression a) {
		Scopes.scopeFor((a.datatype as DataTypeDef).dataTypeAttributes);
	}
	
}
