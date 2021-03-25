package com.tyss.filehandling.handle;

import java.io.File;
import java.io.IOException;

public class CreateFileProgram {
  
	public static void main(String[] args) {
		
		File f = new File("varun.pdf");
		
		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
