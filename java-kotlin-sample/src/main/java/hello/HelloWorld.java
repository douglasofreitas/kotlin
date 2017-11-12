package hello;

import org.joda.time.LocalTime;

import hello.Greeter;
import hello.GreeterK;

public class HelloWorld {
	public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        GreeterK greeterk = new GreeterK();
        System.out.println(greeterk.sayHello());
    }
}