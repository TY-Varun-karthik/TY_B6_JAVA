package com.tyss.constructorchaining.chaining;

public class MyChaining {
	
	public MyChaining(int id) {
		this("varun@gmail.com", 98);
		System.out.println("Id: "+id);
	}
	
	public MyChaining(int age, String name) {
		this(101);
		System.out.println("Age: "+age+"Name: "+name);
	}
	
	public MyChaining(String email, int marks) {
		System.out.println("Email: "+email+"Marks: "+marks);
	}
	
	public static void main(String[] args) {
		
		MyChaining chain = new MyChaining(25, "Varun");
	}
}
