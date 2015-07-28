package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot Bob = new Robot();
	   
		
		Bob.setSpeed(10);
		
		for (int i = 0; i < 75; i++) {
			
		
			
			Bob.penDown();
			Bob.setRandomPenColor();
			
			Bob.move(5*i);
			
			Bob.turn(360/7);
			
	
			
		Bob.setPenWidth(i);
	}
}
}