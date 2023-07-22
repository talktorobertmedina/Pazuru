package app.toolbar;

import java.net.URL;

import app.BaseController;
import app.FxmlEnumList;
import javafx.fxml.FXML;
import javafx.scene.control.ToolBar;

public class ToolBarController extends BaseController {

	@FXML
	private ToolBar toolbar;
	
	public ToolBarController() {
		this(ToolBarController.class.getResource(FxmlEnumList.TOOLBAR_FXML));
	}
	
	public ToolBarController(URL url) {
		super(url);
	}

	@FXML
	private void initialize() {
		
	}
}
