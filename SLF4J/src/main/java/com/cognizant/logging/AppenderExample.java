package com.cognizant.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger =
            LoggerFactory.getLogger(AppenderExample.class);


    public static void main(String[] args) {

        logger.info("Application started");

        logger.debug("Debugging information");

        logger.error("An error occurred");

    }
}