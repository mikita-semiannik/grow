package com.grow.corebasicconcepts;

public class Triangle implements Figure{

    Point point1;
    Point point2;
    Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public void print() {
        System.out.println("" + point1 + point2 + point3 + " This is Triangle.");
    }

}
