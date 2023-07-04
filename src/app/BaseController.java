package app;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public abstract class BaseController {

	private static final Logger LOGGER = Logger.getLogger(BaseController.class.getName());
	private Scene myScene;
	private Stage myParent;
	private Stage myStage;
	private String myStylesheet;
	private Parent myRoot;
	private URL myLocation;
	private ResourceBundle myResourcesBundle;

	public BaseController(URL url) {
		this(url, null);
	}

	public BaseController(URL url, ResourceBundle r) {
		this(url, r, null);
	}

	public BaseController(URL url, ResourceBundle r, Stage parent) {
		this.myLocation = url;
		this.myResourcesBundle = r;
		this.myParent = parent;
	}

	public Scene getMyScene() {
		if (myScene == null) {
			myScene = new Scene(getMyRoot());
		}

		return myScene;
	}

	public Stage getMyParent() {
		return myParent;
	}

	public Stage getMyStage() {
		if (myStage == null) {
			myStage = new Stage();
			myStage.initOwner(getMyParent());
			myStage.setScene(getMyScene());
		}
		return myStage;
	}

	public String getMyStylesheet() {
		return myStylesheet;
	}

	public void setMyStylesheet(String myStylesheet) {
		this.myStylesheet = myStylesheet;
	}

	public Parent getMyRoot() {
		if (myRoot == null) {
			generateRoot();
		}
		
		return myRoot;
	}

	public void setMyRoot(Parent myRoot) {
		this.myRoot = myRoot;
	}

	public void generateRoot() {
		final FXMLLoader loader = new FXMLLoader();

		loader.setController(this);
		loader.setLocation(myLocation);
		loader.setResources(myResourcesBundle);

		try {
			setMyRoot((Region) loader.load());
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Failed to create root in controller : " + loader.getController()
					+ " in location: " + loader.getLocation());
		}
	}

	public URL getMyLocation() {
		return myLocation;
	}

	public ResourceBundle getMyResourcesBundle() {
		return myResourcesBundle;
	}
}
