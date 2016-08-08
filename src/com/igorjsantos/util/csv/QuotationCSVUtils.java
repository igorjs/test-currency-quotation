package com.igorjsantos.util.csv;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.igorjsantos.exception.DataSourceException;


/**
 * @author igorjsantos
 *
 */
public class QuotationCSVUtils {
	
	private QuotationCSVUtils() {}
	
	public static InputStream dowloadCSV(String url) throws DataSourceException {
		try {
			return new URL(url).openStream();
		} catch (IOException e) {
			throw new DataSourceException(e.getLocalizedMessage());
		}
	}
	
}
