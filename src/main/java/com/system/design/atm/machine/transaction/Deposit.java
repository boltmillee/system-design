package com.system.design.atm.machine.transaction;

public abstract class Deposit extends Transaction{

    private Double amount;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
