package app;

import java.net.URL;

import app.layout.Panel;
import app.layout.Tab;
import app.menubar.MenuBarController;
import app.toolbar.ToolBarController;
import app.widgetlibrary.WidgetLibraryController;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class AppController extends BaseController {

	@FXML
	private BorderPane sp;
	@FXML
	private Panel leftPanel;
	@FXML
	private Panel centerPanel;
	@FXML
	private Panel rightPanel;
	@FXML
	private Panel bottomPanel;

	private MenuBarController mbc = new MenuBarController();
	private ToolBarController tbc = new ToolBarController();
	private WidgetLibraryController wlc = new WidgetLibraryController();

	public AppController() {
		super(AppController.class.getResource(FxmlEnumList.APP_FXML));
	}

	public AppController(URL url) {
		super(url);
	}

	@FXML
	private void initialize() {
		VBox topbar = initializeTopBar();
//		initializeLeftPanel();
		
//		sp.setTop(topbar); // menubar, toolbar
//		sp.setLeft(leftPanel); // widgetlibrary
//		sp.setCenter(centerPanel); // screenbuilder
//		sp.setRight(rightPanel); // property inspector
//		sp.setBottom(bottomPanel); // logger, notification bar
		
		// TODO: add panels to each direction of borderpane
//		sp.setLeft(wlc.getMyRoot());
	}
	
	private VBox initializeTopBar() {
		return new VBox(mbc.getMyRoot(), tbc.getMyRoot());
	}
	
	private void initializeLeftPanel() {
		wlc.generateRoot();
		Tab root = wlc.getTab();
		leftPanel.addTab(root);
	}
}
