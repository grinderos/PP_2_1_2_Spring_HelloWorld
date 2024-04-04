package ru.javamentor.spring_helloworld;

public class Cat implements Pet{

    public Cat(){
        System.out.println("Создался бин Кошки");
    }
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }
}
