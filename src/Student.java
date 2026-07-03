//Class and Object
public class Student {
    static void main() {
        //OOPS 1st file

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

        //object Student / default ctor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 15;
//        A.name = "rohit";
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//        System.out.println(A.age);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        //default ctor mai pahle empty class ka object banau and then uski attributes set kro but parameterised mai 1 hi step mai hojata ha
        //parameterised ctor
        Student A = new Student(1, 12, "rohit", 3);// ye value constructor ko bheji hai but set nhi kri attributes mai
//        System.out.println(A.name);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//        System.out.println(A.age);
//
//        A.bunk();
//        A.study();
//        A.sleep();

        //copy constructor
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//        System.out.println(B.age);
//
//        B.sleep();

        // object life cycle
        Student B = new Student(1, 12, "rohit", 3);
        Student C = new Student(1, 12, "rohit", 3);
        Student D = new Student(1, 12, "rohit", 3);

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

    // Parameterised ctor
    public Student(int id, int age, String name, int nos) { //default becz there are no parameters in it
        System.out.println("student parameterised constructor called");
        this.id = id;//right id is the const. id or parameters jinka naam change kr skte ha. left one is for attr.
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Copy const
    public Student(Student srcobj) { // srcobj --> A
        System.out.println("student copy constructor called");
        this.id = srcobj.id; // "this" underconstruction object ka lia hota hai jo create ho rhe hai abhi
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
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

