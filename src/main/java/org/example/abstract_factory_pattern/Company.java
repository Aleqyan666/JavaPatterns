package org.example.abstract_factory_pattern;


public abstract class Company {
    //business logic can be added here
    public abstract Component createComponent(String type);
}
