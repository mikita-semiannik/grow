package com.grow.spring.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FactoryExample {

    private static final Logger LOGGER = LogManager.getLogger(FactoryExample.class);

    private FactoryExample() {
    }

    public void print() {
        LOGGER.info("Hello from FactoryExample!");
    }

    public static FactoryExample getInstance() {
        return new FactoryExample();
    }
}
