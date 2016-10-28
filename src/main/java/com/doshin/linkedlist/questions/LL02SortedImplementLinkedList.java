package com.doshin.linkedlist.questions;

/**
 * 
 Given a linked list which is sorted, how will you insert in sorted way
 * 
 * Algorithm: Let input linked list is sorted in increasing order.
 * 
 * 1) If Linked list is empty then make the node as head and return it. 2) If
 * value of the node to be inserted is smaller than value of head node then
 * insert the node at start and make it head. 3) In a loop, find the appropriate
 * node after which the input node (let 9) is to be inserted. To find the
 * appropriate node start from head, keep moving until you reach a node GN (10
 * in the below diagram) who's value is greater than the input node. The node
 * just before GN is the appropriate node (7). 4) Insert the node (9) after the
 * appropriate node (7) found in step 3.
 * 
 * @author gwills
 * 
 */
public class LL02SortedImplementLinkedList {

	Node head;

	public static void main(String[] args) {
		LL02SortedImplementLinkedList list = new LL02SortedImplementLinkedList();

		list.add(6);
		list.add(9);
		list.add(8);
		list.add(5);
		list.add(7);

		list.printList();

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

		Node prev = null;
		Node next = null;

		Node node = new Node(new Integer(i));
		if (head == null || i < (Integer) head.value) {
			node.next = head;
			head = node;
		} else {

			prev = head;
			next = head.next;

			while (next != null && i > (Integer) next.value) {
				prev = next;
				next = next.next;
			}

			prev.next = node;
			node.next = next;

		}

	}

	public String toString() {
		String toStringval = "";
		Node node = head;
		while (node != null) {
			toStringval = toStringval + node.value + " - > ";
			node = node.next;
		}
		return toStringval;
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
