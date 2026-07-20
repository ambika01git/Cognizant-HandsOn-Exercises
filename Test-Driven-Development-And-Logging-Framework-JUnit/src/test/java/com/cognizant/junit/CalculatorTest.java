package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {


    @Test
    void testAddition() {

        // Arrange
        Calculator calculator = new Calculator();


        // Act
        int result = calculator.add(10, 20);


        // Assert
        assertEquals(30, result);
    }



    @Test
    void testAllOperations() {

        // Arrange
        Calculator calculator = new Calculator();


        // Act and Assert
        assertEquals(30, calculator.add(10,20));

        assertEquals(10, calculator.subtract(20,10));

        assertEquals(50, calculator.multiply(5,10));

        assertEquals(5, calculator.divide(10,2));

    }

}