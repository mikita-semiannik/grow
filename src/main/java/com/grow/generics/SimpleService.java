package com.grow.generics;

public class SimpleService {

    public <T> void printExtends(Entity<? extends T> obj) {
        System.out.println(obj);
    }

    public <T> void printSuper(Entity<? super T> obj) {
        System.out.println(obj);
    }

}
