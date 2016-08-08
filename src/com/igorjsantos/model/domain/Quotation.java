package com.igorjsantos.model.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.igorjsantos.model.domain.Currency;

/**
 * @author igorjsantos
 *
 */
public class Quotation {

	private final LocalDate date;
	private final BigDecimal rate;
	private final Currency currency;

	public Quotation(LocalDate date, BigDecimal rate, Currency currency) {
		this.date = date;
		this.rate = rate;
		this.currency = currency;
	}

	public LocalDate getDate() {
		return date;
	}

	public BigDecimal getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return String.format("(%s) - %s - %s", date, currency, rate);
	}

}
