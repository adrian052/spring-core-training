package configclass.parkinglot.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import configclass.parkinglot.engines.Engine;
import org.springframework.stereotype.Component;


public class ChevroletCamaro implements Car {
    Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Chevrolet Camaro is ready!");
    }
}
