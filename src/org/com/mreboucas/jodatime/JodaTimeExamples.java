package org.com.mreboucas.jodatime;

import org.joda.time.DateTime;

/**
 * @author Marcelo Rebouças [marceloreboucas10@gmail.com]
 */
public class JodaTimeExamples {
	
	public static void main(String[] args) {
		
		DateTime dt = new DateTime();
		System.out.println(dt.toString());
		dt.now();
		System.out.println(dt.plusDays(2));
		
	}

}
