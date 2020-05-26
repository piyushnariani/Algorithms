package com.dhirajtanwar.mergelinkedlist;

/*
 * Merge two sorted linked lists and return it as a new list. The new list is
 * made by splicing together the nodes of the first two lists.
 */
public class LinkedList {

	Node head;

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		list1.head.next = second;
		second.next = third;
		System.out.println("first Sorted List:");
		list1.printList();

		LinkedList list2 = new LinkedList();
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(4);
		list2.head = a;
		list2.head.next = b;
		b.next = c;
		System.out.println("second Sorted List:");
		list2.printList();

		list1.head = mergeSrotedLinkedList(list1.head, list2.head);

		System.out.println("Merged Sorted List:");
		list1.printList();

	}

	/*
	 * Given: Two Sorted Linked List
	 */
	private static Node mergeSrotedLinkedList(Node list1_head, Node list2_head) {

		if (list1_head == null) {
			return list2_head;
		}
		if (list2_head == null) {
			return list1_head;
		}

		Node temp = new Node(0);
		Node tail = temp;
		while (true) {
			if (list1_head == null) {
				tail.next = list2_head;
				break;
			}
			if (list2_head == null) {
				tail.next = list1_head;
				tail = tail.next;
				break;
			}

			if (list1_head.data <= list2_head.data) {
				// System.out.println("here");
				tail.next = list1_head;
				list1_head = list1_head.next;
			} else {
				// System.out.println("test");
				tail.next = list2_head;
				list2_head = list2_head.next;
			}
			tail = tail.next;
		}

		return temp.next;
	}

	/*
	 * Method to print the LinkedList
	 */
	private void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
	}
}
