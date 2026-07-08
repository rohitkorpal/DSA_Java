public class Polymorphism {
    static void main() {
        // has many forms
        // abiltiy of a single function or operator to work in diff ways based on object it is acting upon
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
        // The only operator overloaded in Java is +.
//        System.out.println(10 + 20);          // 30
//        System.out.println("10" + "20");      // 1020
//        System.out.println("Age: " + 20);     // Age: 20

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

