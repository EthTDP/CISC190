package CarSim;

/**
 * FuelGauge class:
 * 1. Create adding fuel and getting the amount.
 * 2. Create removing the fuel.
 */
public class FuelGauge {

    private int fuelAmount;

    /**
     * Creates a new FuelGauge constructor, no-args constructor.
     */
    public FuelGauge()
    {
        fuelAmount = 0;
    }

    /**
     * Create a new FuelGauge constructor. Has a parameter.
     *
     * @param fuelAmount the fuel amount
     */
    public FuelGauge(int fuelAmount)
    {
        this.fuelAmount = fuelAmount;
    }

    /**
     * New Constructor for FuelGauge. For security reasons.
     *
     * @param gauge the gauge
     */
    public FuelGauge(FuelGauge gauge)
    {
        fuelAmount = gauge.fuelAmount;
    }

    /**
     * Gets fuel amount.
     *
     * @return the fuel amount
     */
    public int getFuelAmount()
    {
        return fuelAmount;
    }

    /**
     * Add fuel.
     */
    public void addFuel()
    {
        if(fuelAmount < 15)
        {
            fuelAmount++;
        }
    }

    /**
     * Remove fuel.
     */
    public void removeFuel()
    {
        if(fuelAmount > 0)
        {
            fuelAmount--;
        }
    }
}
