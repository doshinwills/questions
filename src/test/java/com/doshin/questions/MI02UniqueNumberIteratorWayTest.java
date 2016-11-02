package com.doshin.questions;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import com.doshin.misc.questions.MI02UniqueNumberIteratorWay;

public class MI02UniqueNumberIteratorWayTest extends TestCase {

	
	// Test Array accept accesding only values
	public void testAccesdingOnlyValues() {
		List<Integer> list = new MI02UniqueNumberIteratorWay();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(-1);

		Iterator<Integer> a = list.iterator();
		String arrayValue = "";
		while (a.hasNext()) {
			arrayValue = arrayValue + a.next() + ", ";
		}
		
		System.out.println(arrayValue);

		assertEquals(arrayValue, "1, 2, 3, ");
	}
	
	// Test Blank Array
	public void testBlankArray() {
		List<Integer> list = new MI02UniqueNumberIteratorWay();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(10);
		list.add(13);
		list.add(15);
		list.add(15);
		list.add(17);

		Iterator<Integer> a = list.iterator();
		String arrayValue = "";
		while (a.hasNext()) {
			arrayValue = arrayValue + a.next() + ", ";
		}

		assertEquals(arrayValue, "1, 2, 3, 4, 5, 10, 13, 15, 17, ");
	}

	// Test single element
	public void testSingleElement() {
		List<Integer> list = new MI02UniqueNumberIteratorWay();

		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);

		Iterator<Integer> a = list.iterator();
		String arrayValue = "";
		while (a.hasNext()) {
			arrayValue = arrayValue + a.next() + ", ";
		}

		assertEquals(arrayValue, "1, ");
	}

	// Test negative and positive elements
	public void testNegativeAndPositiveElements() {
		List<Integer> list = new MI02UniqueNumberIteratorWay();

		list.add(-3);
		list.add(-1);
		list.add(-1);
		list.add(-1);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(7);
		list.add(7);

		Iterator<Integer> a = list.iterator();
		String arrayValue = "";
		while (a.hasNext()) {
			arrayValue = arrayValue + a.next() + ", ";
		}
		assertEquals(arrayValue, "-3, -1, 0, 1, 3, 4, 5, 7, ");
	}
}
