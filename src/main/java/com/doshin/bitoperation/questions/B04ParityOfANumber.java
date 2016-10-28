package com.doshin.bitoperation.questions;

/**
 * Write a C program to find the parity of an unsigned integer Parity:
 * 
 * Parity of a number refers to whether it contains an odd or even number of
 * 1-bits. The number has “odd parity”, if it contains odd number of 1-bits and
 * is “even parity” if it contains even number of 1-bits. Main idea of the below
 * solution is – Loop while n is not 0 and in loop unset one of the set bits and
 * invert parity.
 * 
 * @author gwills
 * 
 */
public class B04ParityOfANumber {

	public static void main(String[] args) {
		int number = 4;

		
		System.out.println("Parity of number is " + parityOfANumber(number));

	}

	private static boolean parityOfANumber(int number) {
		int onesCount = 0;
		while(number != 0) {
			int lastBit = 1;
			lastBit = number & lastBit;
			number>>=1;
			
			if(lastBit != 0) {
				onesCount++;
			}
		}
		
		if(onesCount % 2 == 1)
			return true;
		return false;

	}

}
