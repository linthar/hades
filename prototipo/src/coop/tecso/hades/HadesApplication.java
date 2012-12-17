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
		
		// logo
		custom.addComponent(new Embedded(null, new ThemeResource("images/logo.png")), "logo");

		// user profile image
		custom.addComponent(new Embedded(null, new ThemeResource("images/profile.jpg")), "profile-image");
		

		// user profile image
		custom.addComponent(new Embedded(null, new ThemeResource("images/warning-icon.png")), "warning-icon");	
		
		// Main window
		Window mainWindow = new Window("Hades | Tecso Coop.");
		mainWindow.setSizeFull();
		mainWindow.addComponent(custom);
		setMainWindow(mainWindow);
		
		setTheme("hades-theme");
	}

}
