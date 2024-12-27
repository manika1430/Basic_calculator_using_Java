package com.learning.basic_calculator.functions;

import com.learning.basic_calculator.exception.InvalidInputException;

public class FunctionFactory {
	

	public ArithmaticOperation getArithmaticClass(String operation) throws InvalidInputException {
		switch (operation) {
		case "add": {
			return new Addition();
		}
		case "subtract":{
			return new Subtraction();
		}
		case "divide":{
			return new Division();
		}
		case "multiply":{
			return new Multiplication();
		}
		
		default:{
			throw new InvalidInputException("You have selected invalid operation");
		}
		}
	}

}
