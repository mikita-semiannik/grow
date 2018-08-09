package com.grow.generics;

import com.grow.generics.example.AnimalService;
import com.grow.generics.example.Cat;
import com.grow.generics.example.Dog;
import com.grow.generics.example.Fish;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    /**
     * Object
     * |-ClassB
     * |--ClassA
     * |---ClassC
     *
     * Object
     * |-ClassB
     * |--ClassA (extends (possible options *))
     * |---ClassC *
     *
     * Object     *
     * |-ClassB   *
     * |--ClassA (super (possible options *))
     * |---ClassC
     */
    private Main() {
        SimpleService simpleService = new SimpleService();
        Entity<ClassA> classA = new Entity<>();
        Entity<ClassB> classB = new Entity<>();
        Entity<ClassC> classC = new Entity<>();
        // We can see, if ? extends SomeClass,
        // we should pass to param only class instance that is higher in the hierarchy
        simpleService.<ClassA>printExtends(classC);
        // We can see, if ? super SomeClass,
        // we should pass to param only class instance is lower in the hierarchy
        simpleService.<ClassA>printSuper(classB);
        simpleService.<ClassA>printSuper(new Entity<Object>());

        //Example
        AnimalService animalService = new AnimalService();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        animalService.commandSay(cat);
        animalService.commandSay(dog);
        //animalService.commandSay(fish); not possible, because Fish class not implement interface Animals
    }
}
