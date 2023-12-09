package People;

/**
 * The class Employee. Extends person for getting names of the person
 */
public class Employee extends Person {
    private int hireYear;
    private String idNum;


    /**
     * Employee constructor that takes in a name, the hire year, and the id number
     *
     * @param name     the name
     * @param hireYear the hire year
     * @param idNum    the id num
     */
    public Employee(String name, int hireYear, String idNum) {
        setName(name);
        this.hireYear = hireYear;
        this.idNum = idNum;
    }

    /**
     * Employee no-arg constructor. A default constructor.
     */
    public Employee()
    {
        super();
        hireYear = 0;
        idNum = "Onboarding";
    }

    @Override
    public boolean equals(Object o)
    {
        boolean isEqual = false;
        if(o != null && getClass() == o.getClass())
        {
            Employee copy = (Employee) o;
            if(idNum.equalsIgnoreCase(copy.idNum))
                isEqual = true;
        }

        return isEqual;
    }

    /**
     * Gets service years.
     *
     * @return the service years
     */
    public int getServiceYears()
    {
        return CURRENT_YEAR - hireYear;
    }

    /**
     * Gets hire year.
     *
     * @return the hire year
     */
    public int getHireYear() {
        return hireYear;
    }

    /**
     * Sets hire year.
     *
     * @param hireYear the hire year
     */
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    /**
     * Gets id num.
     *
     * @return the id num
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * Sets id num.
     *
     * @param idNum the id num
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    @Override
    public String toString() {
        return super.toString() + "\nID Number: " + idNum + "\nYear Hired: " + hireYear + ", Years of Service: " + getServiceYears();
    }
}
