//Class
public class Student {
    static void main() {

        // OOPS developed to overcome traditional programming problems
        // Messy codes ko organise krte hai
        // brings modularity in code
        // object is a real world instance like student , car , boy etc
        // class is a template of that object
        // oops encapsulate attributes and behavior is a single object
        // "attributes" are state, properties of an object
        // "behavior" is methods/functions that an object can perform
        // object is an instance of class. ie object is created from a class
        // every object from a same class has same properties
        // when an object is created then only system allocates RAM to the class
        // class is just describing common structure and behavior
        // classes and object are fundamental building blocks of the OOP concept

        // "constructor" when making a object constructor is called when attributes of a class are set
        //default ctor gives null value so it is less used
        //Student A = new Student();

        //object Student
        Student A = new Student();
        A.id = 1;
        A.age = 15;
        A.name = "rohit";
        A.nos = 5;
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.age);

        A.bunk();
        A.study();
        A.sleep();
    }

    // attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    //Default constructor //attr. -> garbage
    public Student() { //default becz there are no parameters in it
        System.out.println("student default constructor called");
    }


    //methods/ behaviors
    public void study() {
        System.out.println(name + " " + "is" + " " + "studying");
    }

    public void sleep() {
        System.out.println(name + " " + "is" + " " + "sleeping");
    }

    public void bunk() {
        System.out.println(name + " " + "is" + " " + "bunking");
    }

}

