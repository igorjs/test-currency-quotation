package com.igorjsantos.model.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author igorjsantos
 *
 */
public class Quotation {

	private final LocalDate date;
	private final BigDecimal rate;
	private final Currency currency;

	public Quotation(LocalDate date, Currency currency, BigDecimal rate) {
		this.date = date;
		this.currency = currency;
		this.rate = rate;
	}

	public LocalDate getDate() {
		return date;
	}

	private String getFormatedDate() {
		return date != null ? date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) : "";
	}

	public BigDecimal getRate() {
		return rate;
	}

	private String getFormatedRate() {
		return rate != null ? rate.toString().replace(".", ",") : "";
	}

	public Currency getCurrency() {
		return currency;
	}

	@Override
	public String toString() {
		return String.format("%s - %s - %s", getFormatedDate(), getCurrency(), getFormatedRate());
	}

}
