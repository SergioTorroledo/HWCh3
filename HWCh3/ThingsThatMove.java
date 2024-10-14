package HWCh3;
/**
 * Class:ThingThatFly
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class applies the bird and airplane classes.
 * */
public class ThingsThatMove {
    public static void main(String[] args) {
        // Create objects
        Airplane airplane = new Airplane("Boeing 747", 2016);  // Create an Airplane object
        Bird eagle = new Bird("Eagle");                        // Create a Bird object (Eagle)
        Bird hummingbird = new Bird("Hummingbird");            // Create another Bird object (Hummingbird)

        // Store them in an array or array list
        Movement[] movingThings = new Movement[] { airplane, eagle, hummingbird };

        // Loop through the array and print the objects and their behaviors
        for (Movement movingThing : movingThings) {
            // Print the toString of each object
            System.out.println(movingThing.toString());
            // Call the methods for flying, walking, and jumping
            movingThing.fly();
            movingThing.walk();
            movingThing.jump();
            System.out.println();  // Print a blank line for better output formatting
        }
    }
}
