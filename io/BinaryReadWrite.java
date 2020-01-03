package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class BinaryReadWrite {

	public static void main(String[] args) {
		
		if(args.length <2) {
			System.out.println("Usage: java FileCopier infile outFile");
		}
		
		String inFile =args[0];
		String outFile =args[1];
		FileInputStream fis =null;
		try {
			fis =new FileInputStream(inFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileOutputStream fout =null;
		PrintStream out =null;
		try {
			fout =new FileOutputStream(outFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		out = new PrintStream(fout);
		try {
			int bite = fis.read();
			while(bite != -1) {
				out.println(bite);
				bite=fis.read();
			}
			out.flush();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			if(fis!=null)
			{
				try
				 {
					 fis.close();
				 }
				 catch(IOException e)
				 {
					 e.printStackTrace();
				 }
			}
		}
	}

}
