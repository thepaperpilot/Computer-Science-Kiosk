package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public class ScratchTut extends TopLevelPanel {
	@Override
	public void initializeTL() {
		initializeTL(1);
	}

	@Override
	public void initialize() {
		Table panel = new Table();
		Table tabs = new Table();

		final Label body = new Label("Scratch is an entirely free program created by\n Lifelong Kindergarten Group at the MIT Media Lab.\n\n" +
				"Scratch is designed as an introduction to programing. It is quite simple to understand, doesn’t require " +
				"the memorization needed for most programing, however still allows for creative \"Hello World\"-esque " +
				"programs. Scratch helps people to think logically, systematically, and creatively, problem solve, etc.", Kiosk.skin);
		body.setWrap(true);
		body.setAlignment(Align.center);

		final Label title = new Label("General Scratch", Kiosk.skin, "large");
		title.setAlignment(Align.center);

		TextButton general = new TextButton("General Scratch", Kiosk.skin);
		general.getLabel().setWrap(true);
		general.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch is an entirely free program created by\n Lifelong Kindergarten Group at the MIT Media Lab.\n\n" +
						"Scratch is designed as an introduction to programing. It is quite simple to understand, doesn’t require " +
						"the memorization needed for most programing, however still allows for creative \"Hello World\"-esque " +
						"programs. Scratch helps people to think logically, systematically, and creatively, problem solve, etc.");
				title.setText("General Scratch");
			}
		});
		TextButton motion = new TextButton("Motion Blocks", Kiosk.skin);
		motion.getLabel().setWrap(true);
		motion.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 17 different types of motion blocks.\nMotion blocks are used to control how a sprite " +
						"moves, such as sending it to a specified place, or moving it a specified amount in a given direction." +
						"You can also use motion blocks to glide a sprite to a specified place over a specified amount of time.");
				title.setText("Motion Blocks");
			}
		});
		TextButton look = new TextButton("Look Blocks", Kiosk.skin);
		look.getLabel().setWrap(true);
		look.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 23 different types of looks blocks.\nLooks blocks control how a sprite looks, such as" +
						"making a temporary or permanent thought or talk bubble, or controlling how big a sprite is, or even if " +
						"you can see the sprite or not.");
				title.setText("Look Blocks");
			}
		});
		TextButton sound = new TextButton("Sound Blocks", Kiosk.skin);
		sound.getLabel().setWrap(true);
		sound.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 13 different types of sound blocks.\nSound blocks control sounds and MIDI functions," +
						"such as playing sounds, or playing sounds that pause the script. You can also use sound blocks to " +
						"change the volume or tempo by a certain amount, or set the volume or tempo to a specific amount.");
				title.setText("Sound Blocks");
			}
		});
		TextButton pen = new TextButton("Pen Blocks", Kiosk.skin);
		pen.getLabel().setWrap(true);
		pen.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 11 different types of pen blocks.\nPen blocks control the pen, such as changing or setting" +
						"the pen size or shade amount. You can also use pen blocks to clear all the pen marks on screen or" +
						"stamp the sprite's image onto the screen.");
				title.setText("Pen Blocks");
			}
		});
		TextButton data = new TextButton("Data Blocks", Kiosk.skin);
		data.getLabel().setWrap(true);
		data.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 15 different types of data blocks.\nThere is two types of data blocks: variable and list " +
						"blocks. Variable blocks hold and change values and strings. List blocks control lists, such as adding, " +
						"deleting, and changing certain parts of a given list.");
				title.setText("Data Blocks");
			}
		});
		TextButton event = new TextButton("Event Blocks", Kiosk.skin);
		event.getLabel().setWrap(true);
		event.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 8 different types of event blocks.\nEvent blocks allow you to direct the program, such " +
						"as activating certain scripts when the flag is pressed or activating certain scripts when a certain key is " +
						"pressed. You can also use event blocks to activates scripts when the sprite is clicked or when there is a " +
						"certain backdrop.");
				title.setText("Event Blocks");
			}
		});
		TextButton control = new TextButton("Control Blocks", Kiosk.skin);
		control.getLabel().setWrap(true);
		control.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 11 different types of control blocks.\nControl blocks allow you to control scripts, such as" +
						"pausing a script for a certain amount of time or pausing a script until a given condition is true. They can " +
						"also create loops that loop a certain amount of times or loops that continue forever.");
				title.setText("Control Blocks");
			}
		});
		TextButton sensing = new TextButton("Sensing Blocks", Kiosk.skin);
		sensing.getLabel().setWrap(true);
		sensing.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 20 different types of sensing blocks.\nSensing blocks detect certain conditions, such as if" +
						"a sprite is touching something else or if a certain key is being pressed. They can also detect the mouse's " +
						"location and how many days it has been since 2000.");
				title.setText("Sensing Blocks");
			}
		});
		TextButton operator = new TextButton("Operator Blocks", Kiosk.skin);
		operator.getLabel().setWrap(true);
		operator.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 17 different types of operator blocks.\nOperator blocks handle various math functions," +
						"such as simple addition and subtraction or complex functions such as tangent, sine, and cosine. It can " +
						"also pick a “random” number between two integers or round a value to the closest whole number.");
				title.setText("Operator Blocks");
			}
		});
		TextButton more = new TextButton("More Blocks", Kiosk.skin);
		more.getLabel().setWrap(true);
		more.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				body.setText("Scratch 2.0 has 2 different types of \"more blocks\".\nMore blocks are used to allow the user to make " +
						"custom blocks. This is where you would input plugins if you were to use them.");
				title.setText("More Blocks");
			}
		});
		tabs.add(general).width(190).padBottom(5).row();
		tabs.add(motion).width(190).padBottom(5).row();
		tabs.add(look).width(190).padBottom(5).row();
		tabs.add(sound).width(190).padBottom(5).row();
		tabs.add(pen).width(190).padBottom(5).row();
		tabs.add(data).width(190).padBottom(5).row();
		tabs.add(event).width(190).padBottom(5).row();
		tabs.add(control).width(190).padBottom(5).row();
		tabs.add(sensing).width(190).padBottom(5).row();
		tabs.add(operator).width(190).padBottom(5).row();
		tabs.add(more).width(190).padBottom(5).row();

		Table right = new Table();
		right.add(title).pad(30).row();
		right.add(body).expandX().fillX();

		panel.left();
		panel.add(new ScrollPane(tabs, Kiosk.skin)).height(600).width(200);
		panel.add(right).expand().fill();

		initialize("How To Scratch", panel);
	}
}
