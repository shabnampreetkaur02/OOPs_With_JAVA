package com.Bank;

import com.Bank.Accounts.*;
import com.Bank.Customers.customer;
import com.Bank.Loans.loan;
import com.Bank.Exceptions.*;
import static com.Bank.Util.BankUtil.*;

public class Main {

    public static void main(String[] args) {

        try{

            int accNo = generateAccountNumber();

            SavingsAccount sa = new SavingsAccount(accNo,5000,5);

            customer c = new customer(1,"Shabnam");

            c.linkAccount(sa);

            sa.deposit(2000);

            sa.withdraw(1000);

            double interest = sa.calculateInterest();

            loan loan = new loan(100000,5,2);

            double emi = loan.calculateEMI();

            c.displayCustomerDetails();

            System.out.println("Interest: "+interest);
            System.out.println("EMI: "+emi);

        }
        catch(Exception e){

            System.out.println(e.getMessage());

        }

    }

}