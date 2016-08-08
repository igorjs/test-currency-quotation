package com.igorjsantos.exception;

/**
 * @author igorjsantos
 *
 */
public class QuotationUnavailableException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public QuotationUnavailableException() {
		super("Quotation is not available!");
	}
}