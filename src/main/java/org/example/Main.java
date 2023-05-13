package org.example;

public class Main {
    public static void main(String[] args) {

        DirectorLazySingleton directorLazySingleton1 = DirectorLazySingleton.getInstance();
        DirectorLazySingleton directorLazySingleton2 = DirectorLazySingleton.getInstance();
        DirectorEagerSingleton directorEagerSingleton1 = DirectorEagerSingleton.getInstance();
        DirectorEagerSingleton directorEagerSingleton2 = DirectorEagerSingleton.getInstance();

        System.out.println(directorLazySingleton1 == directorLazySingleton2);
        System.out.println(directorEagerSingleton1 == directorEagerSingleton2);
    }
}