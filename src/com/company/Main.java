package com.company;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rental rental = new Rental();
        System.out.println("Car Rental");
        System.out.println("Available operations: add car, show cars");

        String operation = "";

        do {
            operation = getParamter("operation");
            switch (operation) {
                case "add car":
                    addCarToRental(rental);
                    break;
                case "show cars":
                    rental.showCars();
                    break;
                case "rent":
                    String id = getParamter("id");
                    rental.rent(id);
                    break;
                case "return":
                    id = getParamter("id");
                    getParamter("id");
                    rental.endRent(id);
                    break;
                case "available cars":
                    rental.availableCars();
                    break;
                case "amount available cars":
                    rental.amountAvailableCars();
                    break;
            }
        } while (!"close".equalsIgnoreCase(operation));
    }

    private static void addCarToRental(Rental rental) {
        String id = getParamter("id");
        String brand = getParamter("brand");
        String model = getParamter("model");
        String year = getParamter("year");
        Car car = new Car(id, brand, model, Integer.valueOf(year));
        rental.addCar(car);
    }

    private static String getParamter(String parameterName) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert " + parameterName + ":");
            String value = scanner.nextLine();
            System.out.println("Paramter's name: " + parameterName + " value: " + value);
            return value;
    }
}
