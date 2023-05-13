package org.example.iterator_pattern;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    E firstElement();
    E lastElement();
}
