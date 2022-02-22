package com.sau;

public class Main {

    public static void main(String[] args) {

        //int[] myArray = {5, 2, 3};

        int[] myArray = new int[3];
        myArray[0] = 5;
        myArray[1] = 2;
        myArray[2] = 3;

        int count = 0;

        System.out.print("Values of the array: ");
        for (int x : myArray) {
            System.out.print(x + " ");
        }
        System.out.println("");

        count = countEvenNumbers(myArray);
        System.out.println("The count of even numbers in the array is " + count);
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

}
