package com.grow.corebasicconcepts;

public class Main {

    public static void main(String[] args) {
        Figure line = new Line(new Point(1f, 1f),new Point(3f, 5f));
        Figure triangle = new Triangle(new Point(1f, 1f),new Point(3f, 5f), new Point(3f, 1f));
        Figure square = new Square();

        line.print();
        triangle.print();
        square.print();

        System.out.println(Fibonacci.calc(20));
        
        for(int i = 0, j = 10; j >= 0; i++, j--) {
            System.out.print("i = " + i);
            System.out.println(", j = " + j);
        }
    }

}
