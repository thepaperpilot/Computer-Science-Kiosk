package com.thepaperpilot.kiosk.panels;

public class Introduction extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL("Start Here!", 0);
	}

	@Override
	public void initialize() {
		initialize("Introduction", "This program is designed to teach you the basics of Computer Science. The lessons will revolve around Scratch, a drag-and-drop programming tool by MIT. This program is known for being easy to use, while still being a powerful tool");
	}
}
