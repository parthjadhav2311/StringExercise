//Replace a character in a string with another character.

package com.prowings.StringExcerise;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String s = "Sai";
		replace(s);
	}

	public static void replace(String s) {
		System.out.println("After char replacement:"+ s.replaceAll("i", "t"));
		
	}

}


