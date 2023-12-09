package People;

/**
 * The type Full time.
 */
public class FullTime extends Employee {
    /**
     * The Salary.
     */
    double salary;

    /**
     * Fulltime constructor that takes in a name, hireyear, id number, and the salary
     *
     * @param name     the name
     * @param hireYear the hire year
     * @param idNum    the id num
     * @param salary   the salary
     */
    public FullTime(String name, int hireYear, String idNum, double salary) {
        super(name, hireYear, idNum);
        this.salary = salary;
    }

    /**
     * Fulltime no-args constructor. A default constructor.
     */
    public FullTime()
    {
        super();
        this.salary = 0;
    }


    @Override
    public String toString() {
        return super.toString() + ", Salary: $" + String.format("%.2f", salary);
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
