package com.cognizant.junit;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AAATest {


    Calculator calculator;



    // Setup method
    @BeforeEach
    void setup(){

        calculator = new Calculator();

        System.out.println("Setup completed");

    }



    @Test
    void testAdditionAAA(){


        // Arrange
        int a = 10;
        int b = 20;


        // Act
        int result = calculator.add(a,b);


        // Assert
        assertEquals(30,result);


    }



    // Teardown method
    @AfterEach
    void cleanup(){

        calculator = null;

        System.out.println("Cleanup completed");

    }

}