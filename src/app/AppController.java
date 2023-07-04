package app;

import java.net.URL;

import app.menubar.MenuBarController;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class AppController extends BaseController {

	private MenuBarController mbc = new MenuBarController();

	public AppController() {
		super(AppController.class.getResource(FxmlEnumList.APP_FXML));
	}

	public AppController(URL url) {
		super(url);
	}

	@FXML
	private StackPane sp;

	@FXML
	private void initialize() {
		sp.getChildren().add(mbc.getMyRoot());
	}
}
