package app;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class App extends Application {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		parseArguments();
		initializeLogger();
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		LOGGER.log(Level.INFO, "App request start");
		if (AppUtils.requestStart(this, getParameters())) {
			LOGGER.log(Level.INFO, "App request start succeeded");
//			AppController ap = new AppController();
//			ap.generateRoot();
//
//			primaryStage.setScene(ap.getMyScene());
			primaryStage.show();
		} else {
			LOGGER.log(Level.INFO, "App request start failed");
			Platform.exit();
		}
	}

	private static void parseArguments() {
		// TODO: insert command line arguments here
	}

	private static void initializeLogger() {
		try {
			AppUtils.loadAppProperties();
			AppLogger.configureLogger();
			LOGGER.log(Level.INFO, "App Logger configured");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
