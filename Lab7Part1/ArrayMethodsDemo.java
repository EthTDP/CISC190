import java.util.Arrays;
/**
 * ArrayMethodsDemo:
 * 1) Copy and Paste
 *
 * @author Ethan Nguyen
 * @version 1.0
 * @since 10/11/2023
 */
public class ArrayMethodsDemo
{
    public static void main (String[] args){
        ArrayMethods test = new ArrayMethods();
        System.out.println("Lab7 Pt1 - Let's get ready to rumble :-)");
        System.out.println("========================================");
        System.out.println("a[] has " + test.count() + " elements");
        System.out.println("The sum of all elements in a[] is: " + test.sum());
        System.out.printf("The avg of all elements in a[] is: %.2f\n",
        test.average());
        System.out.println("The largest number in a[] is: " + test.findMax());
        System.out.println("The index of the largest number in a[] is: " +
        test.findIndexOfMax());
        System.out.println("The last (or right most) index of 8 is: " +
        test.findLast(8));
        System.out.println("The last (or right most) index of 2 is: " +
        test.findLast(2));
        int[] findAll8s = test.findAll(8);
        System.out.print("8s were located in the following indices ");
        test.print(findAll8s);
        int[] copyOfMyArray = test.copyArray();
        System.out.println("a[] and copyOfA[] are equal: " +
        Arrays.equals(test.getArray(),copyOfMyArray));

        //part 2
        System.out.println("\n\nLab7 Pt2 - Let's continue to rumble :-)");
        System.out.println("=======================================");
        test.sortArray(copyOfMyArray);
        System.out.print("copyOfA[] sorted is: ");
        test.print(copyOfMyArray);
        System.out.println("myArray[] and copyOfMyArray[] are equal: "
                + Arrays.equals(test.getArray(),copyOfMyArray));
        int[] anotherCopyOfMyArray = test.copyArray();
        System.out.print("anotherCopyOfMyArray[]: ");
        test.print(anotherCopyOfMyArray);
        Arrays.sort(anotherCopyOfMyArray);
        System.out.print("anotherCopyOfMyArray[] sorted: ");
        test.print(anotherCopyOfMyArray);
        System.out.println("copyOfMyArray[] and anotherCopyOfMyArray[] are equal: "
                + Arrays.equals(copyOfMyArray, anotherCopyOfMyArray));
        anotherCopyOfMyArray = test.reverseArray(anotherCopyOfMyArray);
        System.out.print("anotherCopyOfMyArray[] reversed is: ");
        test.print(anotherCopyOfMyArray);
        System.out.println();
        test.genFiveByFiveRows();
        System.out.println();
        test.genFiveByFiveCols();
    }
}
