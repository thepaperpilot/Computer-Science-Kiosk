package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.thepaperpilot.kiosk.Kiosk;

public class Resources extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL(6);
	}

	@Override
	public void initialize() {
		Table panel = new Table();
		panel.add(new Label("Code.org", Kiosk.skin));
		panel.add(new Image(Kiosk.manager.get("Graphics/code.png", Texture.class))).row();
		panel.add(new Label("Codecademy.com", Kiosk.skin));
		panel.add(new Image(Kiosk.manager.get("Graphics/codecademy.png", Texture.class))).row();
		panel.add(new Label("Source Code for this Program", Kiosk.skin));
		panel.add(new Image(Kiosk.manager.get("Graphics/github.png", Texture.class))).row();

		initialize("Online Resources", panel);
	}
}
