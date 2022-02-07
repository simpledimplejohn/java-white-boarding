package com.revature.binarytrees;

public class Node {
	Node left;
	Node right;
	int data;
	
	// to make a node, data must be inserted
	// this will be the root node
	Node(int data) {
		this.data = data;
	}
	
	public void add(int value) {
		// smaller values go to the left
		// check value against the inserted data
		if(value <= data) {
			// if there is no node make a node with the value inserted
			if(left == null) {
				left = new Node(value);
			} else {
				// if there is a node put the data in there
				// by recursivly calling the method
				// this will run the check again and insert at the above call
				left.add(value);
			}
		}
		if(value >= data) {
			if(right == null) {
				right = new Node(value);
			} else {
				right.add(value);
			}
		}
	}
	
	public void printAll() {
		if (left != null) {
			left.printAll();
		}
		System.out.println("data: " + data);
		if (right != null) {
			right.printAll();
		}
	}
	
}


