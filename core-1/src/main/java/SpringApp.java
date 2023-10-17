// TODO create spring application context with two beans
// 1. FourCylinderEngine engine with name "oldSchoolStuff"
// 2. VolkswagenBeetle car with name "Bumblebee", that contains the type of engine above.
// Wire it, using wiring feature through a constructor.
// 3. Take all beans and print their names.
// 3a. REQUIRED CONDITION - Use component scanning while loading the context

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import parkinglot.Car;
import parkinglot.Engine;

public class SpringApp {

    public static void main(String[] args) {
        // initiate application context there
        ApplicationContext context = new AnnotationConfigApplicationContext("parkinglot/beans");
        //print all created bean names
        printNames(context);
        //start engine
        context.getBeansOfType(Car.class).forEach((s, car) -> car.startEngine());
    }

    private static void printNames(ApplicationContext context){
        String [] carNames = context.getBeanNamesForType(Car.class);
        String [] engineNames = context.getBeanNamesForType(Engine.class);
        System.out.println("Car Bean Names:");
        for (String carName : carNames) {
            System.out.println(carName);
        }
        System.out.println("Engine Bean Names:");
        for (String engineName : engineNames) {
            System.out.println(engineName);
        }
        System.out.println();
    }
}
