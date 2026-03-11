package com.Bank.Accounts;

import com.Bank.Exceptions.InsufficientBalanceException;

import javax.naming.InsufficientResourcesException;

public class Account {
    protected int accountNumber;
    protected double balance;

    public Account(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount) throws InsufficientResourcesException{
        if(amount>balance){
            throw new InsufficientResourcesException("Insufficient Balance..");
        }
        balance-=amount;
    }
}
