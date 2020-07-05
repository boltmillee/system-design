package com.system.design.vending.machine;

public enum Item {

    COKE("coke", 25L), PEPSI("pepsi", 20L), NESCAFE("nescafe", 10L);

    private String name;
    private Long price;

    Item(String name, Long price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public Long getPrice(){
        return this.price;
    }
}
