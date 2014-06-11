package com.thepaperpilot.kiosk.panels;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.thepaperpilot.kiosk.Kiosk;

import java.io.IOException;

/**
 * Created by Greg on 6/10/14.
 */
public class appControl extends TopLevelPanel {
    @Override
    protected void initializeTL() {
        initializeTL("Launch!", 1);
    }

    @Override
    public void initialize() {

        Table body = new Table(Kiosk.skin);
        body.top().add(new Label("Application Control", Kiosk.skin)).row();
        TextButton subPanel = new TextButton("Launch Scratch", Kiosk.skin);
        subPanel.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                //Kiosk.changePanel(new tempPanel());
                try {
                    System.out.println("Opening Scratch");
                    Runtime runTime = Runtime.getRuntime();
                    Process process = runTime.exec("C:\\Program Files (x86)\\Scratch 2\\Scratch 2.exe");
                    //System.out.println("Closing notepad");
                    //process.destroy();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        body.add(subPanel);
        initialize("This is Scratch", body);
    }
}
