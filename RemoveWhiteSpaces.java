//  Remove all white spaces from a string.

 package com.prowings.StringExcerise;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		
		 String input = "Hello Parth Dhanaji Jadhav";
		 System.out.println("Input String is : "+input);

		String res = toRemoveWhiteSpace(input);
		System.out.println("String after removing whitespaces : "+res);
	}
	
	public static String toRemoveWhiteSpace(String s1)
	{
		return s1.replace(" ", "");
	}
}
