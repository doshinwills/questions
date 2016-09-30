package com.doshin.string.questions;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * How to program to print first non repeated character from String? (solution)
 * One of the most common string interview questions: Find the first non-repeated 
 * (unique) character in a given string. for Example if given String is "Morning" 
 * then it should print "M". This question demonstrates efficient use of Hashtable. 
 * We scan the string from left to right counting the number occurrences of each character 
 * in a Hashtable. Then we perform a second pass and check the counts of every character. 
 * Whenever we hit a count of 1 we return that character, that’s the first unique letter. 
 * Be prepared for follow-up question for improving memory efficiency, solving it without hash table as well.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4LbElWrBl
 * 
 * @author gwills
 * 
 */
public class A03FirstNonRepeatedChar {

	public static char firstNonRepeatedChar(String str1) {

		char[] charArray = str1.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		for(char c : charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c).intValue() + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		for(char c : charArray) {
			if(charMap.get(c).intValue() == 1) {
				return c;
			}
		}
		return '0';

	}
	
	public static char firstNonRepeatedCharEff(String str1) {

		char[] charArray = str1.toCharArray();

		Set<Character> charMap = new LinkedHashSet<Character>();
		
		for(char c : charArray) {
			if(charMap.contains(c)) {
				charMap.remove(c);
			} else {
				charMap.add(c);
			}
		}
		
		
		return ((Character)charMap.toArray()[0]).charValue();

	}

	public static void main(String[] args) {
		String[][] pairs = { { "aafghf", "hello" }, };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			char anagram = firstNonRepeatedCharEff(word1);
			System.out.println(anagram);
		}
	}
}
