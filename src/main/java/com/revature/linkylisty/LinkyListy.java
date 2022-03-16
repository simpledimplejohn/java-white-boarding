package com.revature.linkylisty;

public class LinkyListy {
	Node head;
	
	public void insert(int data) {
		Node node = new Node(data);
		
		if(head == null) {
			head = node;
		} else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		} 
	}
	public void print() {
		Node node = head;
		System.out.println("Linked List: ");
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}

}
