package com.grow.abstractclass;

public class Main implements Runnable{

    public static void main(String[] args) {
        (new Main()).run();
    }

    @Override
    public void run() {
        Figure circle = new Circle(0, 0, 5);
        Figure rectangle = new Rectangle(0, 0, 4, 5);

        System.out.println("P(circle) = " + circle.getPerimeter());
        System.out.println("S(circle) = " + circle.getAria());
        System.out.println("P(rectangle) = " + rectangle.getPerimeter());
        System.out.println("S(rectangle) = " + rectangle.getAria());
        
        System.out.println(CustomType.values()[1]);
        System.out.println(CustomType.TWO.getDigit());


        Integer[] array1 [] = {{1, 2}, {3, 4}, {5, 6}};
        Integer[][] array2  = {{1, 2}, {3, 4}, {5, 6}};
        Integer array3 [][] = {{1, 2}, {3, 4}, {5, 6}};
    }

}
