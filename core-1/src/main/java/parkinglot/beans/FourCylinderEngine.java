package parkinglot.beans;
import org.springframework.stereotype.Component;
import parkinglot.Engine;

@Component("oldSchoolStuff")
public class FourCylinderEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting Four-Cylinder Engine...");
    }
}
