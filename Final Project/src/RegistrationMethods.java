import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Registration Methods class!
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/30/2023
 */
public class RegistrationMethods implements RegistrationMethodsInterface {
    private String inputFileName;
    private String outputFileName;

    /**
     * Prompts the user to provide the location of the csv file to be processed
     * (registration.csv) and the location for where the user wants the output file
     * saved (output.txt).
     */
    @Override
    public void setFileNames() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please provide a location of the file that you would like to be processed. ");
        String fileName = keyboard.nextLine();
        File input = new File(fileName);

        while(!input.exists())
        {
            System.out.print("Please provide a location that exists. ");
            fileName = keyboard.nextLine();
            input = new File(fileName);
        }

        inputFileName = fileName;

        System.out.print("Please provide a location where you would like your output to go to. ");

        outputFileName = keyboard.nextLine();
    }

    /**
     * Takes csv file (inputFileName) and parses out each record. split() and
     * nextLine()
     * will be helpful. For each line, create a CarOwner object and add to
     * ArrayList <CarOwner>
     * collection
     *
     * @param inList
     */

    @Override
    public void processTextToArrayList(ArrayList<CarOwner> inList) {
        File file = new File(inputFileName);

        try {
            Scanner fileScanner = new Scanner(file);

            String input = fileScanner.nextLine();

            while(fileScanner.hasNextLine())
            {
                String[] splitString = fileScanner.nextLine().split(",");
                inList.add(new CarOwner(splitString[0], splitString[1], splitString[2], Integer.parseInt(splitString[3]), Integer.parseInt(splitString[4])));
            }

            fileScanner.close();
        } catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Prints out ArrayList passed in based on toString() along with passed in
     * message
     *
     * @param inList ArrayList<CarOwner> collection passed in to be written to
     *               a text file
     * @param inMsg  Message specific to the array being printed
     */
    @Override
    public void printArrayListToFile(ArrayList<CarOwner> inList, String inMsg) {
        File file = new File(outputFileName);
        try {
            PrintWriter outputFileWriter = new PrintWriter(file);
            outputFileWriter.println(inMsg);
            for(CarOwner owner : inList)
            {
                outputFileWriter.println(owner);
            }

            outputFileWriter.close();
            System.out.println("Succesfully printed ArrayList");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Converts an ArrayList<CarOwner> collection to a newly created
     * CarOwner[], called temp. temp is returned to the calling method.
     *
     * @param inList
     */
    @Override
    public CarOwner[] convertToArray(ArrayList<CarOwner> inList) {
        CarOwner[] temp = new CarOwner[inList.size()];

        for(int i = 0; i < inList.size(); i++)
        {
            temp[i] = inList.get(i);
        }

        return temp;
    }

    /**
     * Prints out array passed in based on toString() along with passed in
     * message
     *
     * @param inArray CarOwner[] array to be written to a text file
     * @param inMsg   Message specific to the array being printed
     */
    @Override
    public void printArrayToFile(CarOwner[] inArray, String inMsg) {
        File file = new File(outputFileName);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter outputFileWriter = new PrintWriter(fileWriter);

            outputFileWriter.println("\n" + inMsg);
            for(CarOwner owner : inArray)
            {
                if(owner != null)
                {
                    outputFileWriter.println(owner);
                }
            }

            outputFileWriter.close();

            System.out.println("Succesfully printed array.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Method that generates and returns an array for vehicles whose
     * registration have expired defined as registration is over 12 months old
     * based on current REG_MONTH and REG_YEAR.
     *
     * @param inArray CarOwner[] The CarOwners.
     *
     * @return CarOwner[] The owners that are flagged for overdue.
     */
    @Override
    public CarOwner[] flagOverdueOwners(CarOwner[] inArray) {
        CarOwner[] overdue = new CarOwner[inArray.length];
        int numb = 0;

        for(CarOwner owner : inArray)
        {
            if(owner.getYear() < REG_YEAR && owner.getMonth() < REG_MONTH || REG_YEAR - owner.getYear() > 1 && owner.getMonth() > REG_MONTH)
            {
                overdue[numb] = owner;
            }

            numb++;
        }

        return overdue;
    }

    /**
     * Method that generates and returns an array for vehicles whose
     * registration will expire in three months or less. The state of Looney
     * Tunes sends a reminder three months out to the car owner.
     *
     * @param inArray CarOwner[]
     */
    @Override
    public CarOwner[] flagAlmostDueOwners(CarOwner[] inArray) {
        CarOwner[] almost = new CarOwner[inArray.length];
        int numb = 0;

        for(CarOwner owner : inArray)
        {
            if(owner.getYear() < REG_YEAR && owner.getMonth() >= REG_MONTH && owner.getMonth() - (REG_MONTH + 3) < 0)
            {
                almost[numb] = owner;
            }

            numb++;
        }

        return almost;
    }
}
