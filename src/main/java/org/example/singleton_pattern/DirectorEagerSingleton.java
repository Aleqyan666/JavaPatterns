package org.example.singleton_pattern;

public class DirectorEagerSingleton {

    private static final DirectorEagerSingleton directorEagerSingleton = new DirectorEagerSingleton();

    private DirectorEagerSingleton() {
    }

    public static DirectorEagerSingleton getInstance(){
        return directorEagerSingleton;
    }
}