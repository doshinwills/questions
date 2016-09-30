package com.doshin.string.questions;

import java.util.HashSet;
import java.util.Set;

/**
 * How to sort String on their length in Java? (solution)
 * Write a Program to sort String on their length in Java? 
 * Your method should accept  an array of String and return a sorted array based upon the length of String. 
 * Don't forget to write unit tests for your solution.
 * 
 * Read more: http://javarevisited.blogspot.com/2015/01/top-20-string-coding-interview-question-programming-interview.html#ixzz4Lb8XhCiO
 * 
 * @author gwills
 *
 */
public class A20SortStringOnLength {


	public static void main(String[] args) {
		Set<StringLength> stringSet = new HashSet<StringLength>();
		
		stringSet.add(new StringLength("sada"));
		stringSet.add(new StringLength("as"));
		stringSet.add(new StringLength("asdasdas"));
		stringSet.add(new StringLength("asd"));
		stringSet.add(new StringLength("asdsa"));
		
		for(StringLength length : stringSet) {
			System.out.println(length);
		}
		
	}
	

	
}

class StringLength {
	String string;
	
	
	
	public StringLength(String string) {
		super();
		this.string = string;
	}

	public int hashCode() {
		return string.length();
	}
	
	public int equels(Object object) {
		if(this.string.length() == ((StringLength)object).string.length()) {
			return 0;
		} else {
			return (this.string.length() - ((StringLength)object).string.length());
		}
		
	}

	@Override
	public String toString() {
		return string;
	}
	
	
}
