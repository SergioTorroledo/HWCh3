package HWCh3;
/**
 * Class:ThingThatFly
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class applies movement to the bird and airplane classes.
 * */
public interface Movement extends Flight {
    void walk();  // Abstract method for walking
    void jump();  // Abstract method for jumping
}
