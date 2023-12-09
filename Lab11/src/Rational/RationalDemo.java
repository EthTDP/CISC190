package Rational;

import java.util.InputMismatchException;

/**
 * RationalDemo class. The main class for Lab11. It has a try and catch, with two catches, and finally.
 * 1. Make the rational class with the rational interface and DivideByZeroException
 * 2. Create a rational object and then try to doRational. If it catches an InputMismatchException, write something to signify for the user to try again with integers
 * 3. If it catches a DivideByZeroException, get the message for the exception and then print it
 * 4. Finally, print out the thing being done.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/21/2023
 * @version 1.0
 */
public class RationalDemo {
    public static void main(String[] args) {
        Rational rat1 = new Rational();

        try {
            rat1.doRational();
        } catch(InputMismatchException e)
        {
            System.out.println("Try running the program again but with integers. Please :D");
        } catch(DivideByZeroException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("The integer division has been done. Thank you for flying, I mean using Rational.RationalDemo. See you soon!(Come back please)");
        }
    }
}