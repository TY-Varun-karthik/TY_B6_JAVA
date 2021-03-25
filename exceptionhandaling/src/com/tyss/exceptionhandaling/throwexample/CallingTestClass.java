package com.tyss.exceptionhandaling.throwexample;

public class CallingTestClass {
	
	public static void main(String[] args) {
		
		TestClass test = new TestClass();
		
		try {
			test.aged(13);
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("Exception occured: "+e);
		}
	}

}
