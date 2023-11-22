//Count the number of vowels and consonants in a given string.

package com.prowings.StringExcerise;

public class CountVowelsConsonantsProgram {

	public static void main(String[] args) {

		String input = "I am always Alone";
		
		System.out.println("Input String is : "+input);
		
		toCountVowelsAndConsonants(input);
	}

	public static void toCountVowelsAndConsonants(String s1) {

		s1 = s1.toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				} else
					consonantCount++;
			}
		}
		System.out.println("Total Vowels From Given String : "+vowelCount);
		System.out.println("Total Consonants From Given String : "+consonantCount);
	}

}
