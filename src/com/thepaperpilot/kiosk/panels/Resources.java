package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.thepaperpilot.kiosk.Kiosk;

public class Resources extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL(6);
	}

	@Override
	public void initialize() {
		Table panel = new Table();
		Label code = new Label("Code.org", Kiosk.skin);
		code.setAlignment(Align.right);
		panel.add(code);
		panel.add(new Image(Kiosk.manager.get("Graphics/code.png", Texture.class))).pad(10).row();
		Label codecademy = new Label("Codecademy.com", Kiosk.skin);
		codecademy.setAlignment(Align.right);
		panel.add(codecademy);
		panel.add(new Image(Kiosk.manager.get("Graphics/codecademy.png", Texture.class))).pad(10).row();
		Label github = new Label("Source Code\nFor This Project", Kiosk.skin);
		github.setAlignment(Align.right);
		panel.add(github);
		panel.add(new Image(Kiosk.manager.get("Graphics/github.png", Texture.class))).pad(10).row();

		initialize("Online Resources", panel);
	}
}
