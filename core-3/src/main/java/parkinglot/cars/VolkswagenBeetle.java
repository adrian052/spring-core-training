package parkinglot.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import parkinglot.engines.Engine;

@Component("bumblebee")
public class VolkswagenBeetle implements Car {
    private Engine engine;

    @Autowired
    public VolkswagenBeetle(@Qualifier("oldSchoolStuff") Engine engine) {
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Volkswagen Beetle is ready!");
    }
}
