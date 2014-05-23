package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public class tempTopLevelPanel extends TopLevelPanel {

    @Override
    public void initialize() {
        Table body = new Table(Kiosk.skin);
        body.add(new Label("This is a body", Kiosk.skin)).row();
        TextButton subPanel = new TextButton("I go to a subpanel", Kiosk.skin);
        subPanel.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Kiosk.changePanel(new tempPanel());
            }
        });
        body.add(subPanel);
        initialize("This is a test.", body);
    }

    @Override
    public void initializeTL() {
        initializeTL("Start Here?", 1);
    }

}
