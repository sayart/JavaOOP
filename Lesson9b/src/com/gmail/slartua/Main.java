package com.gmail.slartua;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> myList= new ArrayList<>();
		
		myList.add(10);
		myList.add(7);
		myList.add(2);
		
//		System.out.println(myList);
//		
//		myList.add(1, 4);
//		
//		System.out.println(myList);
//		
//		Integer number = myList.get(0);
//		
//		System.out.println(number);
//		
//		myList.remove(3);
//		System.out.println(myList);
//		
//		myList.set(1, 50);
//		System.out.println(myList);
		
		for(Integer element:myList) {
			System.out.println(element);
		}
		
		Iterator<Integer> itr = myList.iterator();
		
		for(;itr.hasNext();) {
			Integer element = itr.next();
			
			if(element <5) {
				itr.remove();
			}
		}
		System.out.println(myList);
		
		Collections.sort(myList);
		
		System.out.println(myList);
		
	}

}
