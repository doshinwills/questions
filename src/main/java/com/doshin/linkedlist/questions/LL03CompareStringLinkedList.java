package com.doshin.linkedlist.questions;

import com.doshin.linkedlist.questions.LL00ImplementLinkedList.Node;

/**
 * 
 * Compare two strings represented as linked lists
 * 
 * Given two linked lists, represented as linked lists (every character is a
 * node in linked list). Write a function compare() that works similar to
 * strcmp(), i.e., it returns 0 if both strings are same, 1 if first linked list
 * is lexicographically greater, and -1 if second string is lexicographically
 * greater.
 * 
 * @author gwills
 * 
 */
public class LL03CompareStringLinkedList {

	Node head; // head of list
	static Node a, b;

	/* Node Class */
	static class Node {

		char data;
		Node next;

		// Constructor to create a new node
		Node(char d) {
			data = d;
			next = null;
		}
	}

	int compare(Node node1, Node node2) {

		while (node1 != null || node2 != null) {

			if (node1 == null ^ node2 == null) {
				return node1 != null ? 1 : -1;
			}

			if (node1.data != node2.data) {

				return (node1.data - node2.data)
						/ Math.abs((node1.data - node2.data));
			}
			node1 = node1.next;
			node2 = node2.next;
		}

		return 0;

	}

	public static void main(String[] args) {

		LL03CompareStringLinkedList list = new LL03CompareStringLinkedList();
		Node result = null;

		list.a = new Node('g');
		list.a.next = new Node('e');
		list.a.next.next = new Node('e');
		list.a.next.next.next = new Node('k');
		list.a.next.next.next.next = new Node('s');

		list.b = new Node('g');
		list.b.next = new Node('e');
		list.b.next.next = new Node('e');
		list.b.next.next.next = new Node('k');
		list.b.next.next.next.next = new Node('s');
		list.a.next.next.next.next.next = new Node('a');

		System.out.println(list.compare(a, b));
		
	}
}
