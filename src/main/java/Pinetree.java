import java.util.ArrayList;
import java.util.Random;

public class Pinetree {
    private int numOfCones;
    private int age;
    private int pests;
    private Owl owl;
    private int numOfSquirrels;
    private ArrayList<Squirrel> squirrels;

    public Pinetree(int numOfCones, int age, int pests, Owl owl, int numOfSquirrels, ArrayList<Squirrel> squirrels){
        this.numOfCones = numOfCones;
        this.age = age;
        this.pests = pests;
        this.owl = owl;
        this.numOfSquirrels = numOfSquirrels;
        this.squirrels = squirrels;
    }


    // add method fall() + change methods with numberOfSquirrels so that it matches the arrayList.

    public int getNumOfCones() {return numOfCones;}
    public void setNumOfCones(int numOfCones) {this.numOfCones = numOfCones;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getPests() {return pests;}
    public void setPests(int pests) {this.pests = pests;}

    public Owl getOwl() {return owl;}
    public void setOwl(Owl owl) {this.owl = owl;}

    public int getNumOfSquirrels() {return numOfSquirrels;}
    public void setNumOfSquirrels(int numOfSquirrels) {this.numOfSquirrels = numOfSquirrels;}

    public ArrayList<Squirrel> getSquirrels() {return squirrels;}
    public void setSquirrels(ArrayList<Squirrel> squirrels) {this.squirrels = squirrels;}

    @Override
    public String toString() {
        if (pests > 5) {
            return "This tree is sick because of all the pests";
        } else if (pests < 5 && pests > 0) {
            return "In this tree lives " + numOfSquirrels + " squirrels and an owl." + " It is almost pest-free, have " + numOfCones + " cones, and is " + age + " years old!";
        } else if (pests <= 0) {
            return "In this tree lives " + numOfSquirrels + " squirrels and an owl." + " It is pest-free, have " + numOfCones + " cones, and is " + age + " years old!";
        }
        return null;
    }
}
