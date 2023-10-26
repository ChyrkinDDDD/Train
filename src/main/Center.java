package main;

import java.util.Scanner;

public class Center {
    static public void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Write count your car/s: ");
        CarShowroom cars = new CarShowroom(in.nextByte());

        cars.ShowCars();
    }
}
