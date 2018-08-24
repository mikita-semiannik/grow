package com.grow.corebasicconcepts;

public class Point {

    float x = 0;
    float y = 0;
    
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}
