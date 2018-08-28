package com.gmail.slartua;

public class NeggativeValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		
		return "you input negative value";
	}
	
	
	
}
