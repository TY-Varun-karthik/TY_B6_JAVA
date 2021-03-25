package com.tyss.thread.learningthread;

public class TestPriorityThread {
	
	public static void main(String[] args) {
		
		PriorityThread test = new PriorityThread();
		
		test.setPriority(1);
		test.start();
		
		System.out.println("Highest Priority checking.....");
		
		
	}

}
