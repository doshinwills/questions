package com.doshin.linkedlist.questions;

import java.util.Random;

/**
 * Reverse a Linked List in groups of given size
 * 
 * Given a linked list, write a function to reverse every k nodes (where k is an
 * input to the function).
 * 
 * Example: Inputs: 1->2->3->4->5->6->7->8->NULL and k = 3 Output:
 * 3->2->1->6->5->4->8->7->NULL.
 * 
 * Inputs: 1->2->3->4->5->6->7->8->NULL and k = 5 Output:
 * 5->4->3->2->1->8->7->6->NULL.
 * 
 * 
 * 
 * @author gwills
 * 
 */

class LL07ReverseLinkedListKElements {

	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node head, int k) {
		
		Node prev = null, curr = head, next = null;
		int i = 0;
		while(i < k && curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i++;
		}
		if(next != null)
			head.next = reverse(next, k);
		
		return prev;
		
	}

	/* Utility functions */

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

	/* Function to print linked list */
	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		LL07ReverseLinkedListKElements llist = new LL07ReverseLinkedListKElements();

		/*
		 * Constructed Linked List is 1->2->3->4->5->6-> 7->8->8->9->null
		 */
		llist.push(10);
		llist.push(9);
		llist.push(8);
		llist.push(7);
		llist.push(6);
		llist.push(5);
		llist.push(4);
		llist.push(3);
		llist.push(2);
		llist.push(1);

		System.out.println("Given Linked List");
		llist.printList();

		llist.head = llist.reverse(llist.head, 3);

		System.out.println("Reversed list");
		llist.printList();
	}

}
