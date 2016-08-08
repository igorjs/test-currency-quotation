package com.igorjsantos;

import com.igorjsantos.exception.RestrictionValidationException;

import com.igorjsantos.service.QuotationServiceFacade;
import com.igorjsantos.service.impl.QuotationServiceFacadeImpl;

import com.igorjsantos.util.LoggerUtils;
import com.igorjsantos.util.PrinterUtils;

/**
 * @author igorjsantos
 *
 */
public class Main {

	public static void main(String[] args) {
		
		QuotationServiceFacade quotationService = new QuotationServiceFacadeImpl();
		
		try {
			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", 100.00, "20/11/2015"));
			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", 100.00, "04/08/2016"));
			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", 100.00, "20/11/2016"));
		} 
		catch (RestrictionValidationException e) {
			LoggerUtils.logRestrictionValidationException(e);
		} 
		catch (Exception e) {
			LoggerUtils.logException(e);
		}
	}

}
