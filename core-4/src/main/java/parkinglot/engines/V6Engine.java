package parkinglot.engines;

import org.springframework.stereotype.Component;

@Component("defaultV6Engine")
public class V6Engine implements Engine{
    @Override
    public void start() {
        System.out.println("Starting V6 Engine...");
    }
}
