package com.learning.basic_calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.basic_calculator.exception.InvalidInputException;
import com.learning.basic_calculator.functions.ArithmaticOperation;
import com.learning.basic_calculator.functions.FunctionFactory;

@Controller
public class Calculate {

	@RequestMapping("/calculate")
	public String calculate(@RequestParam("num1") String num1, @RequestParam("num2") String num2,
			@RequestParam("operation") String operation, org.springframework.ui.Model model) {
		double a = Double.parseDouble(num1);
		double b = Double.parseDouble(num2);
		double res = 0.0;
		
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);

		FunctionFactory factory = new FunctionFactory();
		try {
			ArithmaticOperation operatingClass = factory.getArithmaticClass(operation);
			res = operatingClass.performOperation(a, b);
			String result=num1+" "+ operation+" "+num2+ " is "+res;
			model.addAttribute("result", result);
		} catch (InvalidInputException e) {
			System.out.println("encountered exception->" + e.getMessage());
			model.addAttribute("result", e.getMessage());
		}

		return "mainCalculatorUI";

	}
}
