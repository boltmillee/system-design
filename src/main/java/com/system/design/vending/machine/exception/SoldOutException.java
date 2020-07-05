package com.system.design.vending.machine.exception;

public class SoldOutException extends RuntimeException {

    String message;

    public SoldOutException(String message){
        this.message = message;
    }
}
