package app.menubar;

import java.net.URL;

import app.BaseController;
import app.FxmlEnumList;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBarController extends BaseController {

	public MenuBarController() {
		this(MenuBarController.class.getResource(FxmlEnumList.MENUBAR_FXML));
	}
	
	public MenuBarController(URL url) {
		super(url);
	}
	@FXML
	private MenuBar menuBar;
	@FXML
	private Menu fileMenu;
	@FXML
	private MenuItem fileMenuNewItem;
	@FXML
	private MenuItem fileMenuOpenItem;
	@FXML
	private MenuItem fileMenuSaveItem;
	@FXML
	private MenuItem fileMenuSaveAsItem;
	@FXML
	private MenuItem fileMenuExitItem;
	
	@FXML
	private void initialize() {
		
	}
}
