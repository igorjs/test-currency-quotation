package com.igorjsantos.util;

import com.igorjsantos.exception.QuotationException;

/**
 * @author igorjsantos
 *
 */
public final class LoggerUtils {
	
	private LoggerUtils() {}
	
	public static void log(Exception e) {
		System.err.println("Exception :: " + e.getMessage());
	}
	
	public static void log(QuotationException e) {
		System.out.println(e.getClass().getSimpleName() + " :: " + e.getMessage());
	}
}
