package com.tyss.collection.list;


import java.util.ArrayList;
import java.util.List;
//import java.util.List;

public class araylist {
        
	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
//		
		List<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		
		
//		System.out.println(al);
		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}
//		
		for(Object a: l) {
			System.out.println(a);
		}
		
//		Iterator iterator = al.iterator();
//		while(iterator.hasNext()) {
//			Integer lst = (Integer) iterator.next();
//			System.out.println(lst);
//		}
	}
}
