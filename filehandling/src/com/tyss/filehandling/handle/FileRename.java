package com.tyss.filehandling.handle;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

public class FileRename {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("hari.txt");
		boolean res = f1.createNewFile();
		System.out.println(res);
		
		File f2 = new File("karthik.txt");
		
		System.out.println(f1.renameTo(f2));
		
		long milliseconds = f2.lastModified();
		System.out.println(milliseconds);
		
		Date date = new Date(milliseconds);
		System.out.println(date);
		
		
	}
}
