package com.igorjsantos.model.dao;

import java.time.LocalDate;

import com.igorjsantos.exception.DataSourceException;
import com.igorjsantos.exception.ValidationException;
import com.igorjsantos.model.domain.Quotation;

/**
 * @author igorjsantos
 *
 */
public interface QuotationDAO {

	Quotation get(String currency, LocalDate date) throws ValidationException, DataSourceException, Exception;
	
}
