package Carpet.Work;


/**
 * The WorkWeekDemo class:
 * 1. Create the main class that uses a few workweek classes and methods to check whether or not they are the same or not.
 */
public class WorkWeekDemo {

    public static void main(String[] args)
    {
        WorkWeek noArgConst = new WorkWeek();

        WorkWeek begin = new WorkWeek(WorkWeek.WorkEnum.MONDAY);
        WorkWeek mid = new WorkWeek(WorkWeek.WorkEnum.WEDNESDAY);

        noArgConst.daysAreSame(begin);
        noArgConst.daysAreSame(mid);

        noArgConst.compareDays(begin);

        begin.compareDays(mid);

        mid.compareDays(begin);

        mid.printDay();
    }
}
