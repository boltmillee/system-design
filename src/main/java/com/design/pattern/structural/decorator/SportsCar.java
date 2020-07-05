package com.design.pattern.structural.decorator;

public class SportsCar extends CarDecorator {

    SportsCar(Car c) {
        super(c);
    }

    public void assemble(){
        super.assemble();
        System.out.println("Adding Sports Car Feature");
    }
}
