package com.grow.corebasicconcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        
        // interesting feature
        Map<String, String> map = new HashMap<String, String>() {{
            put("key1", "Value1");
            put("key2", "Value1");
            put("key3", "Value1");
        }};
        
        List<String> названиеСписка = new ArrayList<>();
        названиеСписка.add("value1");
        System.out.println(названиеСписка);
    }

}
