package com.Bank.Customers;

import com.Bank.Accounts.Account;

public class customer {

    int customerId;
    String name;
    Account account;

    public customer(int customerId,String name){
        this.customerId = customerId;
        this.name = name;
    }

    public void linkAccount(Account account){
        this.account = account;
    }

    public void displayCustomerDetails(){

        System.out.println("Customer ID: "+customerId);
        System.out.println("Name: "+name);

        if(account!=null){
            System.out.println("Account Linked");
        }

    }

}