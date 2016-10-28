package com.doshin.bitoperation.questions;

/**
 * Write one line C function to find whether a no is power of two
 * 
 * 1. A simple method for this is to simply take the log of the number on base 2
 * and if you get an integer then number is power of 2.
 * 
 * 2. Another solution is to keep dividing the number by two, i.e, do n = n/2
 * iteratively. In any iteration, if n%2 becomes non-zero and n is not 1 then n
 * is not a power of 2. If n becomes 1 then it is a power of 2.
 * 
 * @author gwills
 * 
 */
public class B05NumberPowerOf2 {

	public static void main(String[] args) {
		int number = 5;

		System.out.println("Number power of 2 " + numberPowerOf2(number));

	}

	private static boolean numberPowerOf2(int number) {
		
		double power = Math.log(number)/Math.log(2);
		if(power == Math.ceil(power))
			return true;
		return false;
					
				
	}

}
