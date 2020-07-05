package com.system.design.atm.machine.transaction;

import com.system.design.atm.machine.enums.TransactionStatus;

import java.util.Date;

public abstract class Transaction {

    private int transactionId;

    private Date createdAt;

    private Date updatedAt;

    private TransactionStatus status;

    public void performTransaction(){
        //initiate txn logic goes here
    }
}
