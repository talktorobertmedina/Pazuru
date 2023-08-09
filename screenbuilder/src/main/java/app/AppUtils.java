package app;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import javafx.application.Application.Parameters;

public class AppUtils {

	private final static Logger LOGGER = Logger.getLogger(AppUtils.class.getName());
	private final static Properties appProperties = new Properties();

	public static void loadAppProperties() throws IOException {

		InputStream is = AppUtils.class.getClassLoader().getResourceAsStream("app.properties");
		appProperties.load(is);
		is.close();
	}

	public static Properties getAppProperties() {

		return appProperties;
	}

	public static boolean requestStart(App app, Parameters parameters) {

		boolean result = false;
		if (Boolean.getBoolean(AppUtils.getAppProperties().getProperty("WELCOME_SCREEN_ENABLED"))) {
			// show welcome dialog and some helpful tips
			result = requestStartWithWelcomeDialog();
		} else {
			// load a previous file or untitled tab?
			result = requestStart();
		}

		return result;
	}

	private static boolean requestStartWithWelcomeDialog() {

		return false;
	}

	private static boolean requestStart() {

		boolean result = true;
		// TODO: might need to do some startup operations before application loads
		return result;
	}
}
