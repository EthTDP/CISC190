package Carpet.Work;

/**
 * Work Week class. Has work week methods to figure out if they are the same day or to compare days.
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/14/2023
 */
public class WorkWeek {

    private WorkEnum day;

    /**
     * New WorkWeek constuctor, no args.
     */
    public WorkWeek()
    {
        day = WorkEnum.MONDAY;
    }

    /**
     * New WorkWork constuctor has args.
     *
     * @param day the day
     */
    public WorkWeek(WorkEnum day)
    {
        this.day = day;
    }

    /**
     * Check if days are same.
     *
     * @param inWorkWeek the WorkWeek to check
     */
    public void daysAreSame(WorkWeek inWorkWeek)
    {
        if(day.equals(inWorkWeek.day))
        {
            System.out.println("The days are the same");
        } else {
            System.out.println("The days are different");
        }
    }

    /**
     * Compare the days.
     *
     * @param inWorkWeek the WorkWeek to check
     */
    public void compareDays(WorkWeek inWorkWeek)
    {
        if(day.ordinal() < inWorkWeek.day.ordinal())
        {
            System.out.println(day.name() + " is before " + inWorkWeek.day.name());
        } else {
            System.out.println(day.name() + " is after " + inWorkWeek.day.name());
        }
    }

    /**
     * Print the day.
     */
    public void printDay()
    {
        System.out.println("The day is " + getDay());
    }

    /**
     * Gets day.
     *
     * @return the day
     */
    public WorkEnum getDay()
    {
        return day;
    }

    /**
     * The enum WorkEnum. Has all the days.
     */
    public enum WorkEnum {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
    }
}


