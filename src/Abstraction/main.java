package Abstraction;

// Abstract class
abstract class Car {

    // Abstract method (implementation nahi di)
    abstract void startEngine();
}

// Child class implementation provide karegi
class BMW extends Car {

    @Override
    void startEngine() {

        // Internal implementation
        System.out.println("Checking Battery...");
        System.out.println("Injecting Fuel...");
        System.out.println("Starting Engine...");
    }
}
abstract class Bird { // yaha pe class ka structure banayega bs
    abstract void fly();// declared here

    abstract void eat();
    abstract void sleep();
}

class sparrow extends Bird { // yaha pe un functions ko implement krega override krke

    @Override
    void fly() {
        System.out.println("sparrow is flying");
    }

    @Override
    void eat() {
        System.out.println("sparrow is eating");
    }
    void sleep() {
        System.out.println("sleeping");
    }
}

class crow extends Bird { // yaha pe un functions ko implement krega override krke

    @Override
    void fly() {
        System.out.println("crow is flying");
    }

    @Override
    void eat() {
        System.out.println("crow is eating");
    }
    void sleep() {
        System.out.println("sleeping");
    }
}

public class main {
    public static void main(String[] args) {

        //Abstraction is the process of hiding the implementation details and showing only functionality to the user.
        //In Java, abstraction is achieved using abstract classes and interfaces.

        //Abstract class: An abstract class is a class that cannot be instantiated and is declared using the abstract keyword.
        //--It can have abstract methods (methods without a body) as well as concrete methods (methods with a body).
        //Interface: An interface is a reference type in Java that is similar to a class and is a collection of abstract methods.
        //--A class implements an interface, thereby inheriting the abstract methods of the interface.

        //BMW car = new BMW();

        // User sirf method call karta hai
        //car.startEngine();

        // User ko andar kya process ho raha hai
        // uski details pata hone ki zarurat nahi.

        //Abstraction using classes - access specifiers

        //Abstract class - a class whose object can not be created and is designed to be subclassed, serves as a superclass for other classes to extend and implement its abstract methods, providing a blueprint for derived classes to follow.
        // acts as a template for subclasses

        Bird b= new sparrow();
        b.eat();
        b.fly();
        b.sleep();

        b = new crow();
        b.eat();
        b.fly();
        b.sleep();
    }


}
