package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public class tempPanel extends Panel {
    @Override
    public void initialize() {
        Table body = new Table(Kiosk.skin);
        body.top().add("I am a label. I have this row all to myself, and have 20 pixels all around me").pad(20).row();

        TextButton innerPanel = new TextButton("I am a button leading to an inner panel", Kiosk.skin);
        innerPanel.getLabel().setWrap(true);
        innerPanel.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                Kiosk.changePanel(new innerPanel());
            }
        });

        Label info = new Label("This is a new table being used for a second row. On the same row, labels (and anything else with text) can have line breaks. \nI am a label next to a button, with 30 pixels between us", Kiosk.skin);
        info.setFillParent(true);
        info.setWrap(true);

        Table secondRow = new Table(Kiosk.skin);
        secondRow.add(innerPanel).width(400).spaceRight(30);
        secondRow.add(info);

        body.add(secondRow);
        initialize("This panel uses a custom body", body);
    }
}

class innerPanel extends Panel {
    @Override
    public void initialize() {
        initialize("This is an inner panel", "Bodies can be defined using just a string! And now, they'll automatically wrap to new lines! Isn't this useful?");
    }
}
