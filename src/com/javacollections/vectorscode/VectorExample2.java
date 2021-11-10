package com.javacollections.vectorscode;

import java.sql.Array;
import java.util.Vector;

public class VectorExample2 {
    public static void main(String args[])
    {
        // Creating an empty Vector
        Vector<Integer> vctr = new Vector<Integer>();

        // Use add() method to add elements in the vector
        vctr.add(21);
        vctr.add(23);
        vctr.add(22);
        vctr.add(100);
        vctr.add(30);

        // Displaying the Vector
        System.out.println("Vector: " + vctr);

        // Using set() method to replace 12 with 21
        System.out.println("The Object that is replaced is: " + vctr.set(0, 12));

        // Using set() method to replace 20 with 50
        System.out.println("The Object that is replaced is: " + vctr.set(4, 50));

        // Displaying the modified vector
        System.out.println("The new Vector is:" + vctr);
    }
}
