package com.doshin.linkedlist.questions;

import java.util.Random;

/**
 * 
 * How to find if linked list has a loop ? This question has bit of similarity
 * with earlier algorithm and data structure interview question. I mean we can
 * use two pointer approach to solve this problem. If we maintain two pointers,
 * and we increment one pointer after processing two nodes and other after
 * processing every node, we are likely to find a situation where both the
 * pointers will be pointing to same node. This will only happen if linked list
 * has loop.
 * 
 * Read more:
 * http://javarevisited.blogspot.com/2013/03/top-15-data-structures-algorithm
 * -interview-questions-answers-java-programming.html#ixzz4M9MASdM4
 * 
 * 
 * You can make use of Floyd's cycle-finding algorithm, also know as tortoise
 * and hare algorithm.
 * 
 * The idea is to have two references to the list and move them at different
 * speeds. Move one forward by 1 node and the other by 2 nodes.
 * 
 * If the linked list has a loop they will definitely meet. Else either of the
 * two references(or their next) will become null.
 * 
 * 
 * @author gwills
 * 
 */

class LL06FindLinkedListLoops {
	NodeClass head; // head of linked list

	/* Linked list NodeClass */

	/* Function to print middle of linked list */
	void showLoop() {
		NodeClass slow_ptr = head;
		NodeClass fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
				if (fast_ptr.equals(slow_ptr))
					break;
			}
			System.out
					.println("The loop element is [" + slow_ptr.data + "] \n");
		}
	}

	/* Inserts a new NodeClass at front of the list. */
	public void push(NodeClass new_node) {

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		NodeClass tnode = head;
		int i = 0;
		while (i < 21) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
			i++;
		}
		System.out.println("NULL");
	}

	public static void main(String[] args) {
		LL06FindLinkedListLoops llist = new LL06FindLinkedListLoops();

		NodeClass loopNode = null;
		int loopIndex = new Random().nextInt(20);
		for (int i = 0; i < 20; i++) {
			NodeClass node = new NodeClass(i);
			llist.push(node);
			if (i == loopIndex) {
				loopNode = node;
			}
		}

		llist.push(loopNode);

		llist.printList();
		llist.showLoop();

	}
}

class NodeClass {
	int data;
	NodeClass next;

	NodeClass(int d) {
		data = d;
		next = null;
	}
}
