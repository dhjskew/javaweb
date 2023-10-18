package org.example.service;

public class AccountServiceImp implements AccountService {
    AccountService accountService;


    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public void addAccount() {
        System.out.println("this is AccountServiceImp.class");
    }
}
