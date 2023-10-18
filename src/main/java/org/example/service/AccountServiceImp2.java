package org.example.service;

import org.example.dao.AccountDao;

public class AccountServiceImp2 implements AccountService{
    AccountDao accountDao;
    public AccountServiceImp2() {

    }

    @Override
    public void addAccount() {
        System.out.println("this is AccountServiceImp2.class");
    }
}
