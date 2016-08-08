package com.igorjsantos.validator;

import com.igorjsantos.exception.ValidationException;

/**
 * @author igorjsantos
 *
 */
public class CurrencyValidator implements Validator<String> {

	@Override
	public void check(String arg) throws ValidationException {
		if (arg == null || arg.isEmpty()) {
			throw new ValidationException("Currency param is invalid!");
		}
	}
	
}
