package com.grow.spring.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class ExampleClass {
    private static final Logger LOGGER = LogManager.getLogger(ExampleClass.class);

    @Value("${message.hello}")
    private String helloMessage;
    private Integer value;

    public ExampleClass() {
        Random rnd = new Random();
        this.value = rnd.nextInt();
    }

    public void print() {
        LOGGER.info(helloMessage);
    }

    public Integer getValue() {
        return this.value;
    }

}
