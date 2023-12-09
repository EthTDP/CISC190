package People;

/**
 * PersonInterface. An interface for the person.
 */
public interface PersonInterface {
    /**
     * The CURRENT_YEAR.
     */
    int CURRENT_YEAR = 2023;

    /**
     * Sets the name.
     *
     * @param name the name
     */
    void setName(String name);

    /**
     * Gets name.
     *
     * @return the name
     */
    String getName();

    String toString();
}
