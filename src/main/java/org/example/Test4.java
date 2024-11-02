package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = (Dog) context.getBean("myPet");
        Dog yourDog = (Dog) context.getBean("myPet");

        System.out.println(myDog==yourDog);
    }
}
