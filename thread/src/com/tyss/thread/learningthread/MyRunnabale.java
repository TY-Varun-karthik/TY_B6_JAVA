package com.tyss.thread.learningthread;

public class MyRunnabale implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Inside the run method");
		}
		
	}

}
