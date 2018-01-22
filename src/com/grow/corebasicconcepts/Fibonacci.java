package com.grow.corebasicconcepts;

public class Fibonacci {

    public static String calc(Integer leng) {
        StringBuilder strBuilder = new StringBuilder();
        int numPrev = 1;
        int numPrevPrev = 0;
        int temp = 0;
        strBuilder.append("[");
        for (int i = 0; i < leng; i++) {
            if(i != 0) {
                strBuilder.append(", ");
            }
            strBuilder.append(numPrev);
            temp = numPrev;
            numPrev = numPrevPrev + numPrev;
            numPrevPrev = temp;
        }
        strBuilder.append("]");
        return strBuilder.toString();
    }
}
