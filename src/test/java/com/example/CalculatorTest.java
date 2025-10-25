package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should equal -1");
    }

    @Test
    void testSubtract() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should equal 2");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 should equal 0");
        assertEquals(-3, calculator.subtract(-2, 1), "-2 - 1 should equal -3");
    }
}