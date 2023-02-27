/*
 * Fault, Error, Failure Example
 * Java example of software fault, error, and failure concepts.
 */

package org.example;

public class Main {

    // Before running add the following command line arguments to the run configuration.
    // Run -> Edit Configurations
    // Sample command line argument: Even 5 0 7
    // Sample command line argument: Odd 3 7 2
    public static void main(String[] args) {

        String lookFor = args[0];

        int[] myArray = new int[3];
        myArray[0] = Integer.parseInt(args[1]);
        myArray[1] = Integer.parseInt(args[2]);
        myArray[2] = Integer.parseInt(args[3]);

        printValues(lookFor, myArray);

        int count = 0;
        if (lookFor.equals("Even")) {
            count = countEvenNumbers(myArray);
            System.out.println("Count of even numbers in the array is = " + count);
        } else {
            count = countOddNumbers(myArray);
            System.out.println("Count of odd numbers in the array is = " + count);
        }
    }


    public static void printValues(String look, int[] theArray) {
        System.out.println("Look for = " + look + " numbers");
        System.out.print("Array Values = ");
        for (int x : theArray) {
            System.out.print(x + " ");
        }
        System.out.println("");
    }


    /**
     * Count even numbers in an array
     *
     * @param theArray array to count even numbers in
     * @return the count of even numbers in theArray
     * @throws NullPointerException if theArray is null
     */
    public static int countEvenNumbers(int[] theArray) {
        int count = 0;

        for (int i = 1; i < theArray.length; i++) {
            if (theArray[i] % 2 == 0) {
                // The value is even.
                count++;
            }
        }

        return count;
    }


    /**
     * Count odd numbers in an array
     *
     * @param theArray array to count odd numbers in
     * @return the count of odd numbers in theArray
     * @throws NullPointerException if theArray is null
     */
    public static int countOddNumbers(int[] theArray) {
        int count = 0;

        for (int i = 0; i < theArray.length; i++) {
            if (theArray[i] % 2 != 0) {
                // The value is odd.
                count++;
            }
        }

        return count;
    }

}