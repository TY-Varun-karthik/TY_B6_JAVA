package com.tyss.filehandling.handle;

import java.io.File;

public class MyFileWrite {

	public static void main(String[] args) {
		
		File file = new File("test");
		
		boolean result = file.mkdir();
		
		System.out.println(result);
	}
}
