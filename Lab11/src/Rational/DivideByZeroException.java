package Rational;

/**
 * DivideByZeroException class. Is thrown when someone divides by zero.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @since 11/21/2023
 * @version 1.0
 */
public class DivideByZeroException extends Exception {

    public DivideByZeroException()
    {
        super("Unfortunately, you just divided by zero. Please don't do that.");
    }

    public DivideByZeroException(String message)
    {
        super(message);
    }
}
