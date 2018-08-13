package com.gmal.slartua;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat catOne = new Cat("Vasya", 12, "black");
		Cat catTwo = new Cat("Vasya", 12, "black");

		Cat catThree = null;
		try {
			catThree = catOne.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(catOne);

		System.out.println(catOne.hashCode());
		System.out.println(catTwo.hashCode());

		// Integer a =127;
		// Integer b =127;
		//
		// System.out.println(a==b);
		// System.out.println(a.hashCode());
		// System.out.println(b.hashCode());

		System.out.println(catOne == catThree);
		System.out.println(catOne.equals(catThree));

		Class catClass = Cat.class;
		System.out.println();

		Field[] catField = catClass.getDeclaredFields();
		for (int i = 0; i < catField.length; i++) {
			System.out.println(catField[i]);
		}
		System.out.println();
		
		Method [] catMethod= catClass.getDeclaredMethods();
		for (int i = 0; i < catMethod.length; i++) {
			System.out.println(catMethod[i]);
		}
		System.out.println();
		
		Constructor[] catConstuctors = catClass.getDeclaredConstructors();
		for (int i = 0; i < catConstuctors.length; i++) {
			System.out.println(catConstuctors[i]);
		}
		
		Field catAge;
		try {
			catAge = catClass.getDeclaredField("age");
			catAge.setAccessible(true);
			catAge.setInt(catOne, 100500);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println();
		System.out.println(catOne);
		
		File file = new File("catOne.cat");
		
		try {
			SerializableFileWork.saveObjectToFile(catOne, file);
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
