package com.java4;

public class MidCharacter {

	public static void midChar(String str) {
		//convert string to char array
		char[] charArr = str.toCharArray();
				
		//find string length and divide by 2		
		int midChar = str.length()/2;
				
		//print out the middle character(s) of the string
		if (str.length() % 2 == 0) {
			System.out.println("The middle characters in the string: " 
					+ charArr[midChar-1] + " & " + charArr[midChar]);
			//System.out.println("The middle character in the string: " + charArr[midChar]);
		} else {
			System.out.println("The middle character in the string: " + charArr[midChar]);
		}
	}
}
