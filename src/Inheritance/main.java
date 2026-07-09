package Inheritance;

public class main {
    static void main() {
//        Car c = new Car(4,"automatic", 4,"Maruti","800");
//        c.StartEngine();
//        c.startAc();
//        c.StopEngine();

        MotorCycle m = new MotorCycle("splendor", "Xline", 2,"monochromic","low profile");
        m.StartEngine();
        m.wheelie();
        m.StopEngine();
    }
}
