package com.igorjsantos;

import com.igorjsantos.exception.QuotationException;
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
			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", 100.00, "20/11/2014"));

			// Will throw an exception			
//			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "BRL", 100.00, "07/08/2015"));
//			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", -10.00, "07/08/2016"));
//			PrinterUtils.printResult(quotationService.currencyQuotation("USD", "EUR", 100.00, "07/08/2017"));
		} 
		catch (QuotationException e) {
			LoggerUtils.log(e);
		}
		catch (Exception e) {
			LoggerUtils.log(e);
		}
	}

}
