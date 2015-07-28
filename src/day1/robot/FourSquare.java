package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	
	Robot Bob = new Robot();

	void go() {
		
		Bob.setSpeed(10);
		
		Bob.setPenWidth(5+1);
		
		for (int i = 0; i < 4; i++) {
			
		
			
	Bob.setRandomPenColor();
			
	drawSquare();
			
		Bob.turn(90);
		}
	}

	
	void drawSquare() {
		
		for (int i = 0; i < 4; i++) {
			
		Bob.penDown();
		Bob.move(100);
		Bob.turn(270);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
