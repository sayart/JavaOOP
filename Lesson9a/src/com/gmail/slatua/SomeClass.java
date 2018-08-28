package com.gmail.slatua;

public class SomeClass <T extends Number & Comparable<T>>{
	
	private T someField;

	public SomeClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SomeClass(T someField) {
		super();
		this.someField = someField;
	}

	public T getSomeField() {
		return someField;
	}

	public void setSomeField(T someField) {
		this.someField = someField;
	}
	
	
}
