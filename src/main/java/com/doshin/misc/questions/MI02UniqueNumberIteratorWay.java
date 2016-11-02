package com.doshin.misc.questions;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Creating an array list to return to accept accesnding order elements which
 * have duplicates
 * 
 * @author gwills
 * 
 */
public class MI02UniqueNumberIteratorWay extends ArrayList<Integer> {

	private Integer last = null;

	public Iterator<Integer> iterator() {
		return new UniqueIterator();
	}

	public boolean add(Integer ele) {

		if (last == null || last < ele) {
			super.add(ele);
			last = ele;
			return true;

		} else
			return false;

	}

	/**
	 * Iterator for a assenting only Arraylist to show only the unique elements
	 * 
	 * @author gwills
	 * 
	 */
	class UniqueIterator implements Iterator<Integer> {
		int lastRet = -1;

		public boolean hasNext() {
			Object[] elementData = MI02UniqueNumberIteratorWay.this.toArray();
			int index = lastRet + 1;
			if (lastRet == -1)
				return true;
			while (index < elementData.length) {
				if (elementData[lastRet] != elementData[index]) {
					return true;
				}
				index++;
			}
			return false;
		}

		public Integer next() {
			Object[] elementData = MI02UniqueNumberIteratorWay.this.toArray();
			int index = lastRet + 1;
			if (lastRet == -1) {
				lastRet++;
				return (Integer) elementData[0];
			}
			while (index < elementData.length) {
				if (elementData[lastRet] != elementData[index]) {
					lastRet = index;
					return (Integer) elementData[index];
				}
				index++;
			}
			return null;

		}

	}

}
