package org.example.iterator_pattern;

import java.util.List;

public class MyIterator<E> implements Iterator<E> {

    private List<E> list;
    private int index;

    public MyIterator(List<E> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()){
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        E obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public E firstElement() {
       return list.get(0);
    }

    @Override
    public E lastElement() {
        return list.get(list.size() - 1);
    }



}
