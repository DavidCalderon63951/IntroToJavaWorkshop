package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	
	Robot Bob = new Robot();
	
	void go() {
		
				Bob.setSpeed(10);
		
		drawTriangle(100);
		
		for (int i = 0; i < 60; i++) {
			
		
			
	Bob.penDown();
	Bob.setRandomPenColor();
				drawTriangle(100+10);			
	drawTriangle(100);
			
	Bob.turn(6);
		}
	}

	
	private void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {
			Bob.move(10);
			Bob.turn(360/3);
		}
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
