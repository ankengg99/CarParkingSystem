package model;

public abstract class Vehicle {
    String vehicle;
    String numberPlate;
    String color;

    public Vehicle(String vehicle, String numberPlate, String color) {
        this.vehicle = vehicle;
        this.numberPlate = numberPlate;
        this.color = color;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
