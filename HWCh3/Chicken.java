/**
 * Class:Chicken
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class save all the information of the chickens .
 * */
package HWCh3;

class Chicken extends FarmAnimal {
    private String sound;

    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }

    @Override
    public String toString() {
        // Using getter methods to access private attributes from FarmAnimal
        return "Chicken " + sound + " [name=" + getName() + ", gender=" + getGender() + ", weight=" + getWeight() + ", age=" + getAge() + "]";
    }
}

