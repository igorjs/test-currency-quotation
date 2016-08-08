package com.igorjsantos.validator;

import com.igorjsantos.exception.ValidationException;

/**
 * @author igorjsantos
 *
 */
public class ValueValidator implements Validator<Number>{

	@Override
	public void check(Number arg) throws ValidationException {
		if (arg == null || arg.doubleValue() < 0) {
			throw new ValidationException("The value is smaller than zero!");
		}
	}

}
