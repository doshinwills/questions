package com.doshin.string.questions;

import java.util.Arrays;

/**
 * Design an algorithm and write code to remove the duplicate characters in a string 
 * without using any additional buffer. NOTE: One or two additional variables are fine. 
 * An extra copy of the array is not.
 * FOLLOW UP
 * Write the test cases for this method.
 * 
 * @author gwills
 *
 */
public class A01StringRemoveDupChars {

	public static char[] removeDuplicatesDoshin(char[] str) {
		if (str == null || str.length < 2)
			return str;

		int tail = 1;

		for (int i = 1; i < str.length; i++) {
			int j;
			for (j = 0; j < tail; j++) {
				if (str[j] == str[tail])
					break;
			}

			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}

		return Arrays.copyOf(str, tail);
	}

	public static char[] removeDuplicatesEffDoshin(char[] str) {
		if (str == null || str.length < 2)
			return str;

		int tail = 1;
		boolean hits[] = new boolean[256];

		hits[0] = true;

		for (int i = 1; i < str.length; i++) {
			if (!hits[str[i]]) {
				str[tail] = str[i];
				tail++;
				hits[str[i]] = true;
			}
		}

		return Arrays.copyOf(str, tail);

	}

	public static void main(String[] args) {
		String s = "helloiloveyou";
		char[] arr = s.toCharArray();
		System.out.print(arr);
		System.out.print(" -> ");
		arr = removeDuplicatesEffDoshin(arr);
		System.out.print(arr);
	}

}
