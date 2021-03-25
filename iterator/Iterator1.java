package com.tyss.collection.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<Character> al = new ArrayList<Character>();
		al.add('V');
		al.add('A');
		al.add('R');
		al.add('U');

		ListIterator<Character> ltr = al.listIterator();
		
		while(ltr.hasNext()) {
			Character ch = ltr.next();
			System.out.print(ch);
		}
		System.out.println();

		while(ltr.hasPrevious()) {
			Character ch1=ltr.previous();
			System.out.print(ch1);
		}
	}
}
