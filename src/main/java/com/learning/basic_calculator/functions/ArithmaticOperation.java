package com.learning.basic_calculator.functions;

import com.learning.basic_calculator.exception.InvalidInputException;

public interface ArithmaticOperation {

	public double performOperation(double a, double b)throws InvalidInputException;	
	
}
