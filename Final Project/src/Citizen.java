/**
 * Citizen Class. Has all the Citizens. Gets the first and last name.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/30/2023
 */
public class Citizen implements CitizenInterface {

    private String firstName;
    private String lastName;

    /**
     * No-Arg constructor for Citizen. Sets First and Last name to no name.
     */
    public Citizen()
    {
        firstName = "No Name";
        lastName = "No Name";
    }

    /**
     * Constructor with two parameters, first and last name.
     *
     * @param firstName the first name
     * @param lastName  the last name
     */
    public Citizen(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName the firstName.
     */
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the first name.
     *
     * @return firstName the first name
     */
    @Override
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the last name.
     * @param lastName the last name to set
     */
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the last name.
     * @return lastName the last name.
     */
    @Override
    public String getLastName() {
        return lastName;
    }

    /**
     * ToString method for writing out what the class needs.
     *
     * @return message the Message we would like to send if using the Citizen class.
     */
    @Override
    public String toString() {
        return lastName + " " + firstName;
    }
}
