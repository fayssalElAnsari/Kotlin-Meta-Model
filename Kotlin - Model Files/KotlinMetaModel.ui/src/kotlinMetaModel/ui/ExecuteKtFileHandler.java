package kotlinMetaModel.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExecuteKtFileHandler extends AbstractHandler {

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
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
				IFile file = (IFile) firstElement;
				try {
					System.out.println("*** compiling .kt file ***");

					IWorkspace workspace = ResourcesPlugin.getWorkspace();
					IPath location = workspace.getRoot().getLocation();
					String fileFullPath = location.toOSString() + "/" + file.getFullPath();

					String[] command = { "cmd", "/c", "kotlinc", fileFullPath, "-include-runtime", "-d", "prog.jar" };
					ProcessBuilder pb = new ProcessBuilder(command);
					pb.redirectErrorStream(true);
					pb.directory(new File(location.toString()));
					Process process = pb.start();

					// get output from the command
					InputStream inputStream = process.getInputStream();
					BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
					String line;
					while ((line = reader.readLine()) != null) {
						System.out.println(line);
					}

					// wait for the process to finish and get the exit code
					int exitCode = process.waitFor();
					System.out.println("Command exited with code: " + exitCode);

					System.out.println("*** executing compiled .jar file ***");

					String[] executionCommand = { "cmd", "/c", "java", "-jar", location.toOSString() + "/prog.jar" };
					pb = new ProcessBuilder(executionCommand);
					process = pb.start();

					// get output from the command
					inputStream = process.getInputStream();
					reader = new BufferedReader(new InputStreamReader(inputStream));
					while ((line = reader.readLine()) != null) {
						System.out.println(line);
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

}
