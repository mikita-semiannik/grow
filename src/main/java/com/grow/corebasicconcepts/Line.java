package com.grow.corebasicconcepts;

public class Line implements Figure{

    Point point1;
    Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    @Override
    public void print() {
        System.out.println("" + point1 + point2 + " This is Line.");
    }

}
