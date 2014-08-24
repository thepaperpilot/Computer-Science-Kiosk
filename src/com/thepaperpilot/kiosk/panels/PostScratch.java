package com.thepaperpilot.kiosk.panels;

public class PostScratch extends TopLevelPanel {
	@Override
	protected void initializeTL() {
		initializeTL(4);
	}

	@Override
	public void initialize() {
		initialize("After Scratch", "After you have worked in Scratch, and feel comfortable with the basics of " +
				"programming it is time to take your knowledge and apply it to making programs.\n\nScratch " +
				"gives you the basics of object oriented programming and how to start from nothing and make " +
				"something happen, but don’t truly give you the flexibility and power given by other" +
				"programming languages.\nSo after you have mastered making Scratch programs, " +
				"it is time to learn 'true' programming. \nFirst thing to do is choose which programming language " +
				"you want to focus on. The two most common programming languages are C++ and Java. Of these, Java is " +
				"more highly recommended for beginners, " +
				"and is what the AP test will assess you over.\n\nThe first program people write is a simple “Hello " +
				"World” program, which is used to simply get a beginning feel of how to use the programming " +
				"language. After writing the \"Hello World\" program it is time to move onto writing programs. " +
				"\nThere are many tools online and courses that are easy and free to take. Two of the better known" +
				"resources are code.org and codecademy.com. Additionally, in " +
				"most nearby high schools there are courses over Computer Science.\n\nJourneying into Computer Science" +
				"will open doors into the fastest expanding industry of the century.");
	}
}
