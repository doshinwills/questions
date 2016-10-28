package com.doshin.bitoperation.questions;

/**
 * 
 Write an Efficient Method to Check if a Number is Multiple of 3
 * 
 * The very first solution that comes to our mind is the one that we learned in
 * school. If sum of digits in a number is multiple of 3 then number is multiple
 * of 3 e.g., for 612 sum of digits is 9 so it’s a multiple of 3. But this
 * solution is not efficient. You have to get all decimal digits one by one, add
 * them and then check if sum is multiple of 3.
 * 
 * There is a pattern in binary representation of the number that can be used to
 * find if number is a multiple of 3. If difference between count of odd set
 * bits (Bits set at odd positions) and even set bits is multiple of 3 then is
 * the number.
 * 
 * Example: 23 (00..10111) 1) Get count of all set bits at odd positions (For 23
 * it’s 3). 2) Get count of all set bits at even positions (For 23 it’s 1). 3)
 * If difference of above two counts is a multiple of 3 then number is also a
 * multiple of 3.
 * 
 * (For 23 it’s 2 so 23 is not a multiple of 3)
 * 
 * @author gwills
 * 
 */
public class B02DevisbleBy3 {

	public static void main(String[] args) {
		int number = 15;
		System.out.println(divisibleBy3(number));
		
	}

	private static boolean divisibleBy3(int number) {
		int i = 0, evenCount = 0, oddCount = 0;
		while(number != 0) {
			if((number & 1) == 1) {
				if(i % 2 == 0)
					evenCount++;
				else 
					oddCount++;
				
			}
			i++;
			number >>= 1;

		}
		
		return (oddCount - evenCount) % 3 == 0;
		
	}

	

}
