package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {
	public static String fileName ="";
	
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw =new FileWriter(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = null;
		out = new PrintWriter(fw);
		
	}

}
