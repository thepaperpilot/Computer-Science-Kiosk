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
			    // TODO loading bar
			    try {
				    Runtime.getRuntime().exec("C:\\Program Files (x86)\\Scratch 2\\Scratch 2.exe");
			    } catch(IOException e) {
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
