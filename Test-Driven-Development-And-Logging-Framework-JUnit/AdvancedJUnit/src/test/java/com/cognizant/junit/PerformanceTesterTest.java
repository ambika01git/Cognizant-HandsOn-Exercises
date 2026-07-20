package com.cognizant.junit;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class PerformanceTesterTest {

    PerformanceTester performanceTester = new PerformanceTester();

    @Test
    void testPerformance() {

        assertTimeout(Duration.ofSeconds(2), () -> {
            performanceTester.performTask();
        });

    }

}