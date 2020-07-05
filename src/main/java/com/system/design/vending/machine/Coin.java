package com.system.design.vending.machine;

public enum Coin {

    ONE(1L), FIVE(5L), TEN(10L);

    private Long value;

    Coin(Long value){
        this.value = value;
    }

    public Long getValue(){
        return this.value;
    }
}
