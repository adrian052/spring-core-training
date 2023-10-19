package configclass.parkinglot;

import configclass.parkinglot.cars.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class FreeParkingLot implements ParkingLot {
    @Autowired
    List<Car> carList;

    @Override
    public void printCarsCount() {
        System.out.println("Car quantity: "+ carList.size());
    }
}
