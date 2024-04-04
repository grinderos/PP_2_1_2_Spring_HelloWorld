package ru.javamentor.spring_helloworld;

import org.springframework.beans.factory.support.GenericTypeAwareAutowireCandidateResolver;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Optional;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();

    }
}
