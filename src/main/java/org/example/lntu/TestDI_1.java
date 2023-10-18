package org.example.lntu;

import org.example.service.AccountServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDI_1 {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("application-config.xml");
        AccountServiceImp accountServiceImp = ctx.getBean("accountServiceImp", AccountServiceImp.class);
        accountServiceImp.addAccount();
    }
}
