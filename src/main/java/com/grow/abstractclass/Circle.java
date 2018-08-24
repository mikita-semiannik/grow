package com.grow.abstractclass;

public class Circle extends Figure {

    private double radius = 0.0;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getAria() {
        return Math.PI * Math.pow(radius, 2);
    }

}
