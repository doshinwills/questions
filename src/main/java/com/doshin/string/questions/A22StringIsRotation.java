package com.doshin.string.questions;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another. 
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only 
 * one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
 * 
 * @author gwills
 *
 */
public class A22StringIsRotation {

	public static void main(String[] args) {
		String[][] pairs = { { "apple", "pleap" },
				{ "waterbottle", "erbottlewat" }, { "camera", "macera" } };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean is_rotation = isRotation(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + is_rotation);
		}
	}

	private static boolean isRotation(String word1, String word2) {
		int len = word1.length();
		if (isBlank(word1) || isBlank(word2)) {
			return false;
		}
		String doubleWord = word1 + word1;
		return isSubstring(doubleWord, word2);
	}

	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}

	private static boolean isBlank(String word) {
		if (word == null || word.trim().length() == 0)
			return true;
		return false;

	}

}
