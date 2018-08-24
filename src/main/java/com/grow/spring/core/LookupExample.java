package com.grow.spring.core;

import java.util.Random;

public class LookupExample {

    private ExampleClass exampleClass;
    private Integer value;

    public LookupExample() {
        Random rnd = new Random();
        this.value = rnd.nextInt();
    }

    public void setExampleClass(ExampleClass exampleClass) {
        this.exampleClass = exampleClass;
    }

    public ExampleClass getExampleClass() {
        return exampleClass;
    }

    public Integer getValue() {
        return this.value;
    }
}
