package HWCh3;

/**
 * Class:ThingThatFly
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class applies the bird and airplane classes.
 * */
import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        // Create objects
        Airplane airplane = new Airplane("Boeing 747", 2016);
        Bird eagle = new Bird("Eagle");
        Bird hummingbird = new Bird("Hummingbird");

        // Store them in an array or array list
        ArrayList<Flight> flyingObjects = new ArrayList<>();
        flyingObjects.add(airplane);
        flyingObjects.add(eagle);
        flyingObjects.add(hummingbird);

        // Loop through the list and print the objects and how they fly
        for (Flight flyingObject : flyingObjects) {
            // Print the toString of each object
            System.out.println(flyingObject.toString());
            // Call the fly method to print how they fly
            flyingObject.fly();
        }
    }
}

