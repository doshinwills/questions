package com.doshin.linkedlist.questions;

/**
 * Reverse a Linked List
 * 
 * 
 * 
 * @author gwills
 * 
 */

class LL09RemoveLoopsLinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// Function that detects loop in the list
	int detectAndRemoveLoop(Node node) {
		if (node == null)
			return 0;

		Node slow = node, fast = node.next;
		boolean firstTime = true;

		while (slow != null && fast != null) {
			if (slow == fast) {
				return 1;
			}

			slow = slow.next;
			fast = fast.next == null ? fast.next : fast.next.next;

		}
		return 0;
	}

	// Function to remove loop

	// Function to print the linked list
	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver program to test above functions
	public static void main(String[] args) {
		LL09RemoveLoopsLinkedList list = new LL09RemoveLoopsLinkedList();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);
		list.head.next.next.next.next.next = new Node(11);

		// Creating a loop for testing
		head.next.next.next.next.next.next = head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}
