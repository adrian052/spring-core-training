package scanning.parkinglot.engines;

import org.springframework.stereotype.Component;


@Component("oldSchoolStuff")
public class FourCylinderEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting Four-Cylinder Engine...");
    }
}
