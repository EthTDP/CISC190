package Carpet;

/**
 * CarpetCost class:
 * 1. Gets the RoomSize object and a double of costPerSqFt
 * 2. Create a constructor
 * 3. Get the cost for the whole thing
 * 4. Override the toString() method.
 */
public class CarpetCost {

    private RoomSize size;
    private double costPerSqFt;

    /**
     * Creates a new CarpetCost constructor.
     *
     * @param area the area
     * @param cost the cost
     */
    public CarpetCost(RoomSize area, double cost)
    {
        size = new RoomSize(area);
        costPerSqFt = cost;
    }

    /**
     * Gets cost.
     *
     * @return the cost
     */
    public double getCost()
    {
        return size.getArea() * costPerSqFt;
    }

    @Override
    public String toString()
    {
        return size + "\ncost per square feet: $" + costPerSqFt + "\nTotal Cost: $" + String.format("%.2f", getCost());
    }
}
