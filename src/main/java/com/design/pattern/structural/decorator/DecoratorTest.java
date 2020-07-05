package com.design.pattern.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        Car car = new LuxuryCar(new SportsCar(new BasicCar()));
       car.assemble();

        Car car2 = new LuxuryCar(new BasicCar());
        car2.assemble();
    }
}
