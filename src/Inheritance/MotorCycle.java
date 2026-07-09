package Inheritance;

public class MotorCycle extends Vehicle {

    public String handleBarStyle;
    public String suspensionType;

    MotorCycle(String name, String model, int noOfTyre, String suspensionType, String handleBarStyle) {
        super(name, model, noOfTyre);
        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;


    }

    public void wheelie (){
        System.out.println("wheelie by :" + name);
    }

}
