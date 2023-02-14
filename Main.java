package org.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("file:src/main/java/org/main/spring.xml");
//        Vehicle vehicle= (Vehicle)context.getBean("bike");
//        vehicle.drive();

        Car car=(Car) context.getBean("car");
        car.drive();
    }
}
