package org.sample;

import java.io.File;
import java.io.IOException;

public class Sample1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\filenotes\\firstfile\\newfile.txt");
		
		boolean b = f.mkdirs();
		System.out.println(b);
		
		boolean b1 = f.createNewFile();
		
		System.out.println(b1);
		
		boolean b3 = f.canRead();
		System.out.println(b3);
		
		boolean b4 = f.canWrite();
		System.out.println(b4);
		
		boolean b2 = f.isFile();
		System.out.println(b2);
		
		
		boolean d = f.isDirectory();
		System.out.println(d);
		
		boolean e = f.exists();
		System.out.println(e);
		
		
		
		
		
	}

}
