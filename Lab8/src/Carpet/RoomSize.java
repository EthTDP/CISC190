package Carpet;

/**
 * RoomSize class:
 * 1. Create a constructor taking in a name, a length, and a width.
 * 2. Gets the area
 * 3. Override the toString() method.
 */
public class RoomSize {

    private String name;
    private double length;
    private double width;

    /**
     * Instantiates a new Room size.
     *
     * @param inName  the name
     * @param inLen   the length
     * @param inWidth the width
     */
    public RoomSize(String inName, double inLen, double inWidth)
    {
        name = inName;
        length = inLen;
        width = inWidth;
    }

    public RoomSize(RoomSize size)
    {
        name = size.name;
        length = size.length;
        width = size.width;
    }

    /**
     * Gets area.
     *
     * @return the area
     */
    public double getArea()
    {
        return length * width;
    }

    @Override
    public String toString()
    {
        String output = "The name of the room is: " + name + "\nThe length of the room is: " + length +
                "\nThe width of the room is: " + width + "\nThe area of the room is: " + getArea();

        return output;
    }
}
