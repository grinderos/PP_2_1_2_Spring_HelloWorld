package ru.javamentor.spring_helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet {
    public Dog() {
        System.out.println("Создался бин Dog");
    }

    public void say() {
        System.out.println("Гав-Гав");
    }

    private void init() {
        System.out.println("Инит-метод класса Dog");
    }

    private void destroy() {
        System.out.println("Дестрой-метод класса Dog");
    }
}
