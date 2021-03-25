package com.tyss.exceptionhandaling.exphandle;

import java.io.FileOutputStream;

public class TryWithResource {
	
	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("C:\\TY Project\\JAVA\\Resourse")) {    
			String msg = "try with resources";
			byte byteArray[] = msg.getBytes();//converting strings to byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfully");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

 }
