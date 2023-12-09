package People;

import People.Adjunct;
import People.Employee;
import People.FullTime;
import People.Person;

import java.util.ArrayList;

/**
 * The class HRDemo:
 * 1. Make all the classes
 * 2. Make this class work. :D
 *
 * @author Ethan Nguyen, nguyenethan691@gmail.com
 * @version 1.0
 * @since 11/18/2023
 */
public class HRDemo {
    public static void main(String[] args) {
        FullTime fred = new FullTime("Flinstone, Fred", 2013, "BR-1", 75000.1234);
        Adjunct barney = new Adjunct("Rubble, Barney", 2014, "BR-2", 320, 60.55);

        FullTime wilma = new FullTime();
        wilma.setName("Flintstone, Wilma");
        wilma.setIdNum("BR-3");
        wilma.setHireYear(2015);
        wilma.setSalary(78123.2468);

        Employee betty = new Employee("Rubble, Betty", 2017, "BR-4");
        FullTime wilma2 = new FullTime("Slate, Wilma", 2015, "BR-3", 78123.2468);

        ArrayList<Person> staff = new ArrayList<>();
        staff.add(fred);
        staff.add(barney);
        staff.add(wilma);
        staff.add(betty);
        staff.add(wilma2);

        int employeeNumb = 1;
        for(Person people : staff)
        {
            System.out.println("Employee " + employeeNumb);
            System.out.println(people.toString());

            employeeNumb++;
        }

        if(wilma.equals(wilma2)) {
            System.out.println("Wilma is the same as Wilma2");
            wilma.setName("Slate, Wilma");
            staff.remove(4);
        } else {
            System.out.println("They are not the same..");
        }

        int employee = 1;
        for(Person people : staff)
        {
            System.out.println("Employee " + employee);
            System.out.println(people.toString());

            employee++;
        }
    }
}