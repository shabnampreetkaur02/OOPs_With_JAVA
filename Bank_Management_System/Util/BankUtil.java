package com.Bank.Util;

public class BankUtil {

    static int acc = 1000;

    public static int generateAccountNumber(){
        return acc++;
    }

    public static void validateMinimumBalance(double balance) throws Exception {

        if(balance < 1000){
            throw new Exception("Minimum balance should be ₹1000");
        }

    }
}