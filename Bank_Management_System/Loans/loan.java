package com.Bank.Loans;

public class loan {

    double loanAmount;
    double interestRate;
    int tenure;

    public loan(double loanAmount,double interestRate,int tenure){

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    public double calculateEMI(){

        return (loanAmount * interestRate * tenure) / 100;

    }

}