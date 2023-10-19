package scanning.parkinglot.engines;

import org.springframework.stereotype.Component;

@Component("powerOverwhelmingStuff")
public class V12Engine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting V12 Engine...");
    }
}
