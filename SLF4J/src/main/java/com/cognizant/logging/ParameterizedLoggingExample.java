package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);


    public static void main(String[] args) {

        String user = "Ambika";
        int age = 25;

        logger.info("User {} is {} years old", user, age);

    }
}