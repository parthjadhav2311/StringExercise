//Check if two strings are anagrams of each other

package com.prowings.StringExcerise;

import java.util.Arrays;

public class Anagram {
	
	
	public static boolean isStringAnagrams(String firstWord, String secondWord) {
		
			char[] array1 = firstWord.toCharArray();
			char[] array2 = secondWord.toCharArray();

			if (array1.length == array2.length) {
				for (int i = 0; i < array1.length; i++) {
					for (int j = 0; j < array2.length; j++)

					{
						if (array1[i] == array2[j])

						{
							array2[j] = ' ';
							break;
						}

					}
				}

				for (int i = 0; i < array2.length; i++) {

					if (array2[i] != ' ')
						return false;
				}
				return true;
			}

			else
				return false;
		}

		public static void main(String[] args) {

			boolean result = isStringAnagrams("Parth", "Parth");
			

			if (result)
				System.out.println("two strings are anagrams!!");
			else
				System.out.println("two strings are not anagrams!!");
		}
	}

