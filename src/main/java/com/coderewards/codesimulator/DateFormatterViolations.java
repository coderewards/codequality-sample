package com.coderewards.codesimulator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Java Class to generate Date conversation related Code violations
 * @author Nagesh A
 *
 */
public class DateFormatterViolations {
	
	private static final String DATE_FORMAT = "\"dd/MM/yyyy\"";
	

	public String  getCurrentDateString() {
		Date date = new Date();  
	    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);  
	    String dateString= sdf.format(date);
	    System.out.println(dateString);
	    return dateString;
	}
	
}
