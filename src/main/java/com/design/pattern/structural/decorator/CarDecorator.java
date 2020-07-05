package com.design.pattern.structural.decorator;

public class CarDecorator implements Car {

    Car car;

    CarDecorator( Car c){
        this.car = c;
    }

    public void assemble() {
        car.assemble();
    }
}
