package com.tyss.thread.learningthread;

public class Sleeps extends Thread {
     
	public static void main(String[] args) throws InterruptedException {
		
	System.out.print("V");
	Thread.sleep(2000);

	System.out.print("A");
	Thread.sleep(2000);
	
	System.out.print("R");
	Thread.sleep(2000);
	
	System.out.print("U");
	Thread.sleep(2000);
	
	System.out.print("N");
	Thread.sleep(2000);
	
	}
}
