package Inheritance;

public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;

    Vehicle() {
        this.name = "";
        this.model = "";
        this.noOfTyres = -1;
    }

    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void StartEngine() {
        System.out.printf("Starting Engine of %s : %s\n", name, model);
    }

    Void StopEngine() {
        System.out.printf("Stopping Engine of %s : %s\n", name, model);
        return null;
    }


}
