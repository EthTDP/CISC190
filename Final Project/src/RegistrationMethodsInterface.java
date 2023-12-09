import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version v1.0
 * @since 11/30/2023
 */
public interface RegistrationMethodsInterface {
    int REG_MONTH = 4, REG_YEAR = 2023;
    /**
     * Prompts the user to provide the location of the csv file to be processed
     * (registration.csv) and the location for where the user wants the output file
     * saved (output.txt).
     */
    void setFileNames();
    /**
     * Takes csv file (inputFileName) and parses out each record. split() and
     nextLine()
     * will be helpful. For each line, create a CarOwner object and add to
     ArrayList <CarOwner>
     * collection
     */
    void processTextToArrayList(ArrayList<CarOwner> inList) throws FileNotFoundException;
    /**
     * Prints out ArrayList passed in based on toString() along with passed in
     * message
     *
     * @param inList ArrayList<CarOwner> collection passed in to be written to
     * a text file
     * @param inMsg Message specific to the array being printed
     */
    void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg);
    /**
     * Converts an ArrayList<CarOwner> collection to a newly created
     * CarOwner[], called temp. temp is returned to the calling method.
     */
    CarOwner[] convertToArray(ArrayList<CarOwner> inList);
    /**
     * Prints out array passed in based on toString() along with passed in
     * message
     *
     * @param inArray CarOwner[] array to be written to a text file
     * @param inMsg Message specific to the array being printed
     */
    void printArrayToFile(CarOwner[] inArray, String inMsg);
    /**
     * Method that generates and returns an array for vehicles whose
     * registration have expired defined as registration is over 12 months old
     * based on current REG_MONTH and REG_YEAR.
     *
     * @param inArray CarOwner[]
     */
    CarOwner[] flagOverdueOwners(CarOwner[] inArray);
    /**
     * Method that generates and returns an array for vehicles whose
     * registration will expire in three months or less. The state of Looney
     * Tunes sends a reminder three months out to the car owner.
     *
     * @param inArray CarOwner[]
     */
    CarOwner[] flagAlmostDueOwners(CarOwner[] inArray);
}