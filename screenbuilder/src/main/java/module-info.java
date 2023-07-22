module screenbuilder {
	exports app;
	exports app.editor.drag;
	exports app.editor.xmleditor;
	exports app.menubar;
	exports app.search;
	exports app.widgetlibrary;
	exports app.toolbar;
	exports app.layout;
	exports app.notificationbar;
	exports app.editor.drag.source;
	exports app.task;
	exports app.editor.drag.target;

	requires java.logging;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires guilibrary;
}