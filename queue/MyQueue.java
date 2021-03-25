package com.tyss.collection.queue;

import java.util.PriorityQueue;

public class MyQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		q.add(100);
		q.add(40);
		q.add(60);
		q.add(80);
		q.add(30);
		
//		System.out.println(q);
		
		// Printing the top element of PriorityQueue
        System.out.println(q.peek());
 
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(q.poll());
 
        // Printing the top element again
        System.out.println(q.peek());
		
	}

}
