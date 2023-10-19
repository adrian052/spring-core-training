package parkinglot.cars;

import parkinglot.engines.Engine;

public class FordBronco implements Car{
    Engine engine;

    public FordBronco(Engine engine){
        this.engine = engine;
    }

    @Override
    public void startEngine() {
        engine.start();
        System.out.println("Ford Bronco is ready!");
    }
}
