package com.doshin.questions;

import java.math.BigDecimal;

import org.junit.Test;

import com.doshin.misc.questions.MI01SquareRootAprox;

import junit.framework.TestCase;

public class MI01SquareRootAproxTest extends TestCase {

	public void testSamllerEpsilon() {
		double sqRt = MI01SquareRootAprox.squarRoot(16, 3);
		assertEquals(sqRt, 4.00000000);
	}

	public void testLargerEpsilon() {
		double sqRt = MI01SquareRootAprox.squarRoot(16, 5);
		assertEquals(sqRt, 4.00000000);
	}

	public void testNegativeSmalerEpsilon() {
		double sqRt = MI01SquareRootAprox.squarRoot(16, -5);
		assertEquals(sqRt, -4.00000000);
	}

	public void testNegativeLargerEpsilon() {
		double sqRt = MI01SquareRootAprox.squarRoot(16, -3);
		assertEquals(sqRt, -4.00000000);
	}
	
	public void testSameEpsilon() {
		double sqRt = MI01SquareRootAprox.squarRoot(16, 4);
		assertEquals(sqRt, 4.00000000);
	}
	
	public void testZeroNumber() {
		double sqRt = MI01SquareRootAprox.squarRoot(0, 4);
		assertEquals(sqRt, 6.104E-5);
	}
	
	public void testZeroZeroNumber() {
		double sqRt = MI01SquareRootAprox.squarRoot(0, 0);
		System.out.println(sqRt);
		assertEquals(sqRt, 0.0);
	}

}
