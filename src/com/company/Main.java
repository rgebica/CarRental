package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rental rental = new Rental();

        String id = getParamter("id");
        String brand = getParamter("brand");
        String model = getParamter("model");
        String year = getParamter("year");

        Car car = new Car(id, brand, model, Integer.valueOf(year));

        System.out.println(car);

        rental.addCar(car);
    }
        private static String getParamter(String parameterName) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Wpisz: " + paramterName + ":");
            String value = scanner.nextLine();
            System.out.println("Paramter's name: " + paramterName + "value: " + value);
    }
}
