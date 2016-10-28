package com.doshin.bitoperation.questions;

/**
 * Position of rightmost set bit Write a one line C function to return position
 * of first 1 from right to left, in binary representation of an Integer.
 * 
 * I/P 18, Binary Representation 010010 O/P 2 I/P 19, Binary Representation
 * 010011 O/P 1
 * 
 * @author gwills
 * 
 */
public class B06PositionOfRightMostBit {

	public static void main(String[] args) {
		int number = 64;

		System.out.println(Integer.toBinaryString(number));
		System.out.println(Integer.toBinaryString(-number));
		System.out.println("Right most bit is on position " + positionOfRightMostBit(number));

	}

	private static double positionOfRightMostBit(int number) {

		return Math.log(number & -number) / Math.log(2) + 1;

	}

}
