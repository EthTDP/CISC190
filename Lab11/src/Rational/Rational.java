package Rational;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Rational class. Implements rational interface that includes the methods that we have overrided in this class.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/21/2023
 * @version 1.0
 */
public class Rational implements RationalInterface {
    int numerator;
    int denom;
    double result;

    /**
     * No-arg constructor for rational.
     */
    public Rational()
    {
        numerator = 0;
        denom = 0;
        result = 0.0;
    }

    /**
     * doRational() method that does all the things for the whole class. Has two exceptions.
     */
    @Override
    public void doRational() throws InputMismatchException, DivideByZeroException {
        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Please enter an int(whole number) for the numerator: ");
            numerator = setUserInput();
            System.out.println("Please enter a int(whole number) for the denominator (Please make it not 0): ");
            denom = setUserInput();

            System.out.println("With numerator " + numerator + " and denominator " + denom + " the result is " + String.format("%.3f", calcRational()));

            System.out.println("Would you like to come and divide again with RationalDemo?");
        } while (keyboard.next().equalsIgnoreCase("y"));

    }
    /**
     * Sets the userInput() with a scanner.
     */
    @Override
    public int setUserInput() throws InputMismatchException
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }
    /**
     * Calculates the number with integer division and then getting a double. Makes sure that you can't divide by zero.
     */
    @Override
    public double calcRational() throws DivideByZeroException
    {
        double numb;

        if(denom == 0)
        {
            throw new DivideByZeroException("That's not cool man, don't divide by 0. Or else :D. Have fun!");
        } else {
            numb = (double) numerator / denom;
        }

        return numb;
    }
}
