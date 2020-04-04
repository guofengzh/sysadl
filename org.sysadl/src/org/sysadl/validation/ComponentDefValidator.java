/**
 *
 * $Id$
 */
package org.sysadl.validation;

import org.eclipse.emf.common.util.EList;

import org.sysadl.AbstractComponentDef;
import org.sysadl.Configuration;
import org.sysadl.PortUse;
import org.sysadl.Style;

/**
 * A sample validator interface for {@link org.sysadl.ComponentDef}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentDefValidator {
	boolean validate();

	boolean validatePorts(EList<PortUse> value);
	boolean validateComposite(Configuration value);
	boolean validateIsBoundary(boolean value);
	boolean validateAbstractComponent(AbstractComponentDef value);

	boolean validateAppliedStyle(EList<Style> value);
}