package kotlinMetaModel.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

public class GenerateKotlinFileHandler extends AbstractHandler implements IHandler {

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return super.isHandled();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		System.out.println("handled!");
		return null;
	}

}
