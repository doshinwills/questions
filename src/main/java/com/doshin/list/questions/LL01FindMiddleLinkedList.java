package com.doshin.list.questions;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * 
 * How to find middle element of linked list in one pass? One of the most
 * popular question from data structures and algorithm, mostly asked on
 * telephonic interview. Since many programmer know that, in order to find
 * length of linked list we need to first traverse through linked list till we
 * find last node, which is pointing to null, and then in second pass we can
 * find middle element by traversing only half of length. They get confused when
 * interviewer ask him to do same job in one pass. In order to find middle
 * element of linked list in one pass, you need to maintain two-pointer, one
 * increment at each node while other increments after two nodes at a time, by
 * having this arrangement, when first pointer reaches end, second pointer will
 * point to middle element of linked list. See this trick to find middle element
 * of linked list in single pass for more details.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2013/03/top-15-data-structures-algorithm
 * -interview-questions-answers-java-programming.html#ixzz4M9HQO3Ra
 * 
 * 
 * @author gwills
 * 
 */

class LL01FindMiddleLinkedList {
	Node head; // head of linked list

	/* Linked list node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to print middle of linked list */
	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is [" + slow_ptr.data
					+ "] \n");
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		LL01FindMiddleLinkedList llist = new LL01FindMiddleLinkedList();
		for (int i = 5; i > 0; --i) {
			llist.push(i);
			llist.printList();
			llist.printMiddle();
		}
	}
}