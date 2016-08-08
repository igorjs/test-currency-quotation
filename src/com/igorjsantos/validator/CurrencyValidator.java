package com.igorjsantos.validator;

import com.igorjsantos.exception.RestrictionValidationException;
import com.igorjsantos.model.domain.Currency;

/**
 * @author igorjsantos
 *
 */
public class CurrencyValidator implements Validator<String> {

	@Override
	public void check(String arg) throws RestrictionValidationException {
		if (arg == null || arg.isEmpty()) {
			throw new RestrictionValidationException("Currency param is invalid!");
		}
	}
	
}
