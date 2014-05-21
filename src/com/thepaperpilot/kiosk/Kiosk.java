package com.thepaperpilot.kiosk;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.thepaperpilot.kiosk.panels.Panel;

import java.util.ArrayList;

public class Kiosk implements ApplicationListener {

    // Dimensions of the tablet: DO NOT CHANGE
    public final static int WIDTH = 1366;
    public final static int HEIGHT = 768;

    public final static int PADDING = 10;

    public static Skin skin;
    private static Panel panel;
    private static ArrayList<Panel> panelHistory;

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.width = WIDTH;
        cfg.height = HEIGHT;
        // Full screen is annoying while developing
        // Make sure to uncomment this in any shippable version
        // cfg.fullscreen = true;

        new LwjglApplication(new Kiosk(), cfg);
    }

    private static void setPanel(Panel panel) {
        if (Kiosk.panel != null) Kiosk.panel.hide();
        Kiosk.panel = panel;
        if (Kiosk.panel != null) {
            Kiosk.panel.show();
            Kiosk.panel.resize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        }
    }

    public Panel getPanel() {
        return panel;
    }

    @Override
    public void create() {
        // Loads and configures the skin for the UI
        AssetManager manager = new AssetManager();
        manager.load("Graphics/tempSkin.json", Skin.class);
        manager.finishLoading();
        skin = manager.get("Graphics/tempSkin.json");
        skin.getFont("font").setScale(.5f);

        // Temporary test panel to make sure everything works
        Panel test = new Panel() {
            @Override
            public void initialize() {
                initialize("This is a test", "Can you read me?");
            }
        };
        setPanel(test);
    }

    @Override
    public void resize(int width, int height) {
        if (panel != null) panel.resize(width, height);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if (panel != null) panel.render(Gdx.graphics.getDeltaTime());
    }

    @Override
    public void pause() {
        if (panel != null) panel.pause();
    }

    @Override
    public void resume() {
        if (panel != null) panel.resume();
    }

    @Override
    public void dispose() {
        if (panel != null) panel.dispose();
        if (skin != null) skin.dispose();
    }

    public void changePanels(Panel toPanel) {
        panelHistory.add(getPanel());
        // TODO Fade transition
        setPanel(toPanel);
    }

    public static void back() {
        if (!panelHistory.isEmpty()) setPanel(panelHistory.remove(panelHistory.size() - 1));
    }
}
