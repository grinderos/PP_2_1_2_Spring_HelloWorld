package ru.javamentor.spring_helloworld;

public class Dog implements Pet{
    public Dog(){
        System.out.println("Создался бин Собаки");
    }
    public void say(){
        System.out.println("Гав-Гав");
    }
}
