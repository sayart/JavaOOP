package com.gmail.slartua;

import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String url = "https://prog.kiev.ua/images/elements/career-1.png";
//		File folder = new File("AAA");
//		folder.mkdirs();
//		
//		try {
//			InetWork.saveURLFileToFolder(url, folder);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String url= "https://prog.kiev.ua/forum/index.php/topic,3751.75.html";
		
//		String text = "";
//		
//		try {
//			text = InetWork.getStringFromURL(url, "utf-8");
//			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		System.out.println(text);
		
		
		Map<String,List<String>> headers = InetWork.getHeaderFromUrl(url);
		headers.forEach((key, value) -> System.out.println(key + " ->"+value));
	
	}

}
