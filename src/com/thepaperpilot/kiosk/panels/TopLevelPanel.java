package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

public abstract class TopLevelPanel extends Panel implements Comparable<TopLevelPanel> {

    public Table button;
	public int priority;
	public long time = 0;
	public long start;

	TopLevelPanel() {
		initialize();
        initializeTL();
    }

    protected abstract void initializeTL();

    void initializeTL(String label, int priority) {
        this.priority = priority;
        button = new Table(Kiosk.skin);
	    button.add(label).height(50).row();
	    button.add(new TextButton(String.valueOf(title.getText()), Kiosk.skin)).width(300);

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
