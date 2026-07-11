package Inheritance;

public class Inheritance {
    static void main() {
        //inheritance  is "IS-A" relationship
        //Inheritance is a mechanism where one class (called the child class) acquires the properties and methods of another class (called the parent class).
        // 1. Single Inheritance- Single inheritance means one parent class and one child class.
        // 2. Multilevel Inheritance- In multilevel inheritance, a class inherits from another derived class, forming a chain.
        // 3. Hierarchical Inheritance- In hierarchical inheritance, multiple child classes inherit from the same parent class.
        // Note: Java does not support multiple inheritance with classes to avoid the Diamond Problem. The Diamond Problem is a conflict that arises when two parent classes have a method with the same name,
        // causing ambiguity(compiler encounters a line of code that could mean 2 diff things and system is unable to decide which action to take) for the child class.
        // However, multiple inheritance can be achieved using interfaces.
        //for eg mammal is a animal
        // makes code reusable and extensible
        // public, private(can be accessed within class only) and protected(can be inherited but not accessible in main fnc, can be accessed only within class and derived class)
        // single inheritance
        // multilevel
        // hierarchial - single parent multiple child class
        // multiple - a child class made from 2 parent,does not exist in java
        // hybrid - hierarchial + multiple
        // advantages- code modification , reusability, extensibility, data hiding
        // interfaces are used to implement multiple inheritance, they are methods without bodies.
        // EG
        // interface teamlead{
        // void teamlead()

        // Access specifiers - public, private, protected, default
        // The super keyword is used inside a child class to refer to the parent class.
        // It can be used to call the parent class constructor using super(), and to call a parent class method using super.methodName().
        // Java automatically inserts super() as the first line in the child constructor if it is not explicitly written.
        // This ensures that the parent part of the object is properly initialized before the child part.
        // }

        // allows a class to reuse properties and behaviors of another class.
        //It helps in building a relationship between classes and promotes code reusability.
        //inheritance allows you to create a new class based on an existing one.
    }
}
