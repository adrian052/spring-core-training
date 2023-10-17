package parkinglot.beans;

import parkinglot.Car;
import parkinglot.Engine;

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
