package com.tyss.wrapper.wrapperclass;

public class DoubleBoxing {
  
	public static void main(String[] args) {
		
		double car = 30000.300;
		
		Double d = new Double(car);
		
		System.out.println(d);
		
		double ride = (double)car;
		System.out.println(ride);
		
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		int v = 25;
		String b = String.valueOf(v);
		System.out.println(b);
		
	}
}
