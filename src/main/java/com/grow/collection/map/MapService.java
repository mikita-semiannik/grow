package com.grow.collection.map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class MapService {

    private Map<String, String> hashMap = new HashMap<>();

    public void initMap() {
        hashMap.clear();
        hashMap.put("One", "This is the first item in the map");
        hashMap.put("Two", "This is the second item in the map");
        hashMap.put("Three", "This is the third item in the map");
        hashMap.put("Four", "This is the fourth item in the map");
    }

    public void analize() {
        try {
            for (Field field : hashMap.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                System.out.println(field + " = " + field.get(hashMap));
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + " Val: " + value));
    }

}
