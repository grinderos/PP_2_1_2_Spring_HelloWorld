package ru.javamentor.spring_helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextOfSetter.xml");
        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        System.out.println(myDog == yourDog);

        DogWithState myPetWithState_singleton = context.getBean("myPetWithState_singleton", DogWithState.class);
        DogWithState yourPetWithState_singleton = context.getBean("myPetWithState_singleton", DogWithState.class);
        myPetWithState_singleton.setName("Belka");
        yourPetWithState_singleton.setName("Strelka");

        System.out.println(myPetWithState_singleton.getName() + "\n" + yourPetWithState_singleton.getName() + "\n");

        DogWithState myPetWithState_prototype = context.getBean("myPetWithState_prototype", DogWithState.class);
        DogWithState yourPetWithState_prototype = context.getBean("myPetWithState_prototype", DogWithState.class);
        myPetWithState_prototype.setName("Belka");
        yourPetWithState_prototype.setName("Strelka");

        System.out.println(myPetWithState_prototype.getName() + "\n" + yourPetWithState_prototype.getName() + "\n");

        context.close();


    }
}
