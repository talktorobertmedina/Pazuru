package app.widgetlibrary;

import java.net.URL;

import app.BaseController;
import app.FxmlEnumList;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import screenbuilder.widgets.base.Component;

public class WidgetLibraryController extends BaseController {

	@FXML
	Accordion node;
	@FXML
	TitledPane containersPane;
	@FXML
	ListView<Component> containersListView;
	@FXML
	TitledPane controlsPane;
	@FXML
	ListView<Component> controlsListView;
	@FXML
	TitledPane shapesPane;
	@FXML
	ListView<Component> shapesListView;
	
	public WidgetLibraryController() {
		this( WidgetLibraryController.class.getResource(FxmlEnumList.WIDGETLIBRARY_FXML));
	}
	public WidgetLibraryController(URL url) {
		super(url);
	}

	@FXML
	public void initialize() {

	}
}
