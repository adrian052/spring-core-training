package parkinglot.cars;

import parkinglot.engines.Engine;

public class ChevroletCamaro implements Car {
    private Engine engine;
    private int maxSpeed;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Chevrolet Camaro is ready!");
    }

    @Override
    public String toString() {
        return "Chevrolet camaro\n max speed: "+getMaxSpeed();
    }
}
