package com.company;

import java.util.HashMap;

public class Rental {

    private HashMap<String,Car> cars = new HashMap<>();

    public void addCar(Car car) {
        cars.put(car.getId(), car);
    }
}
