package app.menubar;

import java.io.File;
import java.net.URL;

import app.AppUtils;
import app.BaseController;
import app.FxmlEnumList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.FileChooser;

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

	@FXML
	private void handleSaveAsFile(ActionEvent e) {
		String lastNewFilePath = AppUtils.getAppProperties().getProperty("LAST_NEW_FILE_PATH");
		if (lastNewFilePath.isEmpty()) {
			lastNewFilePath = System.getProperty("user.dir");
		}
		
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File(lastNewFilePath));
		File chosenFile = fc.showSaveDialog(null);
	}

	@FXML
	private void handleOpenFile(ActionEvent e) {
		String lastNewFilePath = AppUtils.getAppProperties().getProperty("LAST_NEW_FILE_PATH");
		if (lastNewFilePath.isEmpty()) {
			lastNewFilePath = System.getProperty("user.dir");
		}
		
		FileChooser fc = new FileChooser();
		fc.setInitialDirectory(new File(lastNewFilePath));
		File chosenFile = fc.showOpenDialog(null);
	}
}
