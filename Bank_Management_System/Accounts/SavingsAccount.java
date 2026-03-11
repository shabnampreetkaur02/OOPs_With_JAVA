package com.Bank.Accounts;

public class SavingsAccount extends Account {
    double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }

    public double calculateInterest(){
        return balance*interestRate/100;
    }
}


