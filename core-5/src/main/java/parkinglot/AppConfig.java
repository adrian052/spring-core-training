package parkinglot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import parkinglot.cars.*;
import parkinglot.engines.Engine;
import parkinglot.engines.FourCylinderEngine;
import parkinglot.engines.V12Engine;
import parkinglot.engines.V6Engine;

import java.util.Map;

@Configuration
@PropertySource("context.properties")
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
    public Car wheelsOfDevil(@Value("${chevrolet.maxSpeed:300}") int maxSpeed) {
        ChevroletCamaro camaro = new ChevroletCamaro();
        camaro.setMaxSpeed(maxSpeed);
        return camaro;
    }

    @Bean
    public Engine oldSchoolStuff(){
        return new FourCylinderEngine();
    }

    @Bean
    public Car bumblebee(@Qualifier("oldSchoolStuff") Engine engine, @Value("${volkswagen.oil}")String oilName) {
        VolkswagenBeetle beetle = new VolkswagenBeetle(engine);
        beetle.setOilName(oilName);
        return beetle;
    }

    @Bean
    @Primary
    public Engine defaultV6Engine(@Value("${ford.engine.cylinders}") int cylindersQuantity){
        V6Engine v6Engine =  new V6Engine();
        v6Engine.setCylindersQuantity(cylindersQuantity);
        return v6Engine;
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