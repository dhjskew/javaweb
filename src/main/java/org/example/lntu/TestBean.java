package org.example.lntu;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("application-config.xml");
        Person p=ctx.getBean("person",Person.class);
        p.say();
    }
}
