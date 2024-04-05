package ru.javamentor.spring_helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javamentor.javaCodeConfig.Person1;

public class Test6 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfAnnotation.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        context.close();
        System.out.println("___________________\n");
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(ru.javamentor.javaCodeConfig.MyConfig.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ru.javamentor.spring_helloworld.MyConfig.class);
        Person1 person1 = context1.getBean("person1Bean", Person1.class);
        person1.callYourPet();

    }
}
