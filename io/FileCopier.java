package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopier {
	
	
	public static String fileName1 = "D://Text.txt";
	public static String fileName2 = "D://NewText.txt";

	public static void main(String[] args) {
		File file = new File(fileName1);
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
			
			FileWriter fw = null;
			try {
				fw =new FileWriter(fileName2);
			} catch (IOException e) {
				e.printStackTrace();
			}
			PrintWriter out = null;
			out = new PrintWriter(fw);
			
			buffer = new BufferedReader(reader);
			String line ="";
			try {
				line = buffer.readLine();
				while(line != null)
				{	
					out = new PrintWriter(fw);
					System.out.println();
					out.println(line);
					line = buffer.readLine();
				}
			} catch (IOException e) {
				
				System.out.println("Error reading file "+e.getMessage());
			}
			
			if(fw !=null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			}
		}

	}


