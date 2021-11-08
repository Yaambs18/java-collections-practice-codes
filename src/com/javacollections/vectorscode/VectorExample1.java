package com.javacollections.vectorscode;

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] arg)
    {
        // create default vector
        Vector v1 = new Vector();

        // Add elements using add() method
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        v1.add(3);

        // print the vector to the console
        System.out.println("Vector v1 is " + v1);

        // create generic vector
        Vector<Integer> v2 = new Vector<Integer>();

        v2.add(1);
        v2.add(2);
        v2.add(1,3);
        System.out.println("Vector v2 is " + v2);
    }
}
