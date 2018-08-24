package com.grow.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CustomList<T> extends ArrayList<T> {

    /**
     * Return iterator instance.
     *
     * @return the iterator instance
     */
    @Override
    public Iterator<T> iterator() {
        return new ListItr();
    }

    @Override
    public Spliterator<T> spliterator() {
        return new ListSpl<>(this);
    }

    /**
     * Simple iterator.
     */
    private class ListItr implements Iterator<T> {

        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size();
        }

        @Override
        public T next() {
            if (cursor < size()) {
                T item = get(cursor);
                cursor += 2;
                return item;
            } else {
                return null;
            }
        }
    }

    private class ListSpl<T> implements Spliterator<T> {

        private final ArrayList<T> list;
        private int current = 0;
        private int last = size() - 1;

        ListSpl(ArrayList<T> list) {
            this.list = list;
        }

        @Override
        public boolean tryAdvance(Consumer<? super T> action) {
            if(current <= last) {
                T elem = list.get(current);

                action.accept(elem);
                current++;
                return true;
            }
            return false;
        }

        @Override
        public Spliterator<T> trySplit() {
            return null;
        }

        @Override
        public long estimateSize() {
            return last - current;
        }

        @Override
        public int characteristics() {
            return ORDERED | IMMUTABLE | NONNULL;
        }
    }
}
