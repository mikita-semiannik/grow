package com.grow.generics.example;

public class AnimalService {

    public <T extends Animals> void commandSay(T animal) {
        animal.say();
    }

}
