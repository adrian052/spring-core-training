package parkinglot.beans;


import org.springframework.stereotype.Component;
import parkinglot.Car;
import parkinglot.Engine;

@Component("Bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;
    public VolkswagenBeetle(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Volkswagen Beetle is ready!");
    }
}
