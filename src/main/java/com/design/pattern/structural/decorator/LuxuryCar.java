package com.design.pattern.structural.decorator;

public class LuxuryCar extends CarDecorator {
    LuxuryCar(Car c) {
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding luxury car feature");
    }
}
