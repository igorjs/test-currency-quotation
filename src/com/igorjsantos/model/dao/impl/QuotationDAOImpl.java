package com.igorjsantos.model.dao.impl;

import java.time.LocalDate;

import com.igorjsantos.exception.RestrictionValidationException;
import com.igorjsantos.model.dao.QuotationDAO;
import com.igorjsantos.model.domain.Quotation;

/**
 * @author igorjsantos
 *
 */
public class QuotationDAOImpl implements QuotationDAO {

	public Quotation get(String currency, LocalDate date) throws RestrictionValidationException {
		return new Quotation(null, null, null);
		/*return csvRetrieverChain.retrieve(date).stream()
				.filter(quoteCurrency -> currencyName.equalsIgnoreCase(quoteCurrency.getCurrencyName())).findAny()
				.orElseThrow(() -> new RestrictionException("Invalid currency name: ".concat(currencyName)));*/
	}
}
