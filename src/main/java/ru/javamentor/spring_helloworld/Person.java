package ru.javamentor.spring_helloworld;

import java.sql.SQLOutput;

public class Person {
    private Pet pet;
    public Person(Pet pet){
        System.out.println("Создался бин Персоны");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Привет, мой домашний обитатель!");
        pet.say();
    }
}
