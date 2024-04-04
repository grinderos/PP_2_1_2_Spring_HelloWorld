package ru.javamentor.spring_helloworld;

public class Test1 {
    public static void main(String[] args) {
        Pet petDog = new Dog();
        petDog.say();
        Pet petCat = new Cat();
        petCat.say();
    }
}
