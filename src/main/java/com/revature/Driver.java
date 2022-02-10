package com.revature;



public class Driver {

	public static void main(String[] args) {
		Node newNode = new Node(10);
		newNode.add(5);
		newNode.add(3);
		newNode.add(7);
		newNode.add(12);
		newNode.add(11);
		newNode.add(17);
		newNode.add(6);
		printAll(newNode);
		System.out.println();
		printLeft(newNode, 0);
	}	
	public static int maxLevel = 0;
	public static void printLeft(Node node, int level) {
		if(node == null) {
			return;
		}
		if(maxLevel == level) {
			System.out.print(node.data+ " ");
			maxLevel ++;
		} 
		printLeft(node.left, level + 1);
		printLeft(node.right, level + 1);
		
		
	}
	public static void printAll(Node node) {
		if(node == null) {
			return;
		}
		printAll(node.left);
		System.out.print(node.data+" ");
		printAll(node.right);
	}
}
