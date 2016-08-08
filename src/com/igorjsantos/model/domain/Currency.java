package com.igorjsantos.model.domain;

/**
 * @author igorjsantos
 *
 */
public class Currency {
	private final String code;
	private final String type;
	private final String name;
	
	public Currency(String name) {
		this.code = "";
		this.type = "";
		this.name = name;
	}

	public Currency(String code, String type, String name) {
		this.code = code;
		this.type = type;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	
	public String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s", code, type, name);
	}
}
