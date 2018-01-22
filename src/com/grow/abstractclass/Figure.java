package com.grow.abstractclass;

public abstract class Figure {

    private double x = 0.0;
    private double y = 0.0;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getPerimeter();

    public abstract double getAria();

}
