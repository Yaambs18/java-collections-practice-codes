package com.javacollections.vectorscode;

import java.util.Vector;

public class VectorExample4 {
    public static void main(String args[])
    {
        // create an instance of vector
        Vector<String> v = new Vector<>();

        // Add elements using add() method
        v.add("Prince");
        v.add("Persia");
        v.add(1, "of");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < v.size(); i++) {

            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        // Using the for each loop
        for (String str : v)
            System.out.print(str + " ");
    }
}
