package parkinglot.cars;

import parkinglot.engines.Engine;

public class VolkswagenBeetle implements Car {
    private Engine engine;
    private String oilName;

    public VolkswagenBeetle(Engine engine) {
        this.engine = engine;
    }

    public void setOilName(String oilName) {
        this.oilName = oilName;
    }

    public String getOilName() {
        return oilName;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Volkswagen Beetle is ready!");
    }

    @Override
    public String toString() {
        return "Volkswagen beetle\n oil name: "+getOilName();
    }
}
