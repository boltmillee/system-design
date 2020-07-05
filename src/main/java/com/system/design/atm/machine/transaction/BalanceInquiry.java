package com.system.design.atm.machine.transaction;

public class BalanceInquiry extends Transaction {

    public Double getBalance(){
        //Logic to get balance from ATM goes here
        return new Double(2);
    }
}
