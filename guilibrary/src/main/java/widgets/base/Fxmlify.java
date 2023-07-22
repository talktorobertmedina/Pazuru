package widgets.base;

import org.w3c.dom.Document;

public interface Fxmlify {
	public Document toFxml(Component component);
	public Component fromFxml(Document fxml);
}
