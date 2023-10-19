// TODO
// 1. Copy all files from previous project.
// 2. There is context.properties file in the resources folder
// 3. Find a way to import all properties to the context.
// 4. Using @Value annotation, inject quantity of cylinders into V6Engine bean.
// 5. Using @Value annotation, inject oil name in the VolkswagenBeetle bean.
// 6. Using @Value annotation, inject max speed number into ChevroletCamaro bean with 300 as a default value.
// 7. Override toString method of those beans and print these injected properties after loading the context.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import parkinglot.AppConfig;
import parkinglot.cars.ChevroletCamaro;
import parkinglot.cars.VolkswagenBeetle;
import parkinglot.engines.V6Engine;

public class SpringApp {
    public static void main(String[] args) {
        //initialize application context there
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        // print injected properties there
        System.out.println(context.getBean("defaultV6Engine", V6Engine.class));
        System.out.println(context.getBean("bumblebee", VolkswagenBeetle.class));
        System.out.println(context.getBean("wheelsOfDevil", ChevroletCamaro.class));
    }
}
