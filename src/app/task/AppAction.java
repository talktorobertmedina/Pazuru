package app.task;

/**
 * Any action that is perform by the app should be segregated by their components. For example, 
 * 1 actions from the screen builder will be using screen builder action enum.
 * 2 actions from the menu bar will be using the menu bar action enum.
 */
public class AppAction {
	
	public enum ScreenBuilderAction {
		
	}
	
	public enum MenuBarAction {
		NEW_FILE,
		OPEN_FILE,
		SAVE_FILE,
		SAVE_AS_FILE,
		EXIT_APPLICATION
	}
}
