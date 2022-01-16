public class Main {
    public static void main(String[] args) {
        Squirrel tintin = new Squirrel();
        tintin.setNumOfConesInNest(9);
        tintin.setHungry(true);
        boolean tintinIsHungry = tintin.isHungry();
        int tintinsCones = tintin.getNumOfConesInNest();

        tintin.eat(tintinIsHungry, tintinsCones);

        System.out.println("Tintin has " + tintinsCones + " cones in his nest");

        //Pinetree pinetree1 = new Pinetree();

    }
}
