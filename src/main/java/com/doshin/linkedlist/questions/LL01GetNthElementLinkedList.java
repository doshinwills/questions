package com.doshin.linkedlist.questions;

import java.util.LinkedList;
import java.util.List;

public class LL01GetNthElementLinkedList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list.get(4));
		}
}
