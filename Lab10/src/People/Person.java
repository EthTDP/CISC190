package People;

/**
 * Person class. Implements personinterface to get hireyears and names.
 */
public class Person implements PersonInterface
{
    private String name;

    /**
     * No-arg constructor for person. Default constructor
     */
    public Person()
    {
        name = "No name yet";
    }

    /**
     * Person constructor that takes in a name
     *
     * @param name the name
     */
    public Person(String name)
    {
        this.name = name;
    }


    /**
     * Sets the name
     *
     * @param name the name
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name
     *
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
