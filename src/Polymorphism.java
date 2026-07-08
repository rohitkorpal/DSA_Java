public class Polymorphism {
    static void main() {
        // has many forms
        // abiltiy of a single function or operator to work in diff ways based on object it is acting upon
        // helps an object to take multiple forms

        //Types - compile time polymorphism aka static poly, runtime poly

        // static - method overloading and operator overloading

        // 1- method overloading -when a class contain multiple method sharing a same name
        // but different in arguement types.
        // eg-
        Polymorphism obj = new Polymorphism();

        System.out.println(obj.add(10, 20));        // 30
        System.out.println(obj.add(10, 20, 30));    // 60
        System.out.println(obj.add(10.5, 20.5));    // 31.0


    }

    // method with float
    double add ( double a, double b){
        return a + b;
    }

    // Method with 2 integers
    int add ( int a, int b){
        return a + b;
    }

    // Method with 3 integers
    int add ( int a, int b, int c){
        return a + b + c;
    }




}

