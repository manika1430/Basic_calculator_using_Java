package com.learning.basic_calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayCalculator {

    @RequestMapping("/calculator")
    public String showCalculator(){
        return "mainCalculatorUI";
    }
}
