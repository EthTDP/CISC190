package People;

/**
 * The class Adjunct. Extends employee so that we can use the class, Employee, to get the actual employee to calculate.
 */
public class Adjunct extends Employee {
    /**
     * The Hours.
     */
    double hours, /**
     * The Hr rate.
     */
    hrRate;

    /**
     * An adjunct constructor that takes in everything.
     *
     * @param name     the name
     * @param hireYear the hire year
     * @param idNum    the id num
     * @param hours    the hours
     * @param hrRate   the hr rate
     */
    public Adjunct(String name, int hireYear, String idNum, double hours, double hrRate) {
        super(name, hireYear, idNum);
        this.hours = hours;
        this.hrRate = hrRate;
    }


    @Override
    public String toString() {
        return super.toString() + "\nHours: " + hours + ", Hourly Rate: " + hrRate + ", Salary: $" + String.format("%.2f", getSalary());
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return hours * hrRate;
    }

    /**
     * Sets hours.
     *
     * @param hours the hours
     */
    public void setHours(double hours) {
        this.hours = hours;
    }

    /**
     * Gets hours.
     *
     * @return the hours
     */
    public double getHours() {
        return hours;
    }

    /**
     * Sets hr rate.
     *
     * @param hrRate the hr rate
     */
    public void setHrRate(double hrRate) {
        this.hrRate = hrRate;
    }

    /**
     * Gets hr rate.
     *
     * @return the hr rate
     */
    public double getHrRate() {
        return hrRate;
    }
}
