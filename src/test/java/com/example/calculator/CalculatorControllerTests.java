package com.example.calculator;

import com.example.calculator.controller.CalculatorController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorControllerTests {

    private final CalculatorController controller = new CalculatorController();

    @Test
    void testAdd() {
        assertEquals(5, controller.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, controller.subtract(3, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(6, controller.multiply(2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(2, controller.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> controller.divide(10, 0), "can't divide by 0");
    }
}