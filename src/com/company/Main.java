package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        try (Car car = new Car("Lexus ES 200",2021)) {
            car.drive();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
