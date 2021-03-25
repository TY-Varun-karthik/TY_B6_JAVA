package com.tyss.thread.learningthread;

public class TestMyRunnable {

	public static void main(String[] args) {


		MyRunnabale runnable = new MyRunnabale();
		Thread thread = new Thread(runnable);

		thread.start();
		System.out.println("Thread Id = " +thread.getId());
		thread.setName("varun");
		System.out.println("Thread name = "+thread.getName());
		

		for(int i=0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}



}

