package app.widgetlibrary;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import screenbuilder.widgets.base.Component;

public class WidgetCellFactory implements Callback<ListView<Component>, ListCell<Component>> {

	// TODO: add a graphical icon next to the text; ex. <icon> Rectangle
	
	@Override
	public ListCell<Component> call(ListView<Component> arg0) {
		return new ListCell<>() {
			public void updateItem(Component component, boolean empty) {
				super.updateItem(component, empty);
				if (empty || component == null) {
					setText(null);
				}
				else {
					setText(component.getDisplayName());
				}
			}
		};
	}

}
