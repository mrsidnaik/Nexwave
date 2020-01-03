package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {
	
	public static String fileName = "D://Text.txt";

	public static void main(String[] args) {
		File file = new File(fileName);
		System.out.println("file available ? "+file.exists());
		if (file.exists())
		{
			System.out.println((file.getPath()));
			
			//Read file contents
			FileReader reader = null ;
			BufferedReader buffer = null;
			try {
				reader = new FileReader(file);
			} catch (FileNotFoundException e) {
				System.out.println("File does not exist");
				e.printStackTrace();
			}
			
			buffer = new BufferedReader(reader);
			String line ="";
			try {
				line = buffer.readLine();
				while(line != null)
				{	
					System.out.println(line);
					line = buffer.readLine();
				}
			} catch (IOException e) {
				
				System.out.println("Error reading file "+e.getMessage());
			}
		}
	}

}
