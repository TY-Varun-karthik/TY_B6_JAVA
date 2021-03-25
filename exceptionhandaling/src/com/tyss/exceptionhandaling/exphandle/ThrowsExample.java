package com.tyss.exceptionhandaling.exphandle;

public class ThrowsExample {
	
	public static void stuff() throws Exception {
		System.out.println(10/0);
	}

	public static void stuff1() throws Exception {
		stuff();
		
	}

	public static void stuff2() throws Exception {
		stuff1();
		
	}

	public static void main(String[] args) {

		try {
			stuff2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	}
}

