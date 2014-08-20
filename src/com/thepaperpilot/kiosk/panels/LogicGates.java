package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

import java.awt.*;
import java.io.IOException;

public class LogicGates extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL(2);
	}

	@Override
	public void initialize() {
		Table panel = new Table();
		Label info = new Label("Logic Gates are parts of circuits that perform a boolean function. These are the electronics that make a computer work. \n" +
				"The basic logic gates are the AND, OR, and NOT gates, of which all other gates can be formed.\n" +
				"AND gate: The AND gate takes 2 inputs, and outputs true only when both inputs are true\n" +
				"OR gate: The OR gate also takes 2 inputs, and outputs true when either inputs are true\n" +
				"NOT gate: The NOT gate has 1 input and 1 output. It outputs true only when the input is false\n" +
				"XOR gate: The XOR (eXclusive OR) gate has 2 inputs. It outputs true only when 1 of their inputs are true, but not both\n\n" +
				"There are many other logic gates that you can explore on your own. The button below will bring you to an interactive Scratch program where you can see how the gates interact for yourself!", Kiosk.skin);
		info.setWrap(true);
		info.setAlignment(Align.center);
		panel.add(info).width(Kiosk.WIDTH - Kiosk.PADDING * 4).padBottom(100).row();
		TextButton launch = new TextButton("Launch Scratch", Kiosk.skin);
		launch.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				try {
					Desktop.getDesktop().open(Gdx.files.external("Documents/Logic Gates.sb2").file());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		});
		panel.add(launch);
		initialize("Logic Gates", panel);
	}
}
