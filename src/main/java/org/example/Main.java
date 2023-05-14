package org.example;

import org.example.singleton_pattern.DirectorEagerSingleton;
import org.example.singleton_pattern.DirectorLazySingleton;

public class Main {
    public static void main(String[] args) {

        DirectorLazySingleton directorLazySingleton1 = DirectorLazySingleton.getInstance();
        DirectorLazySingleton directorLazySingleton2 = DirectorLazySingleton.getInstance();
        DirectorEagerSingleton directorEagerSingleton1 = DirectorEagerSingleton.getInstance();
        DirectorEagerSingleton directorEagerSingleton2 = DirectorEagerSingleton.getInstance();

        System.out.println(directorLazySingleton1 == directorLazySingleton2);
        System.out.println(directorEagerSingleton1 == directorEagerSingleton2);

        Integer f1 = 8;
        Integer f2 = 6;
    }
}