package com.doshin.string.questions;

import java.util.Stack;

/**
 * 
 * 19) Write a program to find longest palindrome in a string? (solution) This
 * is one of the tough coding question based upon String. It's hard to think
 * about an algorithm to solve this problem until you have practiced good. What
 * makes it more difficult is the constraint that your solution has O(n) time
 * complexity and O(1) space complexity.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview
 * -question-programming-interview.html#ixzz4LmnSBlRo
 * 
 * @author gwills
 * 
 */
public class A19Palindrome {

	public static void main(String[] args) {
		String str = "malaykuyalam";
		System.out.println(isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {

		int strLength = str.length();
		char[] charArray = str.toCharArray();
		
		int xorString = 0;

		for (int i = 0; i < strLength; i++) {
			xorString = xorString ^ charArray[i];
		}
		int midVal = charArray[strLength/2];
		if(xorString == 0 || xorString == midVal)
			return true;
		return false;

	}

}
