package com.tyss.exceptionhandaling.exphandle;

public class Test {

	public static void stuff() {
		System.out.println(10/0);
	}

	public static void stuff1() {
		stuff();
		
	}

	public static void stuff2() {
		stuff1();
		
	}

	public static void main(String[] args) {

		stuff2();
	}
}
