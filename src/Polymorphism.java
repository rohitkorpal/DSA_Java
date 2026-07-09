import polymorphism.circle;
import polymorphism.rect;
import polymorphism.shape;


public class Polymorphism {
    static void main() {
        // has many forms
        // ability of a single function or operator to work in diff ways based on object it is acting upon
        // helps an object to take multiple forms

        //Types - compile time polymorphism aka static poly, runtime poly

        // # static - method overloading and operator overloading

        // 1- method overloading -when a class contain multiple method sharing a same name
        // but different in arguement types.

        // eg-
//        Polymorphism obj = new Polymorphism();
//
//        System.out.println(obj.add(10, 20));        // 30
//        System.out.println(obj.add(10, 20, 30));    // 60
//        System.out.println(obj.add(10.5, 20.5));    // 31.0

        // 2- operator overloading - java does not support user defined operator overloading but internally
        // overloads certain operators (eg, + for string concatenates but for inter addition, we can't overload + ourself)
        // The only operator overloaded in Java is '+'.

//        System.out.println(10 + 20);          // 30
//        System.out.println("10" + "20");      // 1020
//        System.out.println("Age: " + 20);     // Age: 20

        // # Runtime polymorphism

        // 1- Function Overriding = a subclass can provide a specific implementation of a method that is already defined in
        // its superclass
        // 2- dYNAMIC method dispatch(upcasting) - a superclass ref variable can refer to subclass object and dynamic dispatch
        // is used to dispacth is used to resolve the called method at runtime
        circle c = new circle();
        //c.draw();
        //doDrawingStuff(c);
        //doDrawingStuff(new shape());
        // we created for shape s but passed c and it run without error becz parent can hold the child class and its methods
        rect r = new rect();
        //r.draw();
        //doDrawingStuff(r);

        shape s = new shape();
        //doDrawingStuff(s);

        // downcasting
        circle c1 = new circle();
        //doDrawingStuff(c1);
    }

    // Upcasting - dynamic selection of class and attributes
    // ek fnc banaya usma parent ka object dedia jo hold krega apna saare childs ko aur relevant method ko call krega
    public static void doDrawingStuff(shape s){
        s.draw();// polymorphic

        circle c1= (circle)s; //DOWNCASTING
        c1.draw();
    }

    // Method with 2 integers
    int add ( int a, int b){
        return a + b;
    }

    // Method with 3 integers
    int add ( int a, int b, int c){
        return a + b + c;
    }

    // method with double
    double add ( double a, double b){
        return a + b;
    }





}
