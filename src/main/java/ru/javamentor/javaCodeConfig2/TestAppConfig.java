package ru.javamentor.javaCodeConfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javamentor.Pet;
import ru.javamentor.spring_helloworld.Person;

public class TestAppConfig {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Pet cat = context.getBean("catBean", Pet.class);
//        Pet cat1 = context.getBean("catBean", Pet.class);
        Person2 person2 = context.getBean("personBean", Person2.class);
        person2.callYourPet();
        System.out.println(person2.getSurName());
        System.out.println(person2.getAge());

    }
}
