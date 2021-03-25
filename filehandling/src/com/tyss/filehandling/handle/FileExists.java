package com.tyss.filehandling.handle;

import java.io.File;

public class FileExists {

	public static void main(String[] args) {
		
		File f = new File("test");
		
		System.out.println(f.exists());
		System.out.println(f.getName());
//		System.out.println();
		
		f.delete();
		
		System.out.println(f.exists());
	}
}
