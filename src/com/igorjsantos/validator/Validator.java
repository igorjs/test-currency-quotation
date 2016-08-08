package com.igorjsantos.validator;

import com.igorjsantos.exception.ValidationException;

/**
 * @author igorjsantos
 *
 */
public interface Validator<T> {

	void check(T arg) throws ValidationException;
	
}
