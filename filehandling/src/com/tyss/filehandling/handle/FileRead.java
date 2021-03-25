package com.tyss.filehandling.handle;

import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
	
	public static void main(String[] args) {
		
		File file = new File("karthik.txt");
		
		try {
			FileReader fw = new FileReader(file);
			fw.read();
//			fw.flush();
			System.out.println("Data Read");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
