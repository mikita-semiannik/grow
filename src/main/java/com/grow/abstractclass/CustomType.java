package com.grow.abstractclass;

/**
 * 
 * Interesting implementation Enum.
 * 
 * @author Mikita_Semiannik
 *
 */
public enum CustomType {
    ONE(1),
    TWO(2),
    TREE(3);

    private final int number;

    private CustomType(int number) {
        this.number = number;
    }

    public int getDigit() {
        return number;
    }
}
