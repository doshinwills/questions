package com.doshin.string.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * How to convert numeric String to an int? (solution)
 * A classical coding interview question based upon String. 
 * You need to write a method like atoi() from C/C++, which takes a 
 * numeric String and return its int equivalent. For example, if 
 * you pass "67263" to the program then it should return 67263. 
 * Make sure your solution is robust i.e. it should be able to handle + and - character, 
 * null and empty String, integer overflow and other corner cases. Bonus points 
 * if you come up with good unit test cases. By the way, if your interviewer doesn't mention to you about atoi() 
 * then you can also use Java API's parseInt() or valueOf() method to solve this problem.

Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4Lm4WN2Xw

 * 
 * @author gwills
 * 
 */
public class A09ConvertStringToint {

	private static int convertStringToint(String word) {
		char charArray[] = word.toCharArray();
		int value = 0;
		for(int i = 0; i< charArray.length; i++) {
			value = value + (charArray[i] - '0')*(int)Math.pow(10,charArray.length-i-1);
		}
		
		return value;
		
	}

	public static void main(String[] args) {
		String word = "4566885";
		System.out.println(convertStringToint(word));

	}

}
