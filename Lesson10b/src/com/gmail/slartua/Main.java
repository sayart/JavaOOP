package com.gmail.slartua;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array = new Integer[100];
		Random rn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rn.nextInt(11);
		}
		Map<Integer, Integer> result = getStat(array);
		result.forEach((key, value)->System.out.println(key+" "+value));
	}
	public static Map<Integer, Integer> getStatistic(Integer[] array){
		Map<Integer, Integer> result = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			Integer count = result.get(array[i]);
			if(count==null) {
				result.put(array[i], 1);
			}else {
				result.put(array[i], ++count);
			}
		}
		return result;
	}
	
	public static<T> Map<T, Integer> getStat(T[] array){
		Map<T, Integer> result = new HashMap<>();
		for (T key:array) {
			Integer count = result.get(key);
			if(count==null) {
				result.put(key, 1);
			} else {
				result.put(key, ++count);
			}
		}
		return result;
	}

}
