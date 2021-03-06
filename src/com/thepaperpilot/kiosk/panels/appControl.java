package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Constants;
import com.thepaperpilot.kiosk.Dialogue;

import java.io.IOException;

public class appControl extends TopLevelPanel {

	public appControl(Stage stage) {
		super();
		this.stage = stage;
	}

	@Override
	protected void initializeTL() {
		initializeTL(2);
		button.getListeners().clear();
		button.addListener(new ClickListener() {
			public void clicked(InputEvent event, float x, float y) {
				new Dialogue() {
					@Override
					public void click() {
						try {
							Gdx.graphics.setDisplayMode(0, 0, false);
							Process p = Runtime.getRuntime().exec(Constants.SCRATCH_PATH);
							p.waitFor();
							// cause this process to stop until process p is terminated
							Gdx.graphics.setDisplayMode(Constants.WIDTH, Constants.HEIGHT, true);
						} catch(IOException | InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
			}
		});
	}

	@Override
	public void initialize() {
		initialize("Launch Scratch", "");
	}
}
