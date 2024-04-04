package ru.javamentor.spring_helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfAnnotation.xml");
        System.out.println();

        Cat myCat = context.getBean("catBean", Cat.class);
        myCat.say();
        System.out.println();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        context.close();
    }
}
