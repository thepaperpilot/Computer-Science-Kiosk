package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.thepaperpilot.kiosk.Constants;
import com.thepaperpilot.kiosk.Kiosk;

public abstract class Panel implements Screen {

	public Stage stage;
	Label title;

	public Panel() {
		initialize();
	}

	public abstract void initialize();

	protected void initialize(String title, String bodyText) {
		Table body = new Table(Kiosk.skin);
		Label temp = new Label(bodyText, Kiosk.skin);
		temp.setFillParent(true);
		temp.setWrap(true);
		temp.setAlignment(Align.left);
		body.left().add(temp).pad(Constants.PADDING);
		initialize(title, body);
	}

	public void initialize(String title, Image bodyImage, String bodyText) {
		Table body = new Table(Kiosk.skin);
		body.add(bodyImage).width(Constants.WIDTH * .3f).fillY();
		body.add(bodyText).fill();
		initialize(title, body);
	}

	public void initialize(String titleText, Table body) {
		title = new Label(titleText, Kiosk.skin, "large");
		title.setAlignment(Align.center);

		Table panel = new Table(Kiosk.skin);
		panel.setPosition(-Constants.WIDTH / 2 + Constants.PADDING, -Constants.HEIGHT / 2 + Constants.PADDING);
		panel.setBackground(Kiosk.skin.getDrawable("blue_panel"));
		panel.setSize(Constants.WIDTH - Constants.PADDING * 2, Constants.HEIGHT - Constants.PADDING * 2);
		panel.top().add(title).fillX().padBottom(Constants.PADDING).row();
		panel.top().add(body).expand().fill().pad(Constants.PADDING);

		TextButton back = new TextButton("Back", Kiosk.skin, "large");
		back.getLabel().setAlignment(Align.bottom);
		back.setSize(160, 80);
		back.setPosition(-Constants.WIDTH / 2 + Constants.PADDING * 2, Constants.HEIGHT / 2 - 70);
		back.addListener(new ClickListener() {
			public void clicked(InputEvent event, float x, float y) {
				Kiosk.back();
			}
		});

		stage = new Stage(new ScreenViewport());
		stage.addActor(panel);        // Position 0 (index)
		stage.addActor(back);         // Position 1 (index)

		stage.addListener(new InputListener() {
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				if(keycode == Input.Keys.BACK) {
					Kiosk.back();
					return true;
				}
				return false;
			}
		});
	}

	public void render(float delta) {
		stage.act(delta);
		stage.draw();
	}

	public void resize(int width, int height) {
		stage.getViewport().update(width, height);
	}

	public void show() {

	}

	public void hide() {

	}

	public void pause() {

	}

	public void resume() {

	}

	public void dispose() {
		stage.dispose();
	}
}
