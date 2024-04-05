package ru.javamentor.javaCodeConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javamentor.spring_helloworld.Person;

public class TestAppConfig {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfAnnotation.xml");
        System.out.println();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurName());
        System.out.println(person.getAge());

        System.out.println("___________________\n");
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(ru.javamentor.spring_helloworld.MyConfig.class);
        ApplicationContext context1 = new AnnotationConfigApplicationContext(ru.javamentor.javaCodeConfig.MyConfig.class);
        Person1 person1 = context1.getBean("person1Bean", Person1.class);
        person1.callYourPet();

    }
}
