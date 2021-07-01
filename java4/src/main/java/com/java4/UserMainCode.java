package com.java4;

public class UserMainCode {
	
	static int c = 0;
	
	public static int checkCharacters(String str) {			
		
		char[] charArray = str.toCharArray();
		
		char a = charArray[0];
		char b = charArray[charArray.length -1];
		
		
		if (a == b) {
			c += 1;
			System.out.println("Valid");
			return 1;					
		} else {
			c -= 1;
			System.out.println("Invalid");
			return -1;
		}
	}
	/*
	public static void printStatus() {
		if (c == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}*/

}
