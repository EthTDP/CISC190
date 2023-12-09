package CarSim;


/**
 * OdometerDemo class:
 * 1. Create gauges and an odometer.
 * 2. Print out car levels of fuel and mileage.
 * 3. Create a second gauge and odometer for car 2.
 * 4. Repeat step 2.
 */
public class OdometerDemo {
    public static void main(String[] args)
    {
        final int MAX_FUEL = 15;

        FuelGauge gauge = new FuelGauge(6);

        Odometer odometer = new Odometer(gauge, 1000);

        System.out.println("Car1 gas level: " + gauge.getFuelAmount());

        System.out.println("Car1 is filling up");

        for(int i = 0; i < MAX_FUEL; i++)
        {
            gauge.addFuel();
        }

        System.out.println("Car1 gas level: " + gauge.getFuelAmount());

        System.out.println("Car1 is off");

        System.out.println("-------------------");

        while(gauge.getFuelAmount() > 0)
        {
            System.out.println("Mileage: " + odometer.mileage + ", Fuel(Gas Left): " + gauge.getFuelAmount());
            odometer.removeFuel();
            odometer.addMileage();

            if(gauge.getFuelAmount() == 0)
            {
                odometer.removeFuel();
                System.out.println("Mileage: " + odometer.mileage + ", Fuel(Gas Left): " + 0);
                System.out.println("Out of gas!");
            }
        }

        FuelGauge gauge2 = new FuelGauge(8);

        Odometer odometer2 = new Odometer(gauge2, 999850);

        System.out.println("\nCar2 gas level: " + gauge2.getFuelAmount());

        System.out.println("Car2 is filling up");

        for(int i = 0; i < MAX_FUEL; i++)
        {
            gauge2.addFuel();
        }

        System.out.println("Car2 gas level: " + gauge.getFuelAmount());

        System.out.println("Car2 is off");

        System.out.println("-------------------");

        while(gauge2.getFuelAmount() > 0)
        {
            System.out.println("Mileage: " + odometer2.mileage + ", Fuel(Gas Left): " + gauge2.getFuelAmount());
            odometer2.removeFuel();
            odometer2.addMileage();

            if(gauge2.getFuelAmount() == 0)
            {
                odometer2.removeFuel();
                System.out.println("Mileage: " + odometer2.mileage + ", Fuel(Gas Left): " + 0);
                System.out.println("Out of gas!");
            }
        }
    }
}
