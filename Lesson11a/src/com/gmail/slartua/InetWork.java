package com.gmail.slartua;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class InetWork {
	public static void saveURLFileToFolder(String url, File folder) throws IOException{
		URL urlConnecton = new URL(url);
		HttpURLConnection connection = (HttpURLConnection)urlConnecton.openConnection();
		int index = url.lastIndexOf("/");
		String fileName = url.substring(index + 1);
		File file = new File(folder, fileName);
		try(InputStream is = connection.getInputStream();
				OutputStream os = new FileOutputStream(file)){
			StreamWork.streamCopy(is, os);
		}catch(IOException e) {
			throw e;
		}
	}
	
	public static String getStringFromURL(String url, String decode) throws IOException{
		String htmlCode = "";
		URL urlConnecton = new URL(url);
		HttpURLConnection connection = (HttpURLConnection)urlConnecton.openConnection();
		
		try(BufferedReader br = 
				new BufferedReader(new InputStreamReader(connection.getInputStream(), decode))){
			String temp="";
			for(;(temp=br.readLine())!=null;) {
				htmlCode+=temp+System.lineSeparator();
			}
		}catch(IOException e) {
			throw e;
		}
		return htmlCode;
	}
	
	public static Map<String,List<String>> getHeaderFromUrl(String url){
		Map<String,List<String>> result = null;
		try {
			URL urlConnection = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) urlConnection.openConnection();
			result = connection.getHeaderFields();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
		
		
	}
}

