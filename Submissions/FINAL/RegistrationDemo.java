import java.util.ArrayList;
import java.util.Arrays;

/**
 * RegistrationDemo: CISC190 FINAL!!!! Stay with us Prof C :D
 * 1. Create the other classes and interfaces in order to actually make this driver
 * 2. Follow the pdf fpr RegDemo Class.
 * 3. Finish the FINAL!
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/30/2023
 */
public class RegistrationDemo {
    public static void main(String[] args)
    {
        RegistrationMethods dmv = new RegistrationMethods();
        dmv.setFileNames();
        ArrayList<CarOwner> ltState = new ArrayList<>();
        dmv.processTextToArrayList(ltState);
        dmv.printArrayListToFile(ltState, "Initial Set of Car Owners - Unsorted");
        CarOwner[] ltStateCopy = dmv.convertToArray(ltState);
        Arrays.sort(ltStateCopy);
        dmv.printArrayToFile(ltStateCopy, "Sorted list based on Registration date");
        CarOwner[] overdue = dmv.flagOverdueOwners(ltStateCopy);
        dmv.printArrayToFile(overdue, "Owners with Expired Registration");
        CarOwner[] almostDue = dmv.flagAlmostDueOwners(ltStateCopy);
        dmv.printArrayToFile(almostDue, "Owners with registration expiring in three months or less");
    }
}
