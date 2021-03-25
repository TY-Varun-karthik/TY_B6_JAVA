package com.tyss.exceptionhandaling.exphandle;

public class NestedTryCatch {
    public static void main(String[] args) {
    	int a[] = {10, 30, 40, 50};
  	  try {
  		System.out.println("Statement1");
  		  System.out.println(a[6]);
  		  
//  		  try {
//			System.out.println("Inside try block");
//		} catch (Exception e1) {
//			System.out.println("Inside catch block");
//		}
  		  
  	} catch (Exception e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}finally{
  		 
    	  System.out.println("Statement2");
    	  System.out.println("statement3");
    	  
  	}
  	  
  	 
  }
	}
