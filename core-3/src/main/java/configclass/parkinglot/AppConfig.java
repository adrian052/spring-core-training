package configclass.parkinglot;

import configclass.parkinglot.cars.Car;
import configclass.parkinglot.cars.VolkswagenBeetle;
import configclass.parkinglot.engines.Engine;
import configclass.parkinglot.engines.FourCylinderEngine;
import configclass.parkinglot.engines.V12Engine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import configclass.parkinglot.cars.ChevroletCamaro;

@Configuration
public class AppConfig {

    @Bean
    public FreeParkingLot freeParkingLot() {
        return new FreeParkingLot();
    }

    @Bean
    public Engine powerOverwhelmingStuff() {
        return new V12Engine();
    }

    @Bean
    public Car wheelsOfDevil(@Qualifier("powerOverwhelmingStuff")Engine engine) {
        ChevroletCamaro camaro = new ChevroletCamaro();
        camaro.setEngine(engine);
        return camaro;
    }

    @Bean
    public Engine oldSchoolStuff(){
        return new FourCylinderEngine();
    }

    @Bean
    public Car bumblebee(@Qualifier("oldSchoolStuff") Engine engine) {
        return new VolkswagenBeetle(engine);
    }

}