package com.igorjsantos.exception;

/**
 * @author igorjsantos
 *
 */
public class QuotationException extends Exception {

	private static final long serialVersionUID = 1L;

	public QuotationException() {
		super();
	}

	public QuotationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public QuotationException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuotationException(String message) {
		super(message);
	}

	public QuotationException(Throwable cause) {
		super(cause);
	}
}
