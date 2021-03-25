package com.tyss.collection.list;

import java.util.Arrays;
import java.util.Iterator;



public class CustomArrayList<E> implements Iterable<E> {
	
	
		private Object elementData[];
		private final int DEFAULT_SIZE = 4;
		private int size = 0;
		
		CustomArrayList(){
			this.elementData = new Object[DEFAULT_SIZE];
		}
		
		public void add(Object el) {
			if(size == elementData.length) {
				System.out.println("Size"+size);
				int prevSize = elementData.length;
				System.out.println("PrevSize"+prevSize);
				int newSize = prevSize * 2;
				System.out.println("newSize"+newSize);
				elementData = Arrays.copyOf(elementData, newSize);
			}
			this.elementData[size] = el;
			size++;
		}
		
		@Override
		public String toString() {
			String s1 = new String("[");
			for (int i = 0; i<size; i++) {
				if(i == size - 1) {
					s1 = s1 + elementData[i];
				}else {
					s1 = s1 + elementData[i]+", ";
				}
			}
			s1 = s1 + "]";
			return s1;
		}
		
		public Iterator<E> iterator() {
	        return   new MyItr();
	    }
		
		
		private class MyItr implements Iterator<E> {
             
			private int index;
			
			@Override
			public boolean hasNext() {
				return (index<size) ? true:false;
			}

			@Override
			public E next() {
				@SuppressWarnings("unchecked")
				E e = (E) elementData[index];
				index++;
				return e;
			}

			@Override
			public void remove() {
				// TODO Auto-generated method stub
				
			}

			
			
		}
		
		

		
		
		
		
		 
	}


