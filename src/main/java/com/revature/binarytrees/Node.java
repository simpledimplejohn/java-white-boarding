package com.revature.binarytrees;

public class Node {
	Node left;
	Node right;
	int data;
	Node(int data) {
		this.data = data;
	}
	public void add(int number) {
		if(data >= number) {
			if(left == null) {
				left = new Node(number);
			} else {
				left.add(number);
			}
		}
		if(data <= number) {
			if(right == null) {
				right = new Node(number);
			} else {
				right.add(number);
			}
		}
	}
}
