package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

// 1. Create a String variable and initialize it to whatever you want

// 2. Print the 3rd char of your String to the console.
//    HINT: .charAt

// 3. Print the length of your String to the console.
//    HINT: .length()

// 4. Using a for loop, print one char at time to the console.
//    HINT: use .length() to determine how many loops

// 5. Pick a char inside your String, and use a loop to determine
//    what position/index in the String the char is located.
//    Print the char's position to the console.
//    EXAMPLE: if your string is "abc" and you are searching 
//             for char 'b', then print "b is at index 1"

public class StringMethods1 {
	public static void main(String[] args) {
		String Boo = "Boy you best move up otta mi face fo I nock u off yo feet u skinny foo";
		System.out.println(Boo.length());
		
		for(int i=0; i<Boo.length();i++) {
			System.out.println(Boo.charAt(i));
		}
		}
		}

