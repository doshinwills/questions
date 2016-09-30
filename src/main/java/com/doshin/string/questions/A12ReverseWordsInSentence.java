package com.doshin.string.questions;

import java.util.Stack;

/**
 * How to reverse words in a sentence without using library method? (solution)
 * Write a function, which takes a String word and returns sentence on which words 
 * are reversed in order e.g. if an input is "Java is best programming language", 
 * the output should be "language programming best is Java".
 * 
 * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4LmNv67Pb
 * 
 * @author gwills
 * 
 */
public class A12ReverseWordsInSentence {

	public static void reverseWordsInSentence(String str) {
		Stack<Character> wordStack = new Stack<Character>();
		int start = str.length() - 1;
		
		for(int i = start; i>=0; i--) {
			if(str.charAt(i) == ' ') {
				while(!wordStack.isEmpty())
					System.out.print(wordStack.pop());
				System.out.print(" ");
			} else {
				wordStack.add(str.charAt(i));
				
			}
		}
		
		while(!wordStack.isEmpty())
			System.out.print(wordStack.pop());
	}

	public static void main(String[] args) {
		String str = "Today is Friday, and Im feeling so nice";
		reverseWordsInSentence(str);

	}

}
