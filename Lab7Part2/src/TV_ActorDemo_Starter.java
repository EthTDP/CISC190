import java.util.ArrayList;

/**
 * TV_ActorDemo_Starter:
 * 1) Create the printArrayList() method. Prints the arraylist
 * 2) Get the main ready. Add in TV_Actor objects and removing and adding new ones into the arraylist.
 */
public class TV_ActorDemo_Starter {

    public static void main(String[] args) {
        ArrayList<TV_Actor> list = new ArrayList<>();

        list.add(new TV_Actor("Bart", "The Simpsons"));
        list.add(new TV_Actor("Maggie", "The Simpsons"));
        list.add(new TV_Actor("Lisa", "The Simpsons"));
        printArrayList(list);

        list.remove(1);
        printArrayList(list);

        list.remove(1);
        list.add(1, new TV_Actor("Butthead", "B&B"));
        printArrayList(list);

        list.add(1, new TV_Actor("Beavis", "B&B"));
        printArrayList(list);

        list.remove(0);
        printArrayList(list);
    }


    /**
     * Prints the arraylist that is given
     *
     * @param list The arraylist that will be printed.
     */
    public static void printArrayList(ArrayList<TV_Actor> list) {
        System.out.println("Printing ArrayList<TV_Actor> list");

        int actorNumber = 0;
        for (TV_Actor entry : list) {
            System.out.println("Actor " + actorNumber + " " + entry.toString());
            actorNumber++;
        }
        System.out.println();
    }
}