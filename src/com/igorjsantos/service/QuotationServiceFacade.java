package com.igorjsantos.service;

import java.math.BigDecimal;

import com.igorjsantos.exception.QuotationUnavailableException;
import com.igorjsantos.exception.RestrictionValidationException;

public interface QuotationServiceFacade {

	BigDecimal currencyQuotation(String from, String to, Number value, String quotation) throws RestrictionValidationException, QuotationUnavailableException;
}
