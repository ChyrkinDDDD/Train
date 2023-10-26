package main;

public class CarShowroom {
    Car[] cars;

    public CarShowroom(int length){
        cars = new Car[length];

        for(int i = 0;i < length;i++){
            cars[i] = new Car();
        }
    }

    public void ShowCars(){
        for(Car car: cars){
            car.DisplaiInfo();
        }
    }
}
