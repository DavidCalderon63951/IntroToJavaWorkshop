package day1.robot;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	
	public static void main(String[] args) {
		
	
	
		int A3 = new Random().nextInt(4);
	System.out.println(A3);
	String magic = JOptionPane.showInputDialog("Ask me a yes or no question!");
	
if (A3==(0)) {
	JOptionPane.showMessageDialog(null,"yes");
}
	

	
if (A3==(1)) {
	JOptionPane.showMessageDialog(null,"no");
}
	
	
if (A3==(2)) {
	JOptionPane.showMessageDialog(null,"Ask internet, not me!");
}
	

	
if (A3==(3)) {
	JOptionPane.showMessageDialog(null,"Do yer research lazy pants!");
}
	

	}
}
