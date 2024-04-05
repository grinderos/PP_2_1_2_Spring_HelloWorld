package ru.javamentor.javaCodeConfig2;

import org.springframework.beans.factory.annotation.Value;
import ru.javamentor.Pet;

public class Person2 {

    private Pet pet;
    @Value("${person.surName}")
    private String surName;
    @Value("${person.age}")
    private int age;

//    public Person2(){
//        System.out.println("Создался бин Персоны (конструктор по умолчанию)");
//    }

    public Person2(Pet pet) {
        System.out.println("Создался бин Персоны (конструктор с параметром Pet)");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Привет, мой домашний обитатель!");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("метод setPet из класса Person");
        this.pet = pet;
    }

    public void setSurName(String surName) {
        System.out.println("Метод setSurName из класса Person");
        this.surName = surName;
    }

    public void setAge(int age) {
        System.out.println("Метод setAge из класса Person");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }
}

