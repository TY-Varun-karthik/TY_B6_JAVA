package com.tyss.thread.synchronize;

public class TestDemo {
    public static void main(String[] args) {
		
    	Display d = new Display();
    	
		Mythread  thread = new Mythread(d,"varun", 101);
		Mythread  thread1 = new Mythread(d,"karthik", 102);
		
		thread.start();
		thread1.start();
		
	}
}
