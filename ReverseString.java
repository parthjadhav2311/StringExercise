// Write a program to reverse a given string.

package com.prowings.StringExcerise;

public class ReverseString {
	
	public static String reverseString(String input)
	{
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return new String(sb);
		
	}
	
	
	public static void main(String[] args) {
		
		String input ="PARTH JADHAV";
		String output =reverseString(input);
		
		System.out.println(output);
		
		
	}
	}