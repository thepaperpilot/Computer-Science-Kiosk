package com.thepaperpilot.kiosk;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.panels.Panel;

public class Dialogue extends Panel {

	public void click() {

	}

	@Override
	public void initialize() {
		initialize("Opening Scratch", "Please note:\n\tThis computer does not have access to the internet.\n\tSome features in Scratch, such as 'About' will not work as expected.\n\n" +
				"Please don't save your scratch programs as this tablet PC is refreshed regularly and your saved files will be wiped out.\n\n" +
				"Tap to continue...");
		stage.getActors().get(0).addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				click();
				Kiosk.back();
				Kiosk.back();
			}
		});
		Kiosk.changePanel(this);
	}
}
