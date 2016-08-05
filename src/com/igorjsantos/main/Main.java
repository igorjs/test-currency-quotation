package com.igorjsantos.main;

import dao.csv.QuoteCurrencyCSVDAO;
import com.igorjsantos.exception.ValidationException;
import service.QuotationService;
import service.impl.QuotationServiceImpl;
import util.PrintQuotation;

/**
 * @author igorjsantos
 *
 */
public class Main {

	public static void main(String[] args) {
		QuotationService service = new QuotationServiceImpl(new QuoteCurrencyCSVDAO());
		try {
			PrintQuotation.printResult(service.currencyQuotation("USD", "EUR", 100.00, "07/05/2016"));
		} catch (ValidationException e) {
			PrintQuotation.printRestrictionException(e);
		} catch (Exception e) {
			PrintQuotation.printGenericException(e);
		}
	}

}
