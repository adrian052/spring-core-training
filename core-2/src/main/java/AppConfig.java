import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parkinglot.Car;
import parkinglot.Engine;
import parkinglot.beans.ChevroletCamaro;
import parkinglot.beans.V12Engine;

@Configuration
public class AppConfig {

    @Bean
    public Engine powerOverwhelmingStuff() {
        return new V12Engine();
    }

    @Bean
    public Car wheelsOfDevil() {
        //Here I am using the implementation to declare wheelsOfDevilCar because
        //the interface does not have the setEngine method.
        //We could also declare the dependencies in the interface, adding the setEngine method.
        ChevroletCamaro wheelsOfDevil = new ChevroletCamaro();
        wheelsOfDevil.setEngine(powerOverwhelmingStuff());
        return wheelsOfDevil;
    }
}