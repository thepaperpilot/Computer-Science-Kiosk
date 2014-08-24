package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import java.io.IOException;

public class appControl extends TopLevelPanel {
    @Override
    protected void initializeTL() {
	    initializeTL(2);
	    button.getListeners().clear();
	    button.addListener(new ClickListener() {
		    public void clicked(InputEvent event, float x, float y) {
			    // TODO ANTHONY to make change PrintLn statements into dialogs
			    try {
                    // TODO Update usage metrics: Start Scratch
                    System.out.println("Please wait while we launch Scratch.   To return here, exit Scratch.\n");
                    System.out.println("Please don't save your scratch programs as this tablet PC is refreshed regularly and your saved files will be wiped out.\n");
				    System.out.println("Please note:\n\tthat this computer does not have access to the internet.\n\tSome features in Scratch, such as 'About' will not work as expected.");
				    Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Scratch 2\\Scratch 2.exe");
                    // cause this process to stop until process p is terminated
                    p.waitFor();
                    // TODO Update usage metrics: End Scratch
			    } catch(IOException|InterruptedException e) {
				    e.printStackTrace();
			    }
		    }
	    });
    }

    @Override
    public void initialize() {
	    initialize("Launch Scratch", "");
    }
}
