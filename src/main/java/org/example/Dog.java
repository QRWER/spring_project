package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
@Scope
public class Dog implements Pet {

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("Gow-Wow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog destroy method");
    }
}
