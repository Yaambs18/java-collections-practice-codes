package com.javacollections.vectorscode;

import java.util.Vector;

public class VectorExample3 {
    public static void main(String[] arg)
    {

        // create default vector of capacity 10
        Vector v = new Vector();

        // Add elements using add() method
        v.add(1);
        v.add(2);
        v.add("Yansh");
        v.add("Bhardwaj");
        v.add(4);

        // removing first occurrence element at 1
        v.remove(1);

        System.out.println("after removal: " + v);
    }
}
