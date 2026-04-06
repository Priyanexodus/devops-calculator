package com.example.calculator.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {

    @GetMapping("add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/subtract")
    public double subtract(@RequestParam double a, @RequestParam double b) {
        return a - b;
    }

    // 3. Multiplication Endpoint
    @GetMapping("/multiply")
    public double multiply(@RequestParam double a, @RequestParam double b) {
        return a * b;
    }

    // 4. Division Endpoint
    @GetMapping("/divide")
    public double divide(@RequestParam double a, @RequestParam double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }

}
