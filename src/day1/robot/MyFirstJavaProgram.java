package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

		Robot Bob= new Robot ();
		Bob.setRandomPenColor();
		Bob.setSpeed(200);
		Bob.setPenWidth(10);
		Bob.penDown();
	for (int i = 0; i < 3; i++) {
		Bob.move(10);
		Bob.turn(120);
	}
	
	}
}
