package com.grow.collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.StreamSupport;

public class CollectionMain {

    public static void main(String[] args) {
        new CollectionMain();
    }

    /**
     * Runner.
     */
    private CollectionMain() {
        CustomList<Integer> customList = new CustomList<>();
        for(int i = 1; i <= 10; i++) {
            customList.add(i);
        }
        Iterator iterator = customList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for(Integer item: customList) {
            System.out.print(item + " ");
        }

        Spliterator<Integer> spliterator = customList.spliterator();
        while(spliterator.tryAdvance((item) -> {
            item = 0;
        }));

        StreamSupport.stream(spliterator, true)
                .forEachOrdered(System.out::print);
    }

}
