package com.igorjsantos.service;

import java.math.BigDecimal;

import com.igorjsantos.exception.QuotationException;

public interface QuotationServiceFacade {

	BigDecimal currencyQuotation(String from, String to, Number value, String quotation) throws QuotationException, Exception;
}
