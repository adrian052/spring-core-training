package parkinglot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parkinglot.cars.ChevroletCamaro;
import parkinglot.cars.VolkswagenBeetle;
import parkinglot.engines.FourCylinderEngine;
import parkinglot.engines.V12Engine;
import parkinglot.cars.Car;
import parkinglot.engines.Engine;

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
    public Car wheelsOfDevil() {
        return new ChevroletCamaro();
    }

    @Bean
    public Engine oldSchoolStuff(){
        return new FourCylinderEngine();
    }

    @Bean
    public Car bumblebee(@Qualifier("oldSchoolStuff")Engine engine) {
        return new VolkswagenBeetle(engine);
    }

}