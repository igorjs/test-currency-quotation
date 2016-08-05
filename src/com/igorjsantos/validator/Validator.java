package com.igorjsantos.validator;

import com.igorjsantos.exception.ValidationException;
import com.igorjsantos.validator.IValidator;

/**
 * @author igorjsantos
 *
 */
public class Validator {

    private IValidator validator;

    public Validator(IValidator validator)
    {
        this.validator=validator;
    }

    public boolean validate(Object o) throws ValidationException
    {
        return this.validator.validate(o);
    }

}
