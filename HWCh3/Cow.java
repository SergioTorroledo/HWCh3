package HWCh3;
/**
 * Class:Cow
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class save all the information of the Cows .
 * */
class Cow extends FarmAnimal {
    private String sound;
    public Cow(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "6am-4pm";
    }

    @Override
    public String toString() {
        return "Cow " + sound + " " + super.toString();
    }
}

