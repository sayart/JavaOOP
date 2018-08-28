package com.gmail.slartua;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> myMap = new HashMap<>();
		myMap.put(1, "one");
		myMap.put(5, "five");
		myMap.put(2, "two");
		
		System.out.println(myMap);
		
		String number = myMap.get(50);
		System.out.println(number);
		
		Set<Integer> keys = myMap.keySet();
		for (Integer key : keys) {
			System.out.println(key + " " + myMap.get(key));
		}
		System.out.println();
		myMap.forEach((key, value)->System.out.println(key+" "+value));
		
		myMap.put(1, "One");
		System.out.println(myMap);
		
		myMap.remove(1);
		System.out.println(myMap);
		
		
	}

}
