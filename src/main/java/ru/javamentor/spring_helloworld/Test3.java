package ru.javamentor.spring_helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfConstructor.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfSetter.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurName() +"\n"+person.getAge());




        context.close();
    }
}
