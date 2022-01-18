import java.util.ArrayList;
import java.util.Random;

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

    public void eat(boolean night, boolean hungry, ArrayList<Squirrel> squirrels){
        Random random = new Random();
        int successOrNot = random.nextInt(1);
        if(night==true && hungry==true && successOrNot==1){
            int randomSquirrel = random.nextInt(squirrels.size());
            squirrels.remove(randomSquirrel);
            hungry = false;
            for (int i = 0; i < squirrels.size(); i++) {
                squirrels.get(i);
            }
        }else if(night==true && hungry==true && successOrNot==0){
            System.out.println(this.name + " failed! The squirrel escaped!");
        }else{
            System.out.println("All the squirrels are safe.");
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
