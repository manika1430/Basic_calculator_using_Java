package com.learning.basic_calculator.functions;

import com.learning.basic_calculator.exception.InvalidInputException;

public class Division implements ArithmaticOperation {


	@Override
	public double performOperation(double a, double b)throws InvalidInputException {
		if(b==0.00000 || b==0) {
			throw new InvalidInputException("Division can't be performed with 0");
		}
		
		return a/b;
	}

}
