package com.tyss.singleton.single;

public class Demo {
	
    private static Demo d = null;
	
	private Demo() {
		System.out.println("Demo Constructor");
	}
	
	public static void createObject() {
		if(d == null) {
		 d = new Demo();
		}
		
//		System.out.println("Object Created");
	}
	
	public static void main(String[] args) {
		
		Demo.createObject();
		Demo.createObject();
		
	}

}
