package com.doshin.string.questions;

public class A21StringUniqueChars {

	/**
	 * Implement an algorithm to determine if a string has all unique characters. 
	 * What if you can not use additional data structures?
	 * 
	 */

	public static void main(String[] args) {

		String[] words = { "abcde", "hello", "apple", "kite", "padle" };

		for (String word : words) {
			System.out.println(isUniqueCharsBitShiftWay(word));
			System.out.println(isUniqueCharsArrayWay(word));
		}

	}

	public static boolean isUniqueCharsBitShiftWay(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}

		return true;

	}

	public static boolean isUniqueCharsArrayWay(String str) {

		boolean[] charCheck = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int charInt = str.charAt(i);
			if (charCheck[charInt])
				return false;
			charCheck[charInt] = true;
		}
		return true;
	}

}
