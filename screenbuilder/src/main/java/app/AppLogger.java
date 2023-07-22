package app;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class AppLogger {

	public static void configureLogger() throws SecurityException, IOException {

		// add a file logger to the global logger
		FileHandler fh = new FileHandler(AppUtils.getAppProperties().getProperty("APP_LOG_FILE"));
		Logger.getGlobal().addHandler(fh);
	}
}
