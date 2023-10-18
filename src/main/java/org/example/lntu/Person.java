package org.example.lntu;

public class Person implements PersonService{
    @Override
    public void say() {
        System.out.println("hello,Spring Framework");
    }
}
