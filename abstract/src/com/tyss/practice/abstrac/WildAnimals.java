package com.tyss.practice.abstrac;

public class WildAnimals extends Animal{

	@Override
	public void dog() {
		System.out.println("Hey I'm a Dog");
		
	}
	
	public void Lion() {
		System.out.println("I'm the King of Jungle");
	}

	@Override
	public void cat() {
       System.out.println("Hey I'm a Cat");		
	}

}
