package coop.tecso.hades;

import com.vaadin.Application;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.CustomLayout;
import com.vaadin.ui.Embedded;
import com.vaadin.ui.Window;

@SuppressWarnings("serial")
public class HadesApplication extends Application {
	
	@Override
	public void init() {
		
		CustomLayout custom = new CustomLayout("panel-widgets");
		 
// TEST GIT		 
		custom.addComponent(new Embedded("", new ThemeResource("images/warning-icon.png")), "warning-icon");
		
		
		// Main window
		Window mainWindow = new Window("Hades @ Tecso");
		mainWindow.setSizeFull();
		mainWindow.addComponent(custom);
		setMainWindow(mainWindow);
		
		setTheme("hades-theme");
	}

}
