package com.gmail.slartua;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File in = new File("D://Artem/литература по Java/1898.pdf");
		File out = new File(in.getName());
		
		try {
			StreamWork.copyFile(in, out);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
