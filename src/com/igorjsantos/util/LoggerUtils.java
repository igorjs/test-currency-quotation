package com.igorjsantos.util;

import java.util.logging.Logger;

import com.igorjsantos.exception.RestrictionValidationException;

/**
 * @author igorjsantos
 *
 */
public class LoggerUtils {
	
	private static Logger logger = Logger.getAnonymousLogger();
	
	public static void logException(Exception e) {
		logger.severe("Exception :: " + e.getMessage());
	}
	
	public static void logRestrictionValidationException(RestrictionValidationException e) {
		logger.severe("RestrictionValidationException :: " + e.getMessage());
	}
}
