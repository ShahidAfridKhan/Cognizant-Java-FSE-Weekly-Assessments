package com.example.week2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {
    private static final Logger log = LoggerFactory.getLogger(LoggingExample.class);

    public void run() {
        log.info("starting application flow");
        log.warn("control path uses default values");
        log.error("error path triggered if data is missing");
    }
}
