package com.cognizant.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 Test Examples
 * 
 * JUnit Basics:
 * - @Test: Marks a method as test
 * - @BeforeEach: Runs before each test
 * - @AfterEach: Runs after each test
 * - assertEquals: Assert two values are equal
 * - assertTrue/assertFalse: Assert boolean condition
 * - assertThrows: Assert exception is thrown
 * - assertNull/assertNotNull: Assert null/non-null
 */
@DisplayName("Calculator Tests")
class CalculatorTest {
    
    private Calculator calculator;
    
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    @DisplayName("Test Addition")
    void testAdd() {
        // Arrange
        int a = 10, b = 20;
        
        // Act
        int result = calculator.add(a, b);
        
        // Assert
        assertEquals(30, result);
    }
    
    @Test
    @DisplayName("Test Subtraction")
    void testSubtract() {
        assertEquals(5, calculator.subtract(15, 10));
        assertEquals(-5, calculator.subtract(10, 15));
        assertEquals(0, calculator.subtract(10, 10));
    }
    
    @Test
    @DisplayName("Test Multiplication")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-20, calculator.multiply(-4, 5));
    }
    
    @Test
    @DisplayName("Test Division")
    void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5));
        assertEquals(0.5, calculator.divide(1, 2));
    }
    
    @Test
    @DisplayName("Test Division by Zero")
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
    
    @Test
    @DisplayName("Test Is Positive")
    void testIsPositive() {
        assertTrue(calculator.isPositive(5));
        assertFalse(calculator.isPositive(-5));
        assertFalse(calculator.isPositive(0));
    }
    
    @Test
    @DisplayName("Test Is Even")
    void testIsEven() {
        assertTrue(calculator.isEven(4));
        assertTrue(calculator.isEven(0));
        assertFalse(calculator.isEven(3));
        assertFalse(calculator.isEven(-3));
    }
}
