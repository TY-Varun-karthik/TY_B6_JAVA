package com.tyss.thread.learningthread;

public class MyThread extends Thread {
	
	@Override
	public void run() {
       for (int i = 0; i < 10; i++) {
    	   System.out.println("Child thread");
       }
	}
	
//	public void run(int n) {
//		System.out.println("2nd child thread" +n);
//	}
	


}
