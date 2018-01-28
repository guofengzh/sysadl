package sysadl.viewpoints.actions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import sysADL_Sintax.ElementDef;
import sysADL_Sintax.Model;

public class RequirementDeleteSatisfy extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		for (EObject e : arg0) {
			if (!(e instanceof ElementDef)) {
				return false;
			}
		}
		return true; 
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		for (EObject arg : arg0) {
			ElementDef e = (ElementDef) arg;
			// remove from requirement satisfy list
			e.getSatisfies().getSatisfiedBy().remove(e);
			// add back to the model involved elements list, so the element will not vanish
			Model m = getOptionalParameter(arg1, "model", Model.class);
			m.getInvolvedElements().add(e);
		}
	}

}