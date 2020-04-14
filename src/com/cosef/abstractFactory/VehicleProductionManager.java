package com.cosef.abstractFactory;

public class VehicleProductionManager {
    private Car car;
    private Motorcycle motorcycle;

    public VehicleProductionManager(VehicleFactory vehicleFactory) {
        this.car = vehicleFactory.createCar();
        this.motorcycle = vehicleFactory.createMotorcycle();
    }

    public void choose(){
        this.car.drive();
        this.motorcycle.ride();
    }

}
