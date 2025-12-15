package org.prototype.carFactory;

import java.util.HashMap;
import java.util.Map;

public class AssemblyLine {

    private final Map<String, Car> prototypes = new HashMap<>();

    public AssemblyLine() {
        prototypes.put("Truck", new Car("Truck"));
        prototypes.put("Car", new Car("Car"));
        prototypes.put("Minivan", new Car("Minivan"));
    }


    public Car createTruck() {
        return prototypes.get("Truck").clone();
    }

    public Car createPassengerCar() {
        return prototypes.get("Car").clone();
    }

    public Car createMinivan() {
        return prototypes.get("Minivan").clone();
    }
}
