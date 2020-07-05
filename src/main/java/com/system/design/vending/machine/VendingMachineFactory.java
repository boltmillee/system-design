package com.system.design.vending.machine;

public class VendingMachineFactory {

    public static VendingMachine createVendingMachine(){
        return new VendingMachineImpl();
    }
}
