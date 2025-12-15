package org.prototype.carFactory;

public class Car {

    private final String type;
    private String color;
    private String number;

    public Car(String type) {
        this.type = type;
    }

    public Car(Car car) {
        this.type = car.type;
        this.color = car.color;
        this.number = car.number;
    }

    @Override
    protected Car clone() {
        return new Car(this);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }
}
