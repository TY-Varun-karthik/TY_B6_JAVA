package com.tyss.exceptionhandaling.exphandle;

public class MultipleArgs {
public static void main(String[] args) {
		
		int a[] = {10, 20, 40 ,60};
		
		System.out.println("statement1");
		try {
			System.out.println("Division " + (10/0));
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException  e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			
		}
//			catch(ArithmeticException e) {
//			System.out.println("ArithmeticException");
//		}
			catch(Exception e) {
			System.out.println("Exception");
			System.exit(0); //If we don't want to execute the finally block 
		}finally {
			System.out.println("Finally block is running");
		}
		System.out.println("Rest of code flow");

	}
}
