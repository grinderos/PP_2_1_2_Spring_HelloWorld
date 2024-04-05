package ru.javamentor.spring_helloworld;

import ru.javamentor.Pet;

public class DogWithState implements Pet {
    private String name;
    public DogWithState(){
        System.out.println("Создался бин DogWithState");
    }
    public void say(){
        System.out.println("Гав-Гав");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
