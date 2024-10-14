package HWCh3;
/**
 * Class:MyFarm
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class is takes the information of all the animals.
 * */
import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> farm = new ArrayList<>();

        farm.add(new Duck("Donald", "male", 3.2, 5, "Quack Quack"));
        farm.add(new Duck("Daisy", "female", 3.6, 5, "Quack Quack"));
        farm.add(new Cow("Molly", "female", 1600.0, 3, "Moo Moo"));
        farm.add(new Chicken("Alberto", "male", 1.6, 2, "Cock-a-Doodle-doo"));
        farm.add(new Chicken("Henrietta", "female", 1.8, 4, "Cluck Cluck"));
        farm.add(new Chicken("line", "female", 1.7, 4, "Cluck Cluck"));

        for (FarmAnimal animal : farm) {
            System.out.println(animal.toString());
            System.out.println(animal.getName() + ": " + animal.feedLoadingSchedule());
        }
    }
}

