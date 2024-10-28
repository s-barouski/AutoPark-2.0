package main.java.org.vederko.model;


public class Autopark {

    private String name;
    private Car[] cars;
    private Driver[] drivers;
    Autopark autoparkVederko = new Autopark();
    Passenger newAuto = new Passenger();

public int getAuto(){
    int freeIndex = autoparkVederko.getFreeIndexCar();
    autoparkVederko.getCars()[freeIndex] = newAuto;
    return freeIndex;
}

    public int getFreeIndexCar() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public int getFreeIndexDriver() {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i] == null) {
                return i;
            }
        }
        return -1;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }
}
