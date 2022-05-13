package com.coderewards.codesimulator;


/**
 * Java Class to generate String related Code violations
 * @author Nagesh A
 *
 */
public class StringViolations {
	
	
	public String convertToUpperCase(String inputString) {
		System.out.println(inputString);	
		
		System.out.println(inputString);
		
		System.out.println(inputString);
		
		System.out.println(inputString);
		
		return inputString.toUpperCase();
	}
	
	public String convertToLowerCase(String inputString) {
		String outputString = null;
		if(inputString != null) {
			outputString = inputString.toLowerCase();
		}
		//Intentionally added duplicate code
		if(inputString != null) {
			outputString = inputString.toLowerCase();
		}
		
		if(inputString != null) {
			outputString = inputString.toLowerCase();
		}
		
		System.out.println(outputString);
		return outputString;
	}

}
