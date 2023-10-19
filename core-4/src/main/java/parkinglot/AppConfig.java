package parkinglot;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import parkinglot.cars.*;
import parkinglot.engines.Engine;
import parkinglot.engines.FourCylinderEngine;
import parkinglot.engines.V12Engine;
import parkinglot.engines.V6Engine;

import java.util.Map;

@Configuration
public class AppConfig {
    @Bean
    public FreeParkingLot freeParkingLot(@Autowired Map<String,Car> carMap) {
        return new FreeParkingLot(carMap);
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
    public Car bumblebee(@Qualifier("oldSchoolStuff") Engine engine) {
        return new VolkswagenBeetle(engine);
    }

    //New Beans
    @Bean
    @Primary
    public Engine defaultV6Engine(){
        return new V6Engine();
    }

    @Bean("4X4")
    public Car _4X4(Engine engine){
        return new FordBronco(engine);
    }

    @Bean
    public Car jurassicCar(Engine engine){
        return new FordRaptor(engine);
    }
}