package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public class ScratchTut extends TopLevelPanel{
	@Override
	public void initializeTL() {
		initializeTL("Learn Scratch!", 2);
	}

	@Override
	public void initialize() {
		Table panel = new Table();
		Table tabs = new Table();

		final Label body = new Label("Scratch is an entirely free program created by Lifelong Kindergarten Group at the MIT Media Lab." +
				"Scratch is designed as an introduction to programing. It is quite simple to understand, doesn’t require " +
				"the memorization needed for most programing, however still allows for creative “Hello World”-esque " +
				"programs. Scratch helps people to think logically, systematically, and creatively, problem solve, etc.", Kiosk.skin);
		body.setWrap(true);
		body.setAlignment(Align.center);

		TextButton general = new TextButton("General Scratch", Kiosk.skin);
		general.getLabel().setWrap(true);
		general.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch is an entirely free program created by Lifelong Kindergarten Group at the MIT Media Lab." +
						"Scratch is designed as an introduction to programing. It is quite simple to understand, doesn’t require " +
						"the memorization needed for most programing, however still allows for creative “Hello World”-esque " +
						"programs. Scratch helps people to think logically, systematically, and creatively, problem solve, etc.");
			}
		});
		TextButton motion = new TextButton("Motion Blocks", Kiosk.skin);
		motion.getLabel().setWrap(true);
		motion.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 17 different types of motion blocks. Motion blocks are used to control how a sprite " +
						"moves, such as sending it to a specified place, or moving it a specified amount in a given direction." +
						"You can also use motion blocks to glide a sprite to a specified place over a specified amount of time.");
			}
		});
		TextButton look = new TextButton("Look Blocks", Kiosk.skin);
		look.getLabel().setWrap(true);
		look.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 23 different types of looks blocks. Looks blocks control how a sprite looks, such as" +
						"making a temporary or permanent thought or talk bubble, or controlling how big a sprite is, or even if " +
						"you can see the sprite or not.");
			}
		});
		TextButton sound = new TextButton("Sound Blocks", Kiosk.skin);
		sound.getLabel().setWrap(true);
		sound.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 13 different types of sound blocks. Sound blocks control sounds and MIDI functions," +
						"such as playing sounds, or playing sounds that pause the script. You can also use sound blocks to " +
						"change the volume or tempo by a certain amount, or set the volume or tempo to a specific amount.");
			}
		});
		TextButton pen = new TextButton("Pen Blocks", Kiosk.skin);
		pen.getLabel().setWrap(true);
		pen.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 11 different types of pen blocks. Pen blocks control the pen, such as changing or setting" +
						"the pen size or shade amount. You can also use pen blocks to clear all the pen marks on screen or" +
						"stamp the sprite's image onto the screen.");
			}
		});
		TextButton data = new TextButton("Data Blocks", Kiosk.skin);
		data.getLabel().setWrap(true);
		data.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 15 different types of data blocks. There is two types of data blocks: variable and list " +
						"blocks. Variable blocks hold and change values and strings. List blocks control lists, such as adding, " +
						"deleting, and changing certain parts of a given list.");
			}
		});
		TextButton event = new TextButton("Event Blocks", Kiosk.skin);
		event.getLabel().setWrap(true);
		event.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 8 different types of event blocks. Event blocks allow you to direct the program, such " +
						"as activating certain scripts when the flag is pressed or activating certain scripts when a certain key is " +
						"pressed. You can also use event blocks to activates scripts when the sprite is clicked or when there is a " +
						"certain backdrop.");
			}
		});
		TextButton control = new TextButton("Control Blocks", Kiosk.skin);
		control.getLabel().setWrap(true);
		control.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 11 different types of control blocks. Control blocks allow you to control scripts, such as" +
						"pausing a script for a certain amount of time or pausing a script until a given condition is true. They can " +
						"also create loops that loop a certain amount of times or loops that continue forever.");
			}
		});
		TextButton sensing = new TextButton("Sensing Blocks", Kiosk.skin);
		sensing.getLabel().setWrap(true);
		sensing.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 20 different types of sensing blocks. Sensing blocks detect certain conditions, such as if" +
						"a sprite is touching something else or if a certain key is being pressed. They can also detect the mouse's " +
						"location and how many days it has been since 2000.");
			}
		});
		TextButton operator = new TextButton("Operator Blocks", Kiosk.skin);
		operator.getLabel().setWrap(true);
		operator.getLabel().setFontScale(.8f);
		operator.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 17 different types of operator blocks. Operator blocks handle various math functions," +
						"such as simple addition and subtraction or complex functions such as tangent, sine, and cosine. It can " +
						"also pick a “random” number between two integers or round a value to the closest whole number.");
			}
		});
		TextButton more = new TextButton("More Blocks", Kiosk.skin);
		more.getLabel().setWrap(true);
		more.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 2 different types of “more blocks”. More blocks are used to allow the user to make " +
						"custom blocks. This is where you would input plugins if you were to use them.");
			}
		});
		tabs.add(general).padBottom(5).row();
		tabs.add(motion).padBottom(5).row();
		tabs.add(look).padBottom(5).row();
		tabs.add(sound).padBottom(5).row();
		tabs.add(pen).padBottom(5).row();
		tabs.add(data).padBottom(5).row();
		tabs.add(event).padBottom(5).row();
		tabs.add(control).padBottom(5).row();
		tabs.add(sensing).padBottom(5).row();
		tabs.add(operator).padBottom(5).row();
		tabs.add(more).padBottom(5).row();

		panel.left();
		panel.add(new ScrollPane(tabs, Kiosk.skin)).height(600).width(200);
		panel.add(body).expandX().fillX();

		initialize("How To Scratch", panel);
	}
}
