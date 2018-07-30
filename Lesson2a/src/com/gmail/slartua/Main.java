package com.gmail.slartua;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat catOne = new Cat(5, 3.2, true, "Milk", "Vaska", "homecat");
		
		System.out.println(catOne.getRation());
		
		System.out.println(catOne.hashCode());
		
		catOne.getVoice();
		
		System.out.println(catOne);
		
		Animal [] zoo = new Animal[10];
		
		zoo[0] = catOne;
		
		
	}
	
	public static void makeVoice(Animal an) {
		an.getVoice();
	}

}
