package com.tyss.thread.synchronize;

public class Mythread extends Thread {
   
		Display d;
		String name;
		int id;
		
		public Mythread(Display d, String name,int id) {
			super();
			this.d = d;
			this.name = name;
			this.id = id;
		}
		
		@Override
		public void run() {
		   d.wish(name);
		
		}
		
        
	}

