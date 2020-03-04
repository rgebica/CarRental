package com.company;

import java.util.HashMap;

public class Rental {

    private HashMap<String,Car> cars = new HashMap<>();

    public void addCar(Car car) {
        cars.put(car.getId(), car);
    }

    public void showCars() {
        for (Car cars : cars.values()) {
            System.out.println("Available: " + cars);
        }
    }

    public void rent(String id) {
        cars.get(id).setRented(true);
        System.out.println("Car with id: " + id + "is not available at the moment");
    }

    public void endRent(String id) {
        cars.get(id).setRented(false);
    }

    public void availableCars() {
        System.out.println("Available Cars");
        for (Car car : cars.values()) {
            if (!car.isRented()) {
                System.out.println(car);
            }
        }
    }

    public void amountAvailableCars() {
        long amountAvailableCars =
                cars.values().stream().filter(car -> !car.isRented()).count();
        System.out.println("Amount of available cars: " + amountAvailableCars);
    }

}
