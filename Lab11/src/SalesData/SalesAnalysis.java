package SalesData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class SalesAnalysis.
 * Used for analyzing the sales.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/30/2023
 */
public class SalesAnalysis {
    ArrayList<Double> weeklyNumber = new ArrayList<>();
    String inputFile;

    public static final int DAYS_OF_WEEK = 7;

    /**
     * SalesAnalysis constructor that takes in an inputfile and sets inputfile to the parameter inputfile.
     *
     * @param inputFile the input file
     */
    public SalesAnalysis(String inputFile)
    {
        this.inputFile = inputFile;
    }

    /**
     * Processes file. Takes all the lines and adds them to an array using the private void setArrayListElement().
     *
     * @throws FileNotFoundException the file not found exception
     */
    public void processFile() throws FileNotFoundException {
        File file = new File(inputFile);
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNextLine())
        {
            String toSplit = fileScanner.nextLine();

            String[] numbers = toSplit.split(",");

            setArrayListElement(numbers);
        }

        fileScanner.close();
    }

    /**
     * Sets the arraylist element from inArray and adds it all together to add it to weeklyNumber which is an arraylist in the instance fields.
     *
     * @param inArray the array to plug in
     */
    private void setArrayListElement(String[] inArray)
    {
        double total = 0;

        for(String numb : inArray)
        {
            double add = Double.parseDouble(numb);
            total += add;
        }

        weeklyNumber.add(total);
    }

    /**
     * Writes the output.
     */
    public void writeOutput()
    {
        double min = weeklyNumber.get(0), max = weeklyNumber.get(0);
        double totalSales = 0;
        int minWeek = 0, maxWeek = 0;
        double avg = 0;

        for(int i = 0; i < weeklyNumber.size(); i++)
        {
            avg = weeklyNumber.get(i) / DAYS_OF_WEEK;
            System.out.println("\nWeek " + (i + 1) + " Info");
            System.out.println("Total Sales: $" + String.format("%,.2f", weeklyNumber.get(i)));
            System.out.println("Avg Daily Sales for Week: " +  String.format("%,.2f", avg));
        }

        for(Double dub : weeklyNumber)
        {
            totalSales += dub;
        }

        avg = totalSales / 4;

        for(int i = 0; i < weeklyNumber.size(); i++)
        {
            if(weeklyNumber.get(i) > max)
            {
                max = weeklyNumber.get(i);
                maxWeek = i + 1;
            }

            if(weeklyNumber.get(i) < min)
            {
                min = weeklyNumber.get(i);
                minWeek = i + 1;
            }
        }

        System.out.println("\nTotal Sales: $" + String.format("%,.2f", totalSales));
        System.out.println("Avg Daily Sales for Week: $" + String.format("%,.2f", avg));
        System.out.println("Week " + maxWeek + " had the highest amount of sales.");
        System.out.println("Week " + minWeek + " had the lowest amount of sales.");
    }
}