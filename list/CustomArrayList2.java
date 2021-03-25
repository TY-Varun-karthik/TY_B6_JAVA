package com.tyss.collection.list;


//import java.util.Iterator;

public class CustomArrayList2  {
      
	private Object[] objArray;
	private final int DEFAULT_SIZE = 5;
	private int elementCount = 0;
	
	 CustomArrayList2() {
		super();
		this.objArray = new Object[DEFAULT_SIZE];
	}
	 
	 public void add(Object obj) {
		 if(elementCount == objArray.length) {
			increaseCapacity(); 
		 }
		 objArray[elementCount] = obj;
		 elementCount++;
	}

	private void increaseCapacity() {
		int newCapacity = objArray.length*2;
		Object[] nextArray = new Object[newCapacity];
		
		for(int i = 0; i < objArray.length; i++) {
			nextArray[i] = objArray[i];
		}
		
		objArray = nextArray;
	}
	
	@Override
	public String toString() {
		String s1 = new String("[");
		for (int i = 0; i<elementCount; i++) {
			if(i == elementCount - 1) {
				s1 = s1 + objArray[i];
			}else {
				s1 = s1 + objArray[i]+", ";
			}
		}
		s1 = s1 + "]";
		return s1;
	}
	
//	public void forEach(Object object) {
//		for(int i =0;i<elementCount;i++) {
//			object = objArray[i];
//			System.out.println(object);
//		}
//	}

    
	
	
}
