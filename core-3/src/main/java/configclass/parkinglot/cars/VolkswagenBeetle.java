package configclass.parkinglot.cars;

import configclass.parkinglot.engines.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class VolkswagenBeetle implements Car {
    private Engine engine;


    public VolkswagenBeetle(@Qualifier("oldSchoolStuff") Engine engine) {
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Volkswagen Beetle is ready!");
    }
}
