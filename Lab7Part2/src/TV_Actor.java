/**
 * TV_Actor class:
 * 1) Create two constructors, one with args, one without
 * 2) Create setters and getters for name and show
 * 3) create toString method to print the string.
 */
public class TV_Actor {
    private String name;
    private String show;

    /**
     * No-arg constructor for TV_Actor.
     */
    public TV_Actor()
    {
        name = "Unknown Name";
        show = "Unknown Show";
    }

    /**
     * Constructor for TV_Actor that takes in a name and a show
     *
     * @param inName The name of the actor
     * @param inShow The name of the show the actor is in
     */
    public TV_Actor(String inName, String inShow)
    {
        name = inName;
        show = inShow;
    }

    /**
     * Sets the name of the actor
     *
     * @param name Name of the actor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the show the actor is in
     *
     * @param show The show the actor is in
     */
    public void setShow(String show) {
        this.show = show;
    }

    /**
     * Gets the actors name
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Gets the shows name
     *
     * @return The show name
     */
    public String getShow() {
        return show;
    }

    /**
     * Code to print out a TV_Actor object
     * put in TV_Actor class file, this overrides the default .toString()
     * @return formatted TV_Actor output
     */
    public String toString(){
        String output = "Name: " + name + ", Show: " + show;
        return output;
    }
}
