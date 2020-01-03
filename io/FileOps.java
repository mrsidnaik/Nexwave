package io;

import java.io.File;

public class FileOps {
	
	public static void main(String[] args) {
		File file =new File("D://mydata");
		boolean done =file.mkdir();
		System.out.println(done);
	}

}
