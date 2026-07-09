package Inheritance;

public class Car extends Vehicle {

    public int noOfDoors;
    public String transmissionType;

    Car(int noOfDoors, String transmissionType, int noOfTyres, String name, String model) {
        super(name, model, noOfTyres); // super is called first in the constructor
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
        super.StartEngine();
    }

    public void startAc(){
        System.out.println("Starting Ac of :" + name);
    }

}
