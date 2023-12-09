/**
 * The interface Car owner interface.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/29/2023
 * @version 1.0
 */
public interface CarOwnerInterface extends Comparable {

    /**
     * Sets license.
     *
     * @param inLicense the in license
     */
    void setLicense(String inLicense);

    /**
     * Gets license.
     *
     * @return the license
     */
    String getLicense();

    /**
     * Sets month.
     *
     * @param inMonth the month
     */
    void setMonth(int inMonth);

    /**
     * Gets month.
     *
     * @return the month
     */
    int getMonth();

    /**
     * Sets year.
     *
     * @param inYear the year
     */
    void setYear(int inYear);

    /**
     * Gets year.
     *
     * @return the year
     */
    int getYear();

    int compareTo(Object o);
}
