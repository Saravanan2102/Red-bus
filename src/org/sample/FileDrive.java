package org.sample;

import java.io.File;

public class FileDrive {

	public static void main(String[] args) {
		File f = new File("G:\\");
		
		String[] li = f.list(); 
		
		for (String x : li) {
			System.out.println(x);
		}
		
		File[] l2 = f.listFiles();
		
		for (File x : l2) {
			
			System.out.println(x);
			
		}
		
	}
}
