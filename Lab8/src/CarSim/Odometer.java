package CarSim;

/**
 * Odometer class:
 * 1. Add mileage, remove fuels, get mileages
 */
public class Odometer {
    /**
     * The Gauge.
     */
    FuelGauge gauge;
    /**
     * The Mileage.
     */
    int mileage;
    /**
     * The Miles since adding fuel.
     */
    int milesSinceAddingFuel = 1;

    /**
     * Constructor for a new Odometer.
     *
     * @param gauge the gauge
     * @param mile  the mile
     */
    public Odometer(FuelGauge gauge, int mile)
    {
        this.gauge = new FuelGauge(gauge);
        mileage = mile;
    }

    public Odometer(Odometer odo)
    {
        gauge = odo.gauge;
        mileage = odo.mileage;
        milesSinceAddingFuel = odo.milesSinceAddingFuel;
    }


    /**
     * Gets mileage.
     *
     * @return the mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * Add mileage.
     */
    public void addMileage()
    {
        if(mileage < 999999)
        {
            mileage++;
            milesSinceAddingFuel++;
        } else {
            mileage = 0;
            milesSinceAddingFuel++;
        }
    }

    /**
     * Remove fuel.
     */
    public void removeFuel()
    {
        if(milesSinceAddingFuel % 24 == 0)
        {
            gauge.removeFuel();
            milesSinceAddingFuel = 0;
        }
    }
}
