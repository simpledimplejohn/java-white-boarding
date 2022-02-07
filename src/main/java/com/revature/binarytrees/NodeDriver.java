package com.revature.binarytrees;

public class NodeDriver {

	public static void main(String[] args) {
		
		// make a binary tree
		Node newNode = new Node(20);
		
		System.out.println("root node: "+newNode.data);
		
		newNode.add(4);
		newNode.add(9);
		newNode.add(1);
		newNode.add(12);
		newNode.add(7);
		newNode.add(25);
		newNode.add(30);
		newNode.add(27);
		
		System.out.println(newNode.left.data);
		
		newNode.printAll();

	}

}
