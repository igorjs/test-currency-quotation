package com.igorjsantos.model.dao.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.igorjsantos.exception.DataSourceException;
import com.igorjsantos.model.dao.QuotationDAO;
import com.igorjsantos.model.domain.Quotation;
import com.igorjsantos.util.DateUtils;
import com.igorjsantos.util.csv.QuotationCSVParser;
import com.igorjsantos.util.csv.QuotationCSVUtils;

/**
 * @author igorjsantos
 *
 */
public class QuotationDAOImpl implements QuotationDAO {

	private static final String DATASOURCE_URL = "http://www4.bcb.gov.br/Download/fechamento/%s.csv";

	private final Map<LocalDate, List<Quotation>> cache;

	public QuotationDAOImpl() {
		this.cache = new HashMap<LocalDate, List<Quotation>>();
	}

	@Override
	public Quotation get(String currency, LocalDate date) throws DataSourceException {
		return getQuotationData(date).stream().filter(q -> currency.equalsIgnoreCase(q.getCurrency().getName())).findAny()
				.orElseThrow(() -> new DataSourceException());
	}

	private List<Quotation> getQuotationData(LocalDate quotationDate) throws DataSourceException {
		
		LocalDate date = DateUtils.getLastBussinesDay(quotationDate);
		
		if (cache.containsKey(date)) {
			return cache.get(date);
		}
		
		List<Quotation> quotations = QuotationCSVParser.parse(QuotationCSVUtils.dowloadCSV(getDataSourceURL(date)));
		if (quotations != null) {
			cache.put(date, quotations);
		}
		return quotations;
	}

	private static String getDataSourceURL(LocalDate date) {
		return String.format(DATASOURCE_URL, DateUtils.toDataSourceDateFormat(date));
	}
}
