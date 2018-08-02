package com.gmail.slartua;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		File file = new File("a.txt");

		try (InputStream is = new FileInputStream(file)) {
			
//			System.out.println(is.available());
//			
//			System.out.println(is.markSupported());
			
			byte[] buffer =new byte[7];
			
			int readBytes=is.read(buffer);
			
			System.out.println(Arrays.toString(buffer));
			System.out.println(readBytes);
			
			readBytes=is.read(buffer);
			
			System.out.println(Arrays.toString(buffer));
			System.out.println(readBytes);
			
		} catch (IOException e) {

		}
	}

}
