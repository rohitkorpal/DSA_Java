package polymorphism;

public class circle extends shape{
    //This tells the Java compiler that you are intentionally overriding a parent class method. If you make a mistake in the method name or parameters,
    // the compiler will immediately give you an error. This annotation does not change the behavior of the program but helps avoid bugs.
    @Override //no need to write it but it helps in easy understanding and avoid bugs
    public void draw(){
        System.out.println(" circle shape is Drawing ");
    }
}
