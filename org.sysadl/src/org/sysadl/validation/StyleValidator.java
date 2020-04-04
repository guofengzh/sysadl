/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.AbstractDef;
import org.sysadl.ExampleArchitecture;
import org.sysadl.Invariant;

/**
 * A sample validator interface for {@link org.sysadl.Style}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StyleValidator {
	boolean validate();

	boolean validateInvariants(EList<Invariant> value);
	boolean validateDefinitions(EList<AbstractDef> value);
	boolean validateArchs(EList<ExampleArchitecture> value);
}