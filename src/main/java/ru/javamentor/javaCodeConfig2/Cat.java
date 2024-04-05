package ru.javamentor.javaCodeConfig2;

import org.springframework.stereotype.Component;
import ru.javamentor.Pet;

public class Cat implements Pet {

    public Cat(){
        System.out.println("Создался бин Кошки");
    }
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }
}
