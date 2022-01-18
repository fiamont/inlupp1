import java.util.ArrayList;
import java.util.Random;

public class Pinetree {
    private int numOfCones;
    private int age;
    private int pests;
    private Owl owl;
    private ArrayList<Squirrel> squirrels;

    public Pinetree(int numOfCones, int age, int pests, Owl owl, ArrayList<Squirrel> squirrels){
        this.numOfCones = numOfCones;
        this.age = age;
        this.pests = pests;
        this.owl = owl;
        this.squirrels = squirrels;
    }

    public void fall(int pests, int age){
        this.pests = pests;
        if(pests>10&&age>400){
            System.out.println("Oh no! The pinetree fell because of old age and all the pests");
        }else if(pests<5&&pests>0&&age>400){
            System.out.println("There is some pests in the pinetree and the tree is old, it may fall!");
        }else{
            System.out.println("This pinetree is healthy and will not fall for some time.");
        }

    }

    public int getNumOfCones() {return numOfCones;}
    public void setNumOfCones(int numOfCones) {this.numOfCones = numOfCones;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getPests() {return pests;}
    public void setPests(int pests) {this.pests = pests;}

    public Owl getOwl() {return owl;}
    public void setOwl(Owl owl) {this.owl = owl;}

    public ArrayList<Squirrel> getSquirrels() {return squirrels;}
    public void setSquirrels(ArrayList<Squirrel> squirrels) {this.squirrels = squirrels;}

    @Override
    public String toString() {
        return "In this tree lives " + squirrels.size() + " squirrels and an owl." + " It got " + pests + " pests and " + numOfCones + " cones, and is " + age + " years old!";

    }
}
