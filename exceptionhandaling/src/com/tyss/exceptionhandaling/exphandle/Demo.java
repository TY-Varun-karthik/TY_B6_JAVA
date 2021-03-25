package com.tyss.exceptionhandaling.exphandle;

public class Demo {
  public static void main(String[] args) {
	
	  int a[] = {10, 30, 40, 50};
	  try {
		System.out.println("Statement1");
		  System.out.println(a[6]);
		  
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  
	  System.out.println("Statement2");
	  System.out.println("statement3");
	  
}
}
