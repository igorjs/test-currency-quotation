package com.igorjsantos.exception;

/**
 * @author igorjsantos
 *
 */
public class RestrictionValidationException extends Exception {

	private static final long serialVersionUID = 1L;

	public RestrictionValidationException() {
		super();
	}

	public RestrictionValidationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RestrictionValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestrictionValidationException(String message) {
		super(message);
	}

	public RestrictionValidationException(Throwable cause) {
		super(cause);
	}
}
