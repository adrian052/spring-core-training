// TODO
// 1. Copy all created beans into this module and create two contexts
// 1a. The first context should be loaded with scanning feature and contain 4 beans (2 cars, 2 engines)
// 1b. The second context should be loaded with configuration class and contain 4 beans (2 cars, 2 engines).
// REQUIRED CONDITION. Configuration context should not use direct method calls for bean wiring.
// 2. Create FreeParkingLot bean for every context and collect all available car beans inside with list. Use field wiring feature this time, if possible.
// 3. ParkingLot should print QUANTITY of Car beans inside.
// 4. Create application context an print all bean names once again.

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import parkinglot.AppConfig;
import parkinglot.FreeParkingLot;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext context1 = new AnnotationConfigApplicationContext("parkinglot");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(AppConfig.class);

        //print quantity
        FreeParkingLot firstParkingLot = context1.getBean(FreeParkingLot.class);
        FreeParkingLot secondParkingLot = context2.getBean(FreeParkingLot.class);
        System.out.println("Car quantity context 1:");
        firstParkingLot.printCarsCount();
        System.out.println("Car quantity context 2:");
        secondParkingLot.printCarsCount();

        //print all beans
        System.out.println("\nBeans Context1:");
        String [] names1 = context1.getBeanDefinitionNames();
        for(String name: names1){
            System.out.println(name);
        }

        System.out.println("\nBeans Context2:");
        String [] names2 = context2.getBeanDefinitionNames();
        for(String name: names2){
            System.out.println(name);
        }

    }
}
