package com.java4;

public class VowelCounter {

	//variable to hold vowel count
	static int count = 0;
	
	public static int vowelCount(String str) {
		//convert string to char array
		char[] charArr = str.toCharArray();
				
		
				
		//scans through charArray and adds to count
		for (int i = 0; i < charArr.length; i++) {
					
			switch(charArr[i]) {
						
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': count += 1;
			}
		}
				
		return count;		
	}
	
	public static void printCount() {
		System.out.println("Number of vowels in the string: " + count);
	}
}
