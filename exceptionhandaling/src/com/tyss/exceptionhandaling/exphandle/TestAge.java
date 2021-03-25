package com.tyss.exceptionhandaling.exphandle;

public class TestAge {
	
	public void aged(int age) throws ValidAge {
		if(age<18) {
			throw new ValidAge("Below 18");
		}else {
			System.out.println("Welcome to voting");
		}
	}

}
