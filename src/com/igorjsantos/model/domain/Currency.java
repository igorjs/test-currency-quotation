package com.igorjsantos.model.domain;

/**
 * @author igorjsantos
 *
 */
public class Currency {
	private final String currencyCode;
	private final String currencyType;
	private final String currencyName;
	
	public Currency(String currencyName) {
		this.currencyCode = "";
		this.currencyType = "";
		this.currencyName = currencyName;
	}

	public Currency(String currencyCode, String currencyType, String currencyName) {
		this.currencyCode = currencyCode;
		this.currencyType = currencyType;
		this.currencyName = currencyName;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public String getCurrencyType() {
		return currencyType;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", currencyCode, currencyType, currencyName);
	}
}
