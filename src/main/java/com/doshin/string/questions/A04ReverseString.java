package com.doshin.string.questions;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * How to program to print first non repeated character from String? (solution)
 * One of the most common string interview questions: Find the first
 * non-repeated (unique) character in a given string. for Example if given
 * String is "Morning" then it should print "M". This question demonstrates
 * efficient use of Hashtable. We scan the string from left to right counting
 * the number occurrences of each character in a Hashtable. Then we perform a
 * second pass and check the counts of every character. Whenever we hit a count
 * of 1 we return that character, that’s the first unique letter. Be prepared
 * for follow-up question for improving memory efficiency, solving it without
 * hash table as well.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview
 * -question-programming-interview.html#ixzz4LbElWrBl
 * 
 * @author gwills
 * 
 */
public class A04ReverseString {

	public static String reverseString(String str1) {

		char[] charArray = str1.toCharArray();

		for(int i = 0; i < charArray.length/2; i++) {
			char temp = charArray[i];
			charArray[i] = charArray[charArray.length - i - 1];
			charArray[charArray.length - i - 1] = temp;
		}
		
		return new String(charArray);

	}



	public static void main(String[] args) {
		String word = "aafghf";

		String reverseString = reverseString(word);
		
		System.out.println(reverseString);

	}
}
