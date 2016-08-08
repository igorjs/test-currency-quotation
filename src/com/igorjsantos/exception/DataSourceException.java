package com.igorjsantos.exception;

/**
 * @author igorjsantos
 *
 */
public class DataSourceException extends QuotationException {
	
	private static final long serialVersionUID = 1L;

	public DataSourceException() {
		super("Quotation is not available!");
	}
	
	public DataSourceException(String message) {
		super(message);
	}	
}