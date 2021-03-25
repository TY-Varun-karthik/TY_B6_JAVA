package com.tyss.filehandling.handle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	
	public static void main(String[] args) {
		
		File file = new File("karthik.txt");
//		FileWrite f = null;
		
		try {
			FileWriter fw = new FileWriter(file);
			fw.write("Hello world");
			fw.flush();
			System.out.println("Data Stored");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
