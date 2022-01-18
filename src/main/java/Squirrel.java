public class Squirrel {
    private int weight;
    private int numOfConesInNest;
    private boolean hungry;
    private int age;
    private String name;

    public Squirrel (int weight, int numOfConesInNest, boolean hungry, int age, String name){
        this.weight = weight;
        this.numOfConesInNest = numOfConesInNest;
        this.hungry = hungry;
        this.age = age;
        this.name = name;
    }

    public String eat(boolean hungry, int numOfConesInNest){
        if (hungry == true && numOfConesInNest > 0) {
            numOfConesInNest--;
            hungry=false;
            return "is no longer hungry, number of cones in nest are now: " + numOfConesInNest;
        }else if(hungry==true&&numOfConesInNest<=0){
            return "is still hungry!! there are no cones left!";
        }else{
            return "isn't hungry now";
        }

    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    public int getNumOfConesInNest() {return numOfConesInNest;}
    public void setNumOfConesInNest(int numOfConesInNest) {this.numOfConesInNest = numOfConesInNest;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    @Override
    public String toString() {
        return "The squirrel " + name + " weighs " + weight + " g, is " + age + " years old, have " + numOfConesInNest + " cones in its nest, and the hungerfeelings are now " + hungry + "!";
    }

}



