package day1.robot;
import java.io.IOException;

import javax.swing.JOptionPane;

public class stephenhawking {

    	public static void main(String[] args) {
		
	
    
    		String sentence = JOptionPane.showInputDialog("Type a sentance");
    
    		speak(sentence);
        		
    	}

/* Don’t change this…. */
static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014




