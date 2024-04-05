package ru.javamentor.javaCodeConfig;

import org.springframework.stereotype.Component;
import ru.javamentor.Pet;

@Component("dogBean")
public class Dog implements Pet {
//    @Autowired
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
