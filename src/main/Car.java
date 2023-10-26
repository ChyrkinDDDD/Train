package main;

import java.util.Scanner;

public class Car {
    public String nameCar= "Def";
    public String modelCar= "Def";
    public int maxSpeed = 0;

    public Car(){
        InitCar();
    }

    void InitCar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Write car name: ");
        nameCar = in.next();
        System.out.println("Write car model: ");
        modelCar = in.next();
        System.out.println("Write car max speed: ");
        maxSpeed = in.nextInt();
    }

    public void DisplaiInfo(){
        System.out.printf("Car name: %s ; Model: %s ; Max speed: %d ; \n",nameCar,modelCar,maxSpeed);
    }
}
