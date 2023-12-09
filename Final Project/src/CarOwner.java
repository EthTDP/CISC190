/**
 * CarOwner class!
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/30/2023
 */
public class CarOwner extends Citizen implements CarOwnerInterface {
    private String license;
    private int month;
    private int year;

    /**
     * CarOwner with no args. Uses super to use Citizens no arg constructor to set names to no name.
     * Sets License to Not Assigned and sets month and year to 0.
     */
    public CarOwner()
    {
        super();
        license = "Not Assigned";
        month = 0;
        year = 0;
    }

    /**
     * CarOwner with args. Takes in a first name, last name, license, month, and year. Passes first and last name to Citizen constructor and then sets license month and
     * year to the instance fields.
     *
     * @param firstName the first name
     * @param lastName  the last name
     * @param license   the license
     * @param month     the month
     * @param year      the year
     */
    public CarOwner(String firstName, String lastName, String license, int month, int year)
    {
        super(firstName, lastName);
        this.license = license;
        this.month = month;
        this.year = year;
    }

    /**
     * Sets license.
     *
     * @param inLicense the license
     */
    @Override
    public void setLicense(String inLicense) {
        license = inLicense;
    }

    /**
     * Gets license.
     *
     * @return the license
     */
    @Override
    public String getLicense() {
        return license;
    }

    /**
     * Sets month.
     *
     * @param inMonth the month
     */
    @Override
    public void setMonth(int inMonth) {
        month = inMonth;
    }

    /**
     * Gets month.
     *
     * @return the month
     */
    @Override
    public int getMonth() {
        return month;
    }

    /**
     * Sets year.
     *
     * @param inYear the year
     */
    @Override
    public void setYear(int inYear) {
        year = inYear;
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    @Override
    public int getYear() {
        return year;
    }

    @Override
    /**
     * overrides compareTo to sort CarOwners based on chronological
     * of month and year car was last. If param is null or not CarOwner
     class, returns -1
     * if object total months < param total months, temp is -1, object total
     months > param total months, temp is 1
     * otherwise the same and temp is 0
     * @return temp
     */
    public int compareTo(Object o){
        int temp = -1;
        if(o != null && getClass() == o.getClass()){
            CarOwner copy = (CarOwner)o;
            if((year*12+month) < (copy.year*12+copy.month))
                temp = -1;
            else if ((year*12+month) > (copy.year*12+copy.month))
                temp = 1;
            else //the same
                temp = 0;
        }
        return temp;
    }

    /**
     * Prints out what we want it to print out cleanly.
     * @return message the message we want to print.
     */
    @Override
    public String toString() {
        return super.toString() + "\t\t" + license + "\t\t" + month + "/" + year;
    }
}
