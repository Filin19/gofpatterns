package org.prototype.client;

import org.prototype.carFactory.AssemblyLine;
import org.prototype.carFactory.Car;

public class CarDealership {

    private final AssemblyLine assemblyLine;

    public CarDealership(AssemblyLine assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public Car buyACar(String color, String number) {
        Car car = assemblyLine.createPassengerCar();
        car.setColor(color);
        car.setNumber(number);
        return car;
    }

    public Car buyATruck(String color, String number) {
        Car truck = assemblyLine.createTruck();
        truck.setColor(color);
        truck.setNumber(number);
        return truck;
    }

    public Car buyAMinivan(String color, String number) {
        Car minivan = assemblyLine.createMinivan();
        minivan.setColor(color);
        minivan.setNumber(number);
        return minivan;
    }
}
