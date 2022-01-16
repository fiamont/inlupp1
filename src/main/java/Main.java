import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel tintin = new Squirrel(550,9, true, 4, "Tintin");
        Squirrel jumper = new Squirrel(590, 11, false,3, "Jumper");
        Squirrel kukui = new Squirrel(450, 5, true, 2, "Kukui");
        squirrelList.add(tintin);
        squirrelList.add(jumper);
        squirrelList.add(kukui);

        Owl hedvig = new Owl(91, true,7,456, "Hedvig");

        Pinetree pinetree = new Pinetree(61, 103, 0, hedvig, 3, squirrelList);
        System.out.println(pinetree.toString());
        System.out.println("\n" + hedvig.toString());
        System.out.println("\n" + tintin.toString());
        System.out.println(jumper.toString());
        System.out.println(kukui.toString());

        tintin.eat(9);
        jumper.eat(11);
        kukui.eat(5);

        System.out.println("\nTintin thought about eating and has now " + tintin.getNumOfConesInNest() + " cones in his nest and the hungerfeelings are now " + tintin.isHungry());
        System.out.println("Jumper thought about eating and has now " + jumper.getNumOfConesInNest() + " cones in his nest and the hungerfeelings are now " + jumper.isHungry());
        System.out.println("Kukui thought about eating and has now " + kukui.getNumOfConesInNest() + " cones in her nest and the hungerfeelings are now " + kukui.isHungry());

    }
}
