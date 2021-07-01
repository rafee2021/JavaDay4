package com.java4;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		//asks user to enter a string
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str = scan.nextLine();
		
		//exercise 1 check characters
		UserMainCode.checkCharacters(str);		
		
		
		//finding the middle character(s) of a string
		MidCharacter.midChar(str);
		
		//vowel counter
		VowelCounter.vowelCount(str);
		VowelCounter.printCount();
		
		//calculator functions
		//user enters two integers
		System.out.println("Please enter two integers");
		int x = scan.nextInt();
		int y = scan.nextInt();
		Calculator math = new Calculator();
				
		
		math.add(x, y);
		math.subtract(x, y);
		math.multiply(x, y);
		math.divide(x, y);
		math.absAdd(x, y);
		math.absSubtract(x, y);
		
		WritingStrings words = new WritingStrings();
		//words.str1 = ;
	}
}
