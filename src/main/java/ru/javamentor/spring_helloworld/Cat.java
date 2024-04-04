package ru.javamentor.spring_helloworld;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    public Cat(){
        System.out.println("Создался бин Кошки");
    }
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }
}
