//Write a program which accepts Roman Number and converts it into Integer

//	consider below data for Roman to Integer:
	
//SYMBOL       VALUE
//  I            1
//  IV           4
//  V            5
///  IX           9
//  X            10
// XL           40
//  L            50
//  XC           90
//  C            100
//  CD           400
//  D            500
// CM           900 
//  M            1000
  
 package com.prowings.StringExcerise;

import java.util.Scanner;

public class RomanToInteger {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter Roman Number");
		String romanNumber = sc.next();
		romanNumber = romanNumber.toUpperCase();
		System.out.println("Integer value of "+romanNumber+
				" :"+romanToInteger(romanNumber));
	}

	public static String romanToInteger(String romanNumber) {
		int currentNumber = 0;
		int previousNumber = 0;
		int result = 0;
		for(int i = romanNumber.length()-1;i>=0;i--) {
			switch(romanNumber.charAt(i)) {
			case 'I': currentNumber = 1;break;
			case 'V': currentNumber = 5;break;
			case 'X': currentNumber = 10;break;
			case 'L': currentNumber = 50;break;
			case 'C': currentNumber = 100;break;
			case 'D': currentNumber = 500;break;
			case 'M': currentNumber = 1000;break;
			default:
				return "Invalid Roman Number";
			}
			if(currentNumber>=previousNumber)
				result += currentNumber;
			else
				result -= currentNumber;
				previousNumber = currentNumber;
		}
		return String.valueOf(result);
	}
}
