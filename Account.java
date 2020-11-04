package com.strathextra1;

public class Account {

    double balance = 0;
    double amount = 0;

    public void getbalance(){
        System.out.println(balance);
    }

    public void withdraw(double withdrawn_amount){
        System.out.println("You have withdrawn the following amount: " + withdrawn_amount);
        amount -= withdrawn_amount;
        balance =amount;
                System.out.println("Balance left: " + balance);
    }

    public void deposit(double deposited_amount){
        System.out.println("You have deposited the following amount: " + deposited_amount);
        amount += deposited_amount;
        balance =amount;
        System.out.println("Balance left: " + balance);
    }
}
