package com.igorjsantos.validator;

import com.igorjsantos.exception.RestrictionValidationException;

/**
 * @author igorjsantos
 *
 */
public interface Validator<T> {

	void check(T arg) throws RestrictionValidationException;
	
}
