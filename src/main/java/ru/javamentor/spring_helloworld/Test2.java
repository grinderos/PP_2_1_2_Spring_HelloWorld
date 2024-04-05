package ru.javamentor.spring_helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javamentor.Pet;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfConstructor.xml");
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();
        context.close();
    }
}
