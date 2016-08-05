package com.igorjsantos.validator;

import com.igorjsantos.exception.ValidationException;

/**
 * @author igorjsantos
 *
 */
interface IValidator<T> {
	
	void validate(T arg) throws ValidationException;
	
}
