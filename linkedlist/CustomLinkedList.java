package com.tyss.collection.linkedlist;

public class CustomLinkedList {

	private Node head;//variable declare--->At first there will be head node so we taking= node head;


	public void insert(int data){
		Node newNode = new Node(data);//creating object of the node hence one node will be created

		if(this.head == null){             
			head = newNode;  //if condition is used because initially head will be null then we give head = newNode
		}else {
			Node currentNode = head;
			while(currentNode.getNextNode() != null){
				currentNode = currentNode.getNextNode(); 
			}
			currentNode.setNextNode(newNode);
		}
	}

	public void insertHead(int data){
		Node newNode = new Node(data);
		newNode.setNextNode(head);
		head = newNode;
	}
	
	public void insertAt(int index, int data){
		Node nodeToBeInserted = new Node(data);
		Node node = head;
		for(int i = 0; i< index -1; i++){
			node = node.getNextNode();
		}
		nodeToBeInserted.setNextNode(node.getNextNode());
		node.setNextNode(nodeToBeInserted);
	}
	
	public void deleteNodeAt(int index){.
		Node node = head;
		for(int i = 0; i< index -1; i++){
			node = node.getNextNode();
		}
		node.setNextNode(node.getNextNode().getNextNode());
	}
	
	public void display(){
		if(head != null){
			Node currentNode = head;
			while(currentNode.getNextNode() != null){
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNextNode();
			}
			System.out.println(currentNode.getData());
		}
	}
	
	public Node reverse(){
		Node previous = null;
		Node current = head;
		Node next;
		while (current != null){
			next = current.getNextNode();
			current.setNextNode(previous);
			previous = current;
			current = next;
		}
		return previous;
	}

}
