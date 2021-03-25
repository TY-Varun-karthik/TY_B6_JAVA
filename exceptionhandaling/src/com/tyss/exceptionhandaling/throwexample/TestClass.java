package com.tyss.exceptionhandaling.throwexample;

import com.tyss.exceptionhandaling.throwexample.ValidAge;

public class TestClass {
	
	public void aged(int age) throws ValidAge {
		if(age<18) {
			throw new ValidAge("Below 18");
		}else {
			System.out.println("Welcome to voting");
		}
	}


}
