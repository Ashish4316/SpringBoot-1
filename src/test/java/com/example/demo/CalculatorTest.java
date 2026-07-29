package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(5, calculator.divide(10, 2));
    }
}
