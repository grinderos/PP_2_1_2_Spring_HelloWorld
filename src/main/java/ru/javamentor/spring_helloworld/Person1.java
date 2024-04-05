package ru.javamentor.spring_helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.javamentor.Pet;

@Component("person1Bean")
public class Person1 {

//    @Autowired
//    @Qualifier("dogBean")
    private Pet pet;

//    @Value("${person1.surName}")
    private String surName;

//    @Value("${person1.age}")
    private int age;

//    public Person1(){
//        System.out.println("Создался бин Персоны (конструктор по умолчанию)");
//    }

    @Autowired
    public Person1(@Qualifier("catBean") Pet pet){
        System.out.println("Создался бин Персоны (конструктор с параметром Pet)");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Привет, мой домашний обитатель!");
        pet.say();
    }
//    @Autowired
    public void setPet(Pet pet){
        System.out.println("метод setPet из класса Person");
        this.pet = pet;
    }

    public void setSurName(String surName){
        System.out.println("Метод setSurName из класса Person");
        this.surName = surName;
    }

    public void setAge(int age){
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

