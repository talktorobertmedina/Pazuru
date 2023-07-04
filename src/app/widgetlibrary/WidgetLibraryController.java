package app.widgetlibrary;

import java.net.URL;

import app.BaseController;
import app.FxmlEnumList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import screenbuilder.widgets.base.Component;
import screenbuilder.widgets.container.Group;
import screenbuilder.widgets.controls.AnalogReadout;
import screenbuilder.widgets.controls.DigitalReadout;
import screenbuilder.widgets.controls.Label;
import screenbuilder.widgets.shape.Rectangle;

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
	
	// TODO: optional: move these components into a widgetlibrary type loading class
	ObservableList<Component> containersList = FXCollections.observableArrayList(new Group());
	ObservableList<Component> controlsList = FXCollections.observableArrayList(new Label(), new DigitalReadout(), new AnalogReadout());
	ObservableList<Component> shapesList = FXCollections.observableArrayList(new Rectangle());
	
	public WidgetLibraryController() {
		this( WidgetLibraryController.class.getResource(FxmlEnumList.WIDGETLIBRARY_FXML));
	}
	public WidgetLibraryController(URL url) {
		super(url);
	}

	@FXML
	public void initialize() {
		// TODO: add custom cell factory to display proper name of component
		// TODO: add drag and drop feature inside each cell
		containersListView.setItems(containersList);
		controlsListView.setItems(controlsList);
		shapesListView.setItems(shapesList);
	}
}
