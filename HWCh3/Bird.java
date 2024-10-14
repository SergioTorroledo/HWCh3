package HWCh3;
/**
 * Class:Bird
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class models a Bird object.
 * */
public class Bird implements Movement {
    private String type;

    public Bird(String type) {
        this.type = type;
    }

    // Getter
    public String getType() {
        return type;
    }

    // Implement fly method from Flight interface
    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    // Implement walk method from Movement interface
    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    // Implement jump method from Movement interface
    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }

    // toString method
    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }
}
