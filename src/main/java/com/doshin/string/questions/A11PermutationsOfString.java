package com.doshin.string.questions;

/**
 * How to find all permutations of String? (solution) I have seen this String
 * interview question on many interviews. It has a easy recursive solution but
 * thinks get really tricky when Interviewer ask you to solve this question
 * without using recursion. You can use Stack though. Write a program to print
 * all permutations of a String in Java, for example, the if input is "xyz" then
 * it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview
 * -question-programming-interview.html#ixzz4Lm7LHltF
 * 
 * @author gwills
 * 
 */
public class A11PermutationsOfString {

	public static void permutation(String str, String remaining) {

		if (remaining.length() == 0) {
			System.out.println(str);
		} else {

			for (int i = 0; i < remaining.length(); i++) {
				permutation(str + remaining.charAt(i),
						remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
			}
		}
	}
	



	public static void permutation(String str) {
		permutation("", str);
	}

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrst";
		permutation(str);

	}

}
