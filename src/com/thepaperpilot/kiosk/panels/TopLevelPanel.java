package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public abstract class TopLevelPanel extends Panel implements Comparable<TopLevelPanel> {

    private int priority;
    public Table button;

    TopLevelPanel() {
        initialize();
        initializeTL();
    }

    protected abstract void initializeTL();

    void initializeTL(String label, int priority) {
        this.priority = priority;
        button = new Table(Kiosk.skin);
        button.add(label).row();
        button.add(new TextButton(String.valueOf(title.getText()), Kiosk.skin));

        button.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y) {
                Kiosk.changePanel(getSelf());
            }
        });
    }

    public void initializeTL(int priority) {
        initializeTL("", priority);
    }

    @Override
    public int compareTo(TopLevelPanel o) {
        return priority - o.priority;
    }

    Panel getSelf() {
        return this;
    }
}
