package org.example.lntu;

import org.example.service.AccountServiceImp2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI_2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-config.xml");
        AccountServiceImp2 accountServiceImp2 = ctx.getBean("accountServiceImp2", AccountServiceImp2.class);
        accountServiceImp2.addAccount();
    }
}
