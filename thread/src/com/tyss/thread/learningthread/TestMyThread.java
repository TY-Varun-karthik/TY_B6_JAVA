package com.tyss.thread.learningthread;

public class TestMyThread {
     
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Main Thread Priority = "+ Thread.currentThread().getPriority());
		MyThread thread = new MyThread();
		System.out.println(Thread.currentThread().isDaemon());
		thread.setPriority(1);
		thread.start();
		
		
		System.out.println("MyThread Priority: "+thread.getPriority());
//		thread.start(); --->we cannot call again it gives *IllegalThreadStateException*
//		thread.run(); ----> run as normal method
//		thread.run(10);
		
		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
