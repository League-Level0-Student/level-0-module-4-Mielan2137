package extra;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

// 1. Create a String variable and initialize it with
//    random upper and lower case characters.

// 2. Print your String to the console in upper case.

// 3. Print your String to the console in lower case.

// 4. Print the first 3 char's of your String
//    HINT: .substring(start,end)

// 5. Print a single char somewhere in the middle of your String
//    REMINDER: char's in string start at index 0

// 6. BONUS -- print the LAST 3 char's of your string using
//        .length() to determine WHERE the last 3 char's are located.

public class StringMethods2 {
	public static void main(String[] args) {

		String A = "HeLlo MaTe So I ate some really good pizza today";
		System.out.println(A.toUpperCase());
		System.out.println(A.toLowerCase());
		System.out.println();

		for (int i = 47; i < A.length(); i++) {
			System.out.println(A.charAt(1));
		}

		for (int i = 47; i < A.length(); i++) {
			System.out.println(A.substring(0, 48));
		}
	}
}
