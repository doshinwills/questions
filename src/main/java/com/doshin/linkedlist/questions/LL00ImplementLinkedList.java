package com.doshin.linkedlist.questions;

/**
 * Given a Singly Linked List, write a function to delete a given node. Your
 * function must follow following constraints: 1) It must accept pointer to the
 * start node as first parameter and node to be deleted as second parameter
 * i.e., pointer to head node is not global. 2) It should not return pointer to
 * the head node. 3) It should not accept pointer to pointer to head node.
 * 
 * You may assume that the Linked List never becomes empty.
 * 
 * Let the function name be deleteNode(). In a straightforward implementation,
 * the function needs to modify head pointer when the node to be deleted is
 * first node. As discussed in previous post, when a function modifies the head
 * pointer, the function must use one of the given approaches, we can’t use any
 * of those approaches here.
 * 
 * @author gwills
 * 
 */
public class LL00ImplementLinkedList {

	Node head;
	Node last;

	public static void main(String[] args) {
		LL00ImplementLinkedList list = new LL00ImplementLinkedList();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);

		list.printList();

		list.remove(5);

		list.printList();

	}

	private void remove(int i) {
		Node node = head;
		Node prev = null;

		if (head.value.equals(i)) {
			head = head.next;
			return;
		}

		while (node != null) {
			if (node.value.equals(i)) {
				prev.next = node.next;
				if (prev.next == null) {
					last = null;
				}
			}
			prev = node;
			node = node.next;

		}

	}

	private void printList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.value + " - > ");
			node = node.next;
		}
		System.out.println("");
	}

	private void add(int i) {

		Node node = new Node(new Integer(i));
		if (head == null) {
			head = node;
		} else {
			last.next = node;
		}

		last = node;

	}

	class Node {
		Object value;
		Node next;

		public Node(Object value) {
			super();
			this.value = value;
		}

		@Override
		public String toString() {
			return value.toString();
		}

	}
}
