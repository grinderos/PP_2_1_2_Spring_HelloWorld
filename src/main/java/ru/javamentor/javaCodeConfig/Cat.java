package ru.javamentor.javaCodeConfig;

import org.springframework.stereotype.Component;
import ru.javamentor.Pet;

@Component("catBean")
public class Cat implements Pet {

//    @Autowired
    public Cat(){
        System.out.println("Создался бин Кошки");
    }
    @Override
    public void say() {
        System.out.println("Мяу-Мяу");
    }
}
