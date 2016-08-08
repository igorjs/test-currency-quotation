package com.igorjsantos.util.csv;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.igorjsantos.model.domain.Currency;
import com.igorjsantos.model.domain.Quotation;
import com.igorjsantos.util.DateUtils;

public final class QuotationCSVParser {

	private static final int DATE = 0;
	private static final int CODE = 1;
	private static final int TYPE = 2;
	private static final int NAME = 3;
	private static final int RATE = 4;
	private static final String DELIMITER = ";";
	
	private QuotationCSVParser() {}

	public static List<Quotation> parse(InputStream csv) {
		List<Quotation> quotations = new ArrayList<>();

		Scanner scanner = new Scanner(csv);

		while (scanner.hasNextLine()) {
			quotations.add(buildQuotation(scanner.nextLine().split(DELIMITER)));
		}
		
		scanner.close();
		return quotations;
	}

	private static Quotation buildQuotation(String[] line) {
		if (null == line) {
			throw new RuntimeException("Invalid line");
		}
		
		String rate = line[RATE].replace(",", ".");
		
		return new Quotation(DateUtils.toLocalDateFormat(line[DATE]),
				new Currency(line[CODE], line[TYPE], line[NAME]),
				new BigDecimal(rate));
	}
}
