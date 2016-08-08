package com.igorjsantos.model.dao;

import java.time.LocalDate;

import com.igorjsantos.exception.RestrictionValidationException;
import com.igorjsantos.model.domain.Quotation;

/**
 * @author igorjsantos
 *
 */
public interface QuotationDAO {

	Quotation get(String currency, LocalDate date) throws RestrictionValidationException;
	
}
