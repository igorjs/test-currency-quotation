package com.igorjsantos.util;

import java.math.BigDecimal;

import com.igorjsantos.model.domain.Quotation;

/**
 * @author igorjsantos
 *
 */
public class PrinterUtils {

	public static void printInputParams(Quotation fromQuotation, Quotation toQuotation, Number amount) {
		System.out.println("Data source:");
		System.out.println(fromQuotation.toString());
		System.out.println("Amount: " + amount.toString());
		System.out.println(toQuotation.toString());
	}
		
	public static void printResult(BigDecimal result) {
		System.out.println("Converted: " + result);
	}
}
