package net.godaa.JavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Person {
    public Person() {
        System.out.println("default constructor called");
    }

    public void customInit() {
        System.out.println("custom init method");
    }

    public void customDestroy() {
        System.out.println("custom destroy method");
    }
}
