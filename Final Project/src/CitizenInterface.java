/**
 * The interface for a Citizen.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/30/2023
 * @version 1.0
 */
public interface CitizenInterface {

    /**
     * Sets the first name
     * @param inFirst the firstName
     */
    void setFirstName(String inFirst);
    /**
     * Gets the first name.
     *
     * @return firstName the firstName
     */
    String getFirstName();
    /**
     * Sets the last name
     *
     * @param inLast the lastName
     */
    void setLastName(String inLast);
    /**
     * Get the last name
     *
     * @return lastName the lastName.
     */
    String getLastName();
}
