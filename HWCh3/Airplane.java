package HWCh3;
/**
 * Class:Airplane
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class is models an airplane object  .
 * */
public class Airplane implements Movement {
    private String model;
    private int yearBuilt;

    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    // Implement fly method from Flight interface
    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    // Implement walk method from Movement interface
    @Override
    public void walk() {
        System.out.println("I tax on my wheels.");
    }

    // Implement jump method from Movement interface
    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }

    // toString method
    @Override
    public String toString() {
        return "Airplane [model=" + model + ", year=" + yearBuilt + "]";
    }
}
