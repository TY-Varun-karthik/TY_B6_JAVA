package com.tyss.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Varun");
		names.add("Karthik");
		names.add("TestYantra");
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}
