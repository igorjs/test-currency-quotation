package com.igorjsantos.service.impl;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.igorjsantos.exception.QuotationException;
import com.igorjsantos.exception.ValidationException;
import com.igorjsantos.model.dao.QuotationDAO;
import com.igorjsantos.model.dao.impl.QuotationDAOImpl;
import com.igorjsantos.model.domain.Quotation;
import com.igorjsantos.service.QuotationServiceFacade;
import com.igorjsantos.util.DateUtils;
import com.igorjsantos.util.PrinterUtils;
import com.igorjsantos.validator.CurrencyValidator;
import com.igorjsantos.validator.ValueValidator;

public class QuotationServiceFacadeImpl implements QuotationServiceFacade {

	private final QuotationDAO quotationDAO;
	
	public QuotationServiceFacadeImpl() {
		this.quotationDAO = new QuotationDAOImpl();
	}
	
	@Override
	public BigDecimal currencyQuotation(String from, String to, Number value, String quotation) throws QuotationException, Exception {
		
		validate(from, to, value, quotation);

		Quotation fromQuotation = quotationDAO.get(from, DateUtils.toLocalDateFormat(quotation));
		Quotation toQuotation = quotationDAO.get(to, DateUtils.toLocalDateFormat(quotation));
		
		PrinterUtils.printInputParams(fromQuotation, toQuotation, value);
		
		return calculate(value, fromQuotation, toQuotation);
	}
	
	private static void validate(String from, String to, Number value, String quotation) throws ValidationException {
		new CurrencyValidator().check(from);
		new CurrencyValidator().check(to);
		new ValueValidator().check(value);
	}
	
	private static BigDecimal calculate(Number value, Quotation fromQuotation, Quotation toQuotation) {
		BigDecimal division = fromQuotation.getRate().divide(toQuotation.getRate(), RoundingMode.CEILING);  
		BigDecimal result = division.multiply(BigDecimal.valueOf(value.doubleValue()));
		return result.setScale(2, RoundingMode.CEILING);
	}

}
