package org.example.singleton_pattern;

public class DirectorLazySingleton {


    private static DirectorLazySingleton directorLazySingleton;

    private DirectorLazySingleton() {
    }

    public static DirectorLazySingleton getInstance(){
        if (directorLazySingleton == null){
            return directorLazySingleton = new DirectorLazySingleton();
        }else{
            return directorLazySingleton;
        }
    }
}
