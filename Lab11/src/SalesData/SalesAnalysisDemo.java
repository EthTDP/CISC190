package SalesData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * SalesAnalysisDemo class. The main class for Lab9.
 * 1. Make the SalesAnalysis class and create the methods
 * 2. Follow directions for SalesAnalysisDemo
 * 3. Finish the lab.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/21/2023
 * @version 1.0
 */
public class SalesAnalysisDemo {

    public static void main(String[] args)
    {
        System.out.print("Please enter a file name or path: ");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.nextLine();
        File file = new File(fileName);

        while(!file.exists())
        {
            System.out.print("Please write a file name that exists! ");

            fileName = keyboard.nextLine();
            file = new File(fileName);
        }

        SalesAnalysis analysis = new SalesAnalysis(fileName);
        try {
            analysis.processFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



        analysis.writeOutput();
    }



}
