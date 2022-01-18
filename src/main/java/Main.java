import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Squirrel> squirrelList = new ArrayList<Squirrel>();
        Squirrel tintin = new Squirrel(401,9, true, 4, "Tintin");
        Squirrel jumper = new Squirrel(439, 11, false,3, "Jumper");
        Squirrel kukui = new Squirrel(354, 5, true, 2, "Kukui");
        squirrelList.add(tintin);
        squirrelList.add(jumper);
        squirrelList.add(kukui);

        Owl hedvig = new Owl(91, true,7,456, "Hedvig");

        Pinetree pinetree = new Pinetree(38, 103, 0, hedvig, squirrelList);

        System.out.println(pinetree.toString());
        System.out.println("\n" + tintin.toString());
        System.out.println(jumper.toString());
        System.out.println(kukui.toString());
        System.out.println("\n" + hedvig.toString());

        System.out.println("\nDid the tree fall?: " + pinetree.fall(0,103));
        System.out.println("Did the squirrel Tintin eat?: " + tintin.eat(true,9));
        System.out.println("Did the squirrel Jumper eat?: " + jumper.eat(false,11));
        System.out.println("Did the squirrel Kukui eat?: " + kukui.eat(true,5));
        System.out.println("Did the owl Hedvig eat?: " + hedvig.eat(true,true));

    }
}
