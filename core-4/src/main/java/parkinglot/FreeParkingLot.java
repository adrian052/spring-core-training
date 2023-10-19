package parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import parkinglot.cars.Car;

import java.util.List;
import java.util.Map;

public class FreeParkingLot implements ParkingLot {

    Map<String,Car> cars;


    public FreeParkingLot(Map<String,Car> cars){
        this.cars = cars;
    }

    @Override
    public void printCarsCount() {
        System.out.println("Car quantity: "+ cars.size());
    }

    public void printCarNames() {
        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            String carName = entry.getKey();
            System.out.println("Bean name: " + carName);
        }
    }
}
