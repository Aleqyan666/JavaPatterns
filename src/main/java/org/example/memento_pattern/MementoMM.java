package org.example.memento_pattern;public interface MementoMM {
    Memento saveToMemento();

    void restoreFromMemento(Memento memento);
}
