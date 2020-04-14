package com.cosef.abstractFactory;

public class SporFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new SporCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new RacingMotorCycle();
    }
}
