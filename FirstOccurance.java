//Find the first occurrence of a specific substring in a string.

package com.prowings.StringExcerise;

public class FirstOccurance {
	
	public static void main(String[] args)
	{
		String s1="ParthJadhav";
		findFirstOccurance(s1);
		
	}

	private static int findFirstOccurance(String s1) 
	{
	    s1=s1.substring(7,10);
	   int result =s1.indexOf("l");
	   System.out.println("First Occurance Of Given Substring:"+result);
		return result;
	}
}