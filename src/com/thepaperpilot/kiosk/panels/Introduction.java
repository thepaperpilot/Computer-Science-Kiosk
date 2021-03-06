package com.thepaperpilot.kiosk.panels;

public class Introduction extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL("Start Here!\n", 0);
	}

	@Override
	public void initialize() {
		initialize("Introduction", "This program is designed to teach you the basics of Computer Science.\n\n The lessons will revolve around Scratch, a drag-and-drop programming tool by MIT.\n This program is known for being easy to use, while still being a powerful tool.\nIt'll also go into how to further pursue Computer Science once you're done with Scratch.\n\n\n\nThis program was made as a part of Anthony Lawn's Eagle Scout Project.");
	}
}
