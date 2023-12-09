package Rational;

import java.util.InputMismatchException;

public interface RationalInterface {
    /**
     * doRational() method that does all the things for the whole class. Has two exceptions.
     */
    void doRational() throws InputMismatchException, DivideByZeroException;
    /**
     * Sets the userInput() with a scanner.
     */
    int setUserInput() throws InputMismatchException;
    /**
     * Calculates the number with integer division and then getting a double. Makes sure that you can't divide by zero.
     */
    double calcRational() throws DivideByZeroException;
}
