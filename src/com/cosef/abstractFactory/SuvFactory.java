package com.cosef.abstractFactory;

public class SuvFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new SuvCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new CrossMotorcycle();
    }
}
