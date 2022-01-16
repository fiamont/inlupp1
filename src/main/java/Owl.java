import java.util.ArrayList;

public class Owl {
    private int wingSpan;
    private boolean hungry;
    private int age;
    private int weight;
    private String name;

    public Owl(int wingSpan, boolean hungry, int age, int weight, String name){
        this.wingSpan = wingSpan;
        this.hungry = hungry;
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    // fix method eat, if night & hungry --> use method random and remove
    // one or none squirrel from arraylist, if success, hungry changes to false

    public void eat(boolean night, boolean hungry, ArrayList<Squirrel> squirrels){
        if(night==true&&hungry==true){
        }else{
        }
    }

    public int getWingSpan() {return wingSpan;}
    public void setWingSpan(int wingSpan) {this.wingSpan = wingSpan;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString() {
        return "The owl " + name + " weighs " + weight + " g, is " + age + " years old, have a wingspan of " + wingSpan + " cm, and the hungerfeelings is " + hungry + "!";
    }
}
