package com.system.design.vending.machine;

import java.util.Arrays;

public class Bucket<X, Y> {

    private X first;

    private Y second;

    Bucket(X f, Y s){
        this.first = f;
        this.second = s;
    }

    public X getFirst(){
        return first;
    }

    public Y getSecond(){
        return second;
    }


}
