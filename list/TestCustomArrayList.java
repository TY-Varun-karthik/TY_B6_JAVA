package com.tyss.collection.list;

import java.util.Iterator;

public class TestCustomArrayList <T> {
	
	public static void main(String[] args) {
		
		CustomArrayList<Integer> custom = new CustomArrayList<Integer>();
		
		custom.add(20);
		custom.add(30);
		custom.add(40);
		custom.add(50);
		custom.add(60);
		
//		System.out.println(custom);
		
//	for(Object obj: custom) {
//			System.out.println(obj);
//			}
//		
		
		 Iterator<Integer> itr = custom.iterator();
		  while(itr.hasNext()) {
			 System.out.println(itr.next());
		  }
		
		
	}

}
