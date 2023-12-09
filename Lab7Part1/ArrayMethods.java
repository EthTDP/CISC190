import java.util.Arrays;

/**
 * ArrayMethods(Methods for the array):
 * 1) Create count() method. Count how much.
 * 2) Create sum() method. Add them all up
 * 3) Create average() method. Find the average.
 * 4) Create findMax() method. Will find the max
 * 5) Create findIndexofMax() method. Get the index of the max number from step 4.
 * 6) Create findLast() method. Find the last occurance of the number
 * 7) Create findAll() method. Find all the indices of the occurances.
 * 8) Create getArray() method. Gets the array.
 * 9) Create copyArray() method. Copies the array.
 * 10) Create print() method. Copy and paste.
 *
 * @author Ethan Nguyen
 * @version 1.0
 * @since 10/11/2023
 */
public class ArrayMethods
{
    int[] a = new int[]{ 7, 8, 8, 3, 4, 9, 8, 7 };
    
    /**
     * Count method. Counts how many numbers are in the array. 
     * 
     * @return count Returns the length of the array.
     */
    public int count()
    {
        int count = 0;
        
        for(int i : a)
        {
            count++;    
        }
        
        return count;
    }
    
    /**
     * Sum method. Adds up all the numbers in the array.
     * 
     * @return total The sum of the numbers in the array
     */
    public int sum()
    {
        int total = 0;
        
        for(int i = count() - 1; i>=0; i--)
        {
            total+=a[i];
        }

        
        return total;
    }
    
    /**
     * Average method. Averages the amount in the array.
     * 
     * @return avg The average of the numbers in the array.
     */
    public double average()
    {
        double avg = (double) sum() / count();
        return avg;
    }
    
    /**
     * findMax method. Finds the max number in the array.
     * 
     *  @return max The max number.
     */
    public int findMax()
    {
        int max;
        
        max = a[0];
        
        for(int i : a)
        {
            if((i-1) > max)
            {
                max = i;
            }
        }
        
        return max;
    }
    
    /**
     * findIndexOfMax method. Finds the index of the max number from findMax method.
     * 
     * @return maxIndex The index of the max number.
     */
    public int findIndexOfMax()
    {   
        int maxIndex = 0;
        
        for(int i = 0; i < count(); i++)
        {
            if(a[i] == findMax())
            {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    /**
     * findLast method. Finds the last occurance of the number
     *
     * @param key The number we want to find the last occurance of
     *
     * @return last The last occurance of the number
     */
    public int findLast(int key)
    {
        int last = 0;
        
        int i = a.length-1;

        while(i>=0)
        {
            if(a[i] == key)
            {
                last = i;
                i = -1;
            } else {
                last = -1;
            }
            
            i--;
        }
        
        return last;
    }


    /**
     * findAll method. Finds the amount of times the number occurs and the index of the number.
     *
     * @param key The number we want to test for the amount of times it occurs
     *
     * @return amount An array with the amount of times the key occurs and the indices.
     */
    public int[] findAll(int key)
    {
        int counter = 0;

        int i = a.length - 1;

        while(i >= 0)
        {
            if(key == a[i])
            {           
                counter++;
            }
            
            i--;
        }
        
        int[] amount = new int[counter];
        
        int m = 0;
        
        for(int p = a.length - 1; p >= 0; p--)
        {
            if(key == a[p])
            {         
                amount[m] = p;
                
                if(m <= counter)
                    m++;
            }
        }
        
        return amount;
    }
    
    /**
     * Gets the array, a.
     * 
     * @return a The array
     */

    public int[] getArray() {
        return a;
    }

    /**
     * Copies the array of a.
     * 
     * @return copy The copy of the array.
     */

    public int[] copyArray()
    {
        return Arrays.copyOf(a, count());
    }

    /**
     * Sorts the array that is inserted into the method with a parameter.
     *
     * @param index The array in which will be sorted
     * @return index The array in which we have changed to be sorted
     */
    public int[] sortArray(int[] index)
    {
        int temp;

        for(int i = 0; i < index.length - 1; i++)
        {
            for(int j = i + 1; j < index.length; j++)  {
                if (index[j] < index[i]) {
                    temp = index[j];
                    index[j] = index[i];
                    index[i] = temp;
                }
            }
        }

        return index;
    }

    /**
     * Reverses the array that is inserted into the method with a parameter.
     *
     * @param array The array in which will be reversed
     * @return array The array that is reversed
     */
    public int[] reverseArray(int[] array) {
        int temp;

        for(int i = 0; i < array.length - 1; i++)
        {
            for(int j = array.length - 1; j > i; j--)
            {
                if(!(array[i] > array[j])) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        return array;
    }

    /**
     * Generates a 5 by 5 row of numbers from 1 to 5.
     */
    public static void genFiveByFiveRows()
    {
        int[][] array = new int[5][6];
        System.out.println("  A B C D E");
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length - 1; col++)
            {
                array[row][col] = row + 1;
            }
        }

        for(int row = 0; row < array.length; row++)
        {
            System.out.print(row + 1);
            for(int col = 0; col < array[row].length - 1; col++)
            {
                System.out.print(" ");
                System.out.print(array[row][col]);
            }
            System.out.print("\n");
        }
    }

    /**
     * Generates a 5 by 5 row of letters from A to E.
     */
    public static void genFiveByFiveCols()
    {
        char[][] array = new char[5][6];
        System.out.println("  A B C D E");
        for(int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[row].length - 1; col++)
            {
                array[row][col] = (char) ('A' + col);
            }
        }

        for(int row = 0; row < array.length; row++)
        {
            System.out.print(row + 1);
            for(int col = 0; col < array[row].length - 1; col++)
            {
                System.out.print(" ");
                System.out.print(array[row][col]);
            }
            System.out.print("\n");
        }
    }
    
    /**
    prints an int array, nicely formatted
    
    @param a int array to print
    
    */
    public void print(int[] a)
    {
    System.out.print("{");
    int i;
    // print elements before the last, separated by commas
    for (i = 0; i < a.length - 1; ++i)
        System.out.print(a[i] + ", ");
    // print last element. Careful here to handle length 0
    if (a.length > 0)
        System.out.print(a[i]);
    System.out.println("}");
    }
}


