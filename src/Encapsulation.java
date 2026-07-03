import java.security.PrivateKey;

public class Encapsulation {
    static void main() {
        // binds data and methods in a class
        // like a capsule it combines and binds them together
        // functions
        // provide a secure layeer
        // hides internal implementation of code and data in class
        // expose only necessary info to external world
        // also called data hiding
        // prevent unauthorised access
        // prevent modification of original content by objects
        //Access modifiers - public, private, protected
        // getters and setters for accessing attributes

        Encapsulation A = new Encapsulation(1,12,"rahul",3,"mansi");
        System.out.println(A.gf);
        System.out.println(A.name);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.age);

        A.bunk();
        A.gfchatting(); //working test.java mai hai
    }



//    public int id;
//    public int age;
//    public String name;
//    public int nos;
//    private String gf;

    //perfect encapsulation
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    //GETTER FOR FETCHING PRIVATE ATTRIBUTE
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        // extra layer of authentication
        if (age<100)
            this.age = age;
        return;
    }



    public Encapsulation(int id, int age, String name, int nos, String gf) { //default becz there are no parameters in it
        System.out.println("student parameterised constructor called");
        this.id = id;//right id is the const. id or parameters jinka naam change kr skte ha. left one is for attr.
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    public void study() {
        System.out.println(name + " " + "is" + " " + "studying");
    }

    public void sleep() {
        System.out.println(name + " " + "is" + " " + "sleeping");
    }

    public void bunk() {
        System.out.println(name + " " + "is" + " " + "bunking");
    }

    private void gfchatting() {
        System.out.println("student parameterised gfchatting called");
    }

}
