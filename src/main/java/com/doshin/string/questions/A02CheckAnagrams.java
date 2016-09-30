package com.doshin.string.questions;


/**
 * Write a method to decide if two strings are anagrams or not.
 * 
 * @author gwills
 *
 */
public class A02CheckAnagrams {

	public static boolean anagramDoshin(String str1, String str2) {
		if (str1 == null || str2 == null)
			return false;

		int[] hitsArray = new int[256];
		char[] charArray = str1.toCharArray();

		for (char charVal : charArray) {
			if (charVal != ' ')
				hitsArray[charVal]++;
		}

		charArray = str2.toCharArray();

		for (char charVal : charArray) {
			if (charVal != ' ')
				hitsArray[charVal]--;
		}

		for (int hit : hitsArray) {
			if (hit != 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		String[][] pairs = { { "anna madrigal", "a man and a girl" }, };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = anagramDoshin(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}
