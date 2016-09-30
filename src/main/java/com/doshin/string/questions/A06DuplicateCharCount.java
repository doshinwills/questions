package com.doshin.string.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * How to find duplicate characters in a String? (solution) You need to write a
 * program to print all duplicate character and their count in Java. For example
 * if given String is "Programming" then your program should print 
 * 
 * g : 2 
 * r : 2 
 * m : 2
 * 
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview
 * -question-programming-interview.html#ixzz4Lm1liC6Q
 * 
 * @author gwills
 * 
 */
public class A06DuplicateCharCount {

	private static void duplicateCharCount(String word) {
		char charArray[] = word.toCharArray();
		Map<Character, Integer> charCount = new LinkedHashMap<Character, Integer>();
		for(int i = 0; i< charArray.length; i++) {
			if(charCount.containsKey(charArray[i])) {
				charCount.put(charArray[i], charCount.get(charArray[i]) + 1);
			} else {
				charCount.put(charArray[i], 1);
			}
		}
		
		for(Character ch : charCount.keySet()) {
			if(charCount.get(ch) > 1) {
				System.out.println(ch + " Have " + charCount.get(ch));
			}
		}
		
	}

	public static void main(String[] args) {
		String word = "javazcxnbajljgeruyqasbxk";
		duplicateCharCount(word);

	}

}
