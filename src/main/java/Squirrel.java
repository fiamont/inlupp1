public class Squirrel {
    int weight;
    int numOfConesInNest;
    boolean hungry;
    int age;

    public Squirrel (){
        this.hungry = hungry;
    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    public int getNumOfConesInNest() {return numOfConesInNest;}
    public void setNumOfConesInNest(int numOfConesInNest) {this.numOfConesInNest = numOfConesInNest;}

    public boolean isHungry() {return hungry;}
    public void setHungry(boolean hungry) {this.hungry = hungry;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public boolean eat(boolean hungry, int numOfConesInNest){

        if(hungry == true && numOfConesInNest > 0){
            numOfConesInNest--;
            boolean eating = true;
            hungry = false;
            return eating;
        }else if(hungry == true && numOfConesInNest <= 0) {
            boolean eating = false;
            return eating;
        }
        else{
            boolean eating = false;
            return eating;
        }
    }
}

