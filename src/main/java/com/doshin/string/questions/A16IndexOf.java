package com.doshin.string.questions;

import java.util.Stack;

/**
 * 
 * Write a program to check if a String contains another String e.g. indexOf()? (solution)
 * You need to write a function to search for the existence of a string (target) in another string (source). 
 * The function takes two strings as the input and returns the index where the second string is found. 
 * If the target string cannot be found, then return -1. If you are a Java developer, then you can related 
 * its behavior to indexOf() method from java.lang.String class. This question is also asked as Code and 
 * algorithm to check if a given short string is a substring of a main string. 
 * Can you get a linear solution (O(n)) if possible?
 * 
 * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4LmjTT7k5
 * 
 * @author gwills
 * 
 */
public class A16IndexOf {

	public static int indexOf(String str, String strIndex) {
		int srtLength = str.length();
		int strIndexLength = strIndex.length();
		char[] strArray = str.toCharArray();
		char[] strIndexArray = strIndex.toCharArray();
		
		int indexJ = 0;
		int indexK = 0;
		while(indexJ < srtLength) {
			if(strArray[indexJ] == strIndexArray[indexK]) {
				indexJ++;
				indexK++;
				
				if(indexK == strIndexLength) {
					return (indexJ - indexK);
				}
				
			} else if(strArray[indexJ] != strIndexArray[indexK]) {
				indexJ = indexJ - indexK + 1;
				indexK = 0;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		String str = "Today is Friday, and Im feeling so nice";
		String strIndex = "Imfeel";
		System.out.println(indexOf(str, strIndex));
		System.out.println(str.toCharArray()[indexOf(str, strIndex)]);

	}
	
	

}
