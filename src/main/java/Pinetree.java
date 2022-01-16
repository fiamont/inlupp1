import java.util.List;

public class Pinetree {
    int numOfCones;
    List<Squirrel> squirrels;
    Owl owl;
    int age;
    boolean pests;

    // add constructor

    public int getNumOfCones() {return numOfCones;}
    public void setNumOfCones(int numOfCones) {this.numOfCones = numOfCones;}

    public List<Squirrel> getSquirrels() {return squirrels;}
    public void setSquirrels(List<Squirrel> squirrels) {this.squirrels = squirrels;}

    public Owl getOwl() {return owl;}
    public void setOwl(Owl owl) {this.owl = owl;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public boolean isPests() {return pests;}
    public void setPests(boolean pests) {this.pests = pests;}

}
