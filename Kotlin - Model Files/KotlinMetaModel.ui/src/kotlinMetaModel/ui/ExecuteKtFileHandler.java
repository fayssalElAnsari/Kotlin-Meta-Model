package kotlinMetaModel.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

public class ExecuteKtFileHandler extends AbstractHandler implements IHandler {

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("executing .kt file...");
		return null;
	}

}
