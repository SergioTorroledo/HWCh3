package HWCh3;
/**
 * Class:Duck
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a class save all the information of the Ducks .
 * */
class Duck extends FarmAnimal {
    private String sound;

    public Duck(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-12pm-6pm";
    }

    @Override
    public String toString() {
        return "Duck " + sound + " " + super.toString();
    }
}


