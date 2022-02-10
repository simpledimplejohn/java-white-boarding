package com.revature.binarytrees;

public class NodeDriver {

	public static void main(String[] args) {
		
		// make a binary tree
		Node newNode = new Node(20);
		
//		System.out.println("root node: "+newNode.data);
		
		newNode.add(4);
		newNode.add(9);
		newNode.add(1);
		newNode.add(12);
		newNode.add(7);
		newNode.add(25);
		newNode.add(30);
		newNode.add(27);
		
//		System.out.println(newNode.left.data);
		
//		newNode.printAll();
//		System.out.println("printing left side");
//		printLeft(newNode);
		leftViewOfTree(newNode, 0); // needs level so it can pass it through
		
//		printAllNodesUnOrdred(newNode);
//		printNodesOrdered(newNode);
//		printLeftOrdered(newNode);
		
	}
	
	// how to print just the left side of a node only only for loop
	public static void printLeft(Node root) {
		if(root == null) {
			return;
		}
		for(Node node = root; node != null; node = node.left) {
			System.out.println(node.data);
		}
	}
	
	// print left side only ordered
	
	public static void printLeftOrdered(Node node) {
		if(node.left != null) {
			printLeftOrdered(node.left);
		}
		System.out.println(node.data);
		
	}
	
	// recursivly print the left side of all left side nodes
	static int maxLevel;
	public static void leftViewOfTree(Node node, int level) {
		if(node == null) {
			return;
		}
		if(level >= maxLevel) {
			System.out.println(node.data + " ");
			maxLevel++;
		}
		leftViewOfTree(node.left, level + 1);
		leftViewOfTree(node.right, level + 1);
		
	}
	
	public static void printAllNodesUnOrdred(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data);
		printAllNodesUnOrdred(node.left);
		printAllNodesUnOrdred(node.right);
	}
	
	
	public static void printNodesOrdered(Node node) {
		if(node.left != null) {
			printNodesOrdered(node.left);
		}
		System.out.println(node.data);
		if(node.right != null) {
			printNodesOrdered(node.right);
		}
	}
	
	
	

}
