package com.igorjsantos.util;

import java.math.BigDecimal;

import com.igorjsantos.model.domain.Quotation;

/**
 * @author igorjsantos
 *
 */
public final class PrinterUtils {
	
	private PrinterUtils() {}
	
	public static void printInputParams(Quotation fromQuotation, Quotation toQuotation, Number amount) {
		System.out.println("Data source:");
		System.out.println(fromQuotation.toString());
		System.out.println("Amount: " + amount.doubleValue());
		System.out.println(toQuotation.toString());
	}
		
	public static void printResult(BigDecimal result) {
		System.out.println("Result: " + result + "\n");
	}
}
