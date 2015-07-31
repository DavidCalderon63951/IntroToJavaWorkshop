package day1.robot;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
	
	JOptionPane.showMessageDialog(null,"Ready to test your knowledge");

String blue = JOptionPane.showInputDialog("Is your favorite color blue?");{
if(blue.equals("no")){
	JOptionPane.showMessageDialog(null,"Too bad");
}
else{
	JOptionPane.showMessageDialog(null,"Invisible high five!");
}
}
String cat = JOptionPane.showInputDialog("Is a dog a cat?");{
if (cat.equals("no")) {
	JOptionPane.showMessageDialog(null,"You're right!");
}
else{
	JOptionPane.showMessageDialog(null, "Try a different answer");
}
}
String mansion = JOptionPane.showInputDialog("Do you live in a mansion");{
if (mansion.equals("no")) {
	JOptionPane.showMessageDialog(null,"You should");
}
else {
	JOptionPane.showMessageDialog(null,"I envy you!");
}
}
String code = JOptionPane.showInputDialog("Do you code?");{
if (code.equals("no")) {
		JOptionPane.showMessageDialog(null,"Learn to do it,now!");
}
else {
	JOptionPane.showMessageDialog(null,"Superb!");	
}
}
JOptionPane.showMessageDialog(null,"Thanks for playing!");
}


	}






