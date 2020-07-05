package com.system.design.atm.machine.user;

import com.system.design.atm.machine.enums.CustomerStatus;

public class Customer {

    private String name;

    private String email;

    private String phone;

    private CustomerStatus status;

    private Address address;

    private Card cardDetails;

    private Account userAccount;
}
