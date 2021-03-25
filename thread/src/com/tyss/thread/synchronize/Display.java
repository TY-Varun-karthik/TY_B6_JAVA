package com.tyss.thread.synchronize;

public class Display  {
	
	public synchronized void wish(String name) {
		for(int i = 0; i < 5; i++) {
			System.out.println("THE ROCK");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}
