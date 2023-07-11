package app.layout;

import java.util.Collection;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Panel extends Pane {
	// contains multiple tabs
	// should have events and listeners
	private List<Tab> tabList;
	
	public Panel() {
		
	}
	
	public Panel(Collection<Tab> data) {
		tabList.addAll(data);
	}
	
	@FXML
	private void initialize() {
		
	}
	
	public void addTab(Tab tab) {
		
		tabList.add(tab);
	}
	
	public Boolean isEmpty() {
		return tabList.isEmpty();
	}
	
	public void minimizePanel() {
		
	}
	
	public void maximizePanel() {
		
	}
}
