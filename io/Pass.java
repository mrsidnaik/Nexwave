package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pass {

	public static void main(String[] args) {
		
		String fileName="D://Text.txt";
		File file =new File(fileName);
		if (file.exists())
		{
			FileReader reader = null;
			try {
				reader = new FileReader(file);
			} catch (FileNotFoundException e1) {
				System.out.println("File not found");
				e1.printStackTrace();
			}
			BufferedReader buffer = null;
			buffer = new BufferedReader(reader);
			String[] s = new String [2];
			String line ="";
			try {
				line = buffer.readLine();
				while(line != null)
				{	
					System.out.println(s[0]+s[1]);
					line = buffer.readLine();
				}
			} catch (IOException e) {
				
				System.out.println("Error reading file "+e.getMessage());
			}
			
		}

	}

}
