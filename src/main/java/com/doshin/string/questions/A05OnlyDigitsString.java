package com.doshin.string.questions;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * How to check if a String contains only digits? (solution) You need to write a
 * program to check a String contains only numbers by using Regular expression
 * in Java. You can use Java API but a solution without using Java API will be
 * better because that is what interviewer can always ask.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview
 * -question-programming-interview.html#ixzz4LlzRoJTy
 * 
 * @author gwills
 * 
 */
public class A05OnlyDigitsString {

	public static boolean onlyDigitsString(String str1) {

		if (str1 == null)
			return false;
		return str1.matches("[0-9]+");

	}

	public static void main(String[] args) {
		String word = "234";
		System.out.println(onlyDigitsString(word));

	}
}
