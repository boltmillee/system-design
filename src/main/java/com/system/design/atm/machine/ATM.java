package com.system.design.atm.machine;

import com.system.design.atm.machine.components.CashDispenser;
import com.system.design.atm.machine.components.KeyPad;
import com.system.design.atm.machine.components.Printer;
import com.system.design.atm.machine.components.Screen;
import com.system.design.atm.machine.user.Address;

public class ATM {

    private String atmId;

    private Address location;

    private Screen screen;

    private KeyPad keyPad;

    private Printer printer;

    private CashDispenser dispenser;

    public boolean canDispenseCash(){
        //logic to check if it is possible to dispense cash goes here

        return true;
    }

    public boolean dispense(Double amount){
        return true;
    }

}
