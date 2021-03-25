package com.tyss.exceptionhandaling.exphandle;

public class Division {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Statement1");
			System.out.println("Division" + (10/0));
			System.out.println("Statement2");
		} catch (Exception e) {
			System.out.println("statement3");
			System.out.println("Division " + (10/5));
			System.out.println("statement4");
		}
	}

}
