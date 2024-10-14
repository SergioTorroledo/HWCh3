/**
 * Class:FarmAnimal
 * @author:Sergio Alejandro Torroledo Gonzalez
 * @version:1
 * @written on:10/12/2024
 * Course:ITEC-2150-01
 * This a super class created to store the information for a number of different farm animals in an array or array list and then display the sound the animals make.
 * */
package HWCh3;

abstract class FarmAnimal {
    private String name;
    private String gender;
    private double weight;
    private int age;

    public FarmAnimal(String name,String gender,double weight, int age){
        this.name=name;
        this.gender=gender;
        this.weight=weight;
        this.age=age;
    }

public String getName(){
        return name;
}
public String getGender(){
        return gender;
}
public double getWeight(){
        return weight;
    }
public int getAge() {
        return age;
    }

  public  abstract  String feedLoadingSchedule();

  public String toString(){
      return "[name= " + name + ", gender= " + gender + ",weight= " + weight + ", age=" + age + "]";
  }
}
