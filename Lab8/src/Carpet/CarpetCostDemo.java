package Carpet;

import java.util.Scanner;


/**
 * CarpetCostDemo class:
 * 1. Get Room Name, Length, and Width for a RoomSize object.
 * 2. Get the cost per square foot to create a CarpetCost object.
 * 3. Print out masterRoom.
 * 4. Use a string that gets the next line and then repeat.
 */
public class CarpetCostDemo {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String room;
        double length;
        double width;

        System.out.println("Enter Room Name: ");
        room = keyboard.nextLine();
        System.out.println("Enter Room Length: ");
        length = keyboard.nextDouble();
        System.out.println("Enter Room Width: ");
        width = keyboard.nextDouble();

        RoomSize temp = new RoomSize(room, length, width);

        System.out.println("Enter Cost Per Square Foot: ");
        CarpetCost masterRoom = new CarpetCost(temp, keyboard.nextDouble());

        System.out.println("\n" + masterRoom);

        String var = keyboard.nextLine();

        System.out.println("\nEnter Room Name: ");
        room = keyboard.nextLine();
        System.out.println("Enter Room Length: ");
        length = keyboard.nextDouble();
        System.out.println("Enter Room Width: ");
        width = keyboard.nextDouble();

        System.out.println("Enter Cost Per Square Foot: ");
        CarpetCost livingRoom = new CarpetCost(new RoomSize(room, length, width),
                keyboard.nextDouble());

        System.out.println("\n" + livingRoom);

    }
}