package com.igorjsantos.validator;

import com.igorjsantos.exception.RestrictionValidationException;

/**
 * @author igorjsantos
 *
 */
public class ValueValidator implements Validator<Number>{

	@Override
	public void check(Number arg) throws RestrictionValidationException {
		if (arg == null || arg.doubleValue() < 0) {
			throw new RestrictionValidationException("Value param is invalid!");
		}
	}

}
