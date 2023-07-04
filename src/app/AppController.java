package app;

import java.net.URL;

import app.menubar.MenuBarController;
import app.widgetlibrary.WidgetLibraryController;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;

public class AppController extends BaseController {

	@FXML
	private BorderPane sp;

	private MenuBarController mbc = new MenuBarController();
	private WidgetLibraryController wlc = new WidgetLibraryController();

	public AppController() {
		super(AppController.class.getResource(FxmlEnumList.APP_FXML));
	}

	public AppController(URL url) {
		super(url);
	}

	@FXML
	private void initialize() {
		sp.setTop(mbc.getMyRoot());
		sp.setLeft(wlc.getMyRoot());
	}
}
