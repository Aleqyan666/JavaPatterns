package org.example;

public class DirectorEagerSingleton {

    private static DirectorEagerSingleton directorEagerSingleton = new DirectorEagerSingleton();

    public DirectorEagerSingleton() {
    }

    public static DirectorEagerSingleton getInstance(){
        return directorEagerSingleton;
    }
}
