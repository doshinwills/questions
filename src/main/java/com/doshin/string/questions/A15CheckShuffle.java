package com.doshin.string.questions;

import java.util.Stack;

/**
 * 
 * How to check if a String is valid shuffle of two String? (solution)
 * One more difficult String algorithm based coding question for senior developers. 
 * You are given 3 strings: first,  second, and  third.  third String is said to be a shuffle 
 * of first and second if it can be formed by interleaving the characters of first and second 
 * String in a way that maintains the left to right ordering of the characters from each string. 
 * For example, given first = "abc" and second = "def",  third = "dabecf"  is a valid shuffle since 
 * it preserves the character ordering of the two strings. So, given these 3 strings write a function 
 * that detects whether third String is a valid shuffle of first and second String.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4Lmk06QJy
 * 
 * @author gwills
 * 
 */
public class A15CheckShuffle {

	

	public static void main(String[] args) {
		String first = "abc"; 
		String second = "def";
		String third = "dabecf";
		
		System.out.println(isShuffleOf(first, second, third));

	}

	private static boolean isShuffleOf(String first, String second, String third) {
		int firstLength = first.length();
		int secondLength = second.length();
		int thridLength = third.length();

		char[] firstArray = first.toCharArray();
		char[] secondArray = second.toCharArray();
		char[] thridArray = third.toCharArray();
		
		int indexi = 0, indexj = 0, indexk = 0;
		
		if(thridLength != (firstLength + secondLength))
			return false;
		
		while(indexk < thridLength) {
			if(indexi < firstLength && thridArray[indexk] == firstArray[indexi]) {
				indexi++;
			} else if(indexj < firstLength && thridArray[indexk] == secondArray[indexj]) {
				indexj++;
			} else {
				return false;
			}
			indexk++;
		}
		
		return true;
	}
	
	

}
