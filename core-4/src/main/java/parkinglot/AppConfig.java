package parkinglot;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parkinglot.cars.*;
import parkinglot.engines.Engine;
import parkinglot.engines.FourCylinderEngine;
import parkinglot.engines.V12Engine;
import parkinglot.engines.V6Engine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;
import static org.springframework.aop.interceptor.ExposeBeanNameAdvisors.getBeanName;

@Configuration
public class AppConfig {
    @Autowired
    Map<String,Car> carMap;
    @Bean
    public FreeParkingLot freeParkingLot() {
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
    public Engine defaultV6Engine(){
        return new V6Engine();
    }

    @Bean("4X4")
    public Car _4X4(){
        return new FordBronco(defaultV6Engine());
    }

    @Bean
    public Car jurassicCar(){
        return new FordRaptor(defaultV6Engine());
    }
}