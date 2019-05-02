package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */

// Ask the user how many nickels they have

// Convert their answer to an int using Integer.parseInt()

// Ask the user how many dimes they have, and convert their answer

// Ask the user how many quarters they have, and convert their answer

// Calculate how much money the user has and save it in a double variable 

// Tell the user how much money they have

public class ChangeCalculator {	

	public static void main(String[] args) {
	
	String Nickel = JOptionPane.showInputDialog("How Many nickels do you have?");
	int N = Integer.parseInt(Nickel);
	
	String Dime = JOptionPane.showInputDialog("How Many Dimes do you have?");
	int D = Integer.parseInt(Dime);
	
	String Quarter = JOptionPane.showInputDialog("How Many Quarters do you have");
	int Q = Integer.parseInt(Quarter);

	double total = 0.0;
	total += N*.05;
	total += D*.1;
	total += Q*.25;
	
	JOptionPane.showMessageDialog(null, "You have "+ total);
	
	}
}