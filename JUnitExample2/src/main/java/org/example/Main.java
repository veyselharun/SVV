package org.example;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        myList.add(3);
        myList.add(1);

        int minValue = findMin(myList);

        System.out.println(minValue);
    }


    /**
     * @param myList
     * @return
     * @throws ClassCastException if the list is not of type Integer
     */
    public static int findMin(ArrayList<Integer> myList) {

        // Throw NullPointerException if the list is null.
        if (myList == null) {
            // For null pointer exception check.
            // throw new IllegalArgumentException("IllegalArgumentException Exception. List is null.");
            throw new NullPointerException("NullPointer Exception. The list is null.");
        }

        // Throw IllegalArgumentException if the list is empty.
        if (myList.size() == 0) {
            throw new IllegalArgumentException("IllegalArgument Exception. The list is empty.");
        }

        ListIterator<Integer> iterator = myList.listIterator();
        int minValue = iterator.next();

        while(iterator.hasNext()) {
            int currentValue = iterator.next();
            if (currentValue < minValue) {
                minValue = currentValue;
            }
        }

        return minValue;
    }

}