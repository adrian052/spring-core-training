package parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import parkinglot.cars.Car;

import java.util.List;

@Component("freeParkingLot")
public class FreeParkingLot implements ParkingLot {

    @Autowired
    List<Car> carList;

    @Override
    public void printCarsCount() {
        System.out.println("Car quantity: "+ carList.size());
    }
}
