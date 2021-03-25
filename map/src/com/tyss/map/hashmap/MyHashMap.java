package com.tyss.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashMap {
    
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("ID", 10);
		hm.put("Roll.no", 101);
		hm.put("Doorno", 164);
		
		System.out.println(hm);
		
		Set<String> s = hm.keySet();
		Iterator<String> name = hm.iterator();
		  while(name.hasNext()) {
			  String i = name.next();
			  
		  }
		  System.out.println(name);
		
		
		int id = hm.get("ID");
		System.out.println(id);
		
		
	}
}
