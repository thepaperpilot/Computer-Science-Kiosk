package com.thepaperpilot.kiosk;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.thepaperpilot.kiosk.panels.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kiosk implements ApplicationListener {

	private final static ArrayList<Panel> panelHistory = new ArrayList<>();
	public static Skin skin;
	public static AssetManager manager;
	private static Panel panel;
	private static ArrayList<TopLevelPanel> panels;

	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.width = Constants.WIDTH;
		cfg.height = Constants.HEIGHT;
		cfg.addIcon("Graphics/icon.png", Files.FileType.Internal);
		// Full screen is annoying while developing
		// Make sure to uncomment this in any shippable version
		cfg.fullscreen = true;

		new LwjglApplication(new Kiosk(), cfg);
	}

	private static Panel getPanel() {
		return panel;
	}

	private static void setPanel(Panel panel) {
		if(Kiosk.panel != null) Kiosk.panel.hide();
		Kiosk.panel = panel;
		if(Kiosk.panel != null) {
			Kiosk.panel.show();
			Kiosk.panel.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		}
	}

	public static void changePanel(Panel toPanel) {
		panelHistory.add(getPanel());
		setPanel(toPanel);
		Gdx.input.setInputProcessor(toPanel.stage);

		if(toPanel instanceof TopLevelPanel) {
			((TopLevelPanel) toPanel).start = System.currentTimeMillis();
		}
	}

	public static void back() {
		if(panels.contains(getPanel())) {
			TopLevelPanel topLevelPanel = (TopLevelPanel) getPanel();
			topLevelPanel.time += System.currentTimeMillis() - topLevelPanel.start;
			writeMetrics();
		}
		if(!panelHistory.isEmpty()) setPanel(panelHistory.remove(panelHistory.size() - 1));
		Gdx.input.setInputProcessor(getPanel().stage);
	}

	private static void writeMetrics() {
		StringBuilder stringBuilder = new StringBuilder();
		for(TopLevelPanel panel : panels) {
			stringBuilder.append(panel.time).append("\n");
		}
		Gdx.files.absolute(Constants.DAT_PATH).writeString(stringBuilder.toString(), false);
	}

	@Override
	public void create() {
		// Loads and configures the skin for the UI
		manager = new AssetManager();
		manager.load("Graphics/skin.json", Skin.class);
		manager.load("Graphics/code.png", Texture.class);
		manager.load("Graphics/codecademy.png", Texture.class);
		manager.load("Graphics/github.png", Texture.class);
		manager.finishLoading();
		skin = manager.get("Graphics/skin.json");

		Panel main = new Panel() {
			@Override
			public void initialize() {
				Table body = new Table();
				initialize("", body);
				stage.getActors().removeIndex(1);

				panels = new ArrayList<>();
				panels.add(new Introduction());
				panels.add(new appControl(stage));
				panels.add(new ScratchTut());
				panels.add(new LogicGates());
				panels.add(new PostScratch());
				panels.add(new Resources());

				readMetrics();

				Collections.sort(panels);

				Table panelTable = new Table(Kiosk.skin);

				int currcol = 0;
				for(final TopLevelPanel panel : panels) {
					panelTable.add(panel.button).pad(10);
					currcol++;
					if(currcol >= Constants.COL_SIZE) {
						panelTable.row().padBottom(10);
						currcol = 0;
					}
				}

				stage.addActor(panelTable);
			}
		};
		setPanel(main);
		panelHistory.add(main);

		Gdx.input.setInputProcessor(getPanel().stage);
	}

	private void readMetrics() {
		try {
			if(!Gdx.files.absolute(Constants.DAT_PATH).exists())
				writeMetrics();
			Scanner scanner = new Scanner(Gdx.files.absolute(Constants.DAT_PATH).file());
			int index = 0;
			while(scanner.hasNextLine()) {
				panels.get(index).time = Long.parseLong(scanner.nextLine());
				index++;
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void resize(int width, int height) {
		if(panel != null) panel.resize(width, height);
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(panel != null) panel.render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void pause() {
		if(panel != null) panel.pause();
	}

	@Override
	public void resume() {
		if(panel != null) panel.resume();
	}

	@Override
	public void dispose() {
		if(panel != null) panel.dispose();
		if(skin != null) skin.dispose();
	}
}
