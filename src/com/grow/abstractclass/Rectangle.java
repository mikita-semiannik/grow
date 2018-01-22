package com.grow.abstractclass;

public class Rectangle extends Figure {

    private double width = 0.0;
    private double height = 0.0;

    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public double getAria() {
        return width * height;
    }

}
