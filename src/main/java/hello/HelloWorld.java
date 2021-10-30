package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime time = new LocalTime();
        System.out.println("the current time is  "+ time);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
}
