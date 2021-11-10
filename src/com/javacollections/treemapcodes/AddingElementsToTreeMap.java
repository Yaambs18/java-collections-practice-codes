package com.javacollections.treemapcodes;

import java.util.TreeMap;

public class AddingElementsToTreeMap {
    public static void main(String args[])
    {
        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm1.put(3, "Geeks");
        tm1.put(2, "For");
        tm1.put(1, "Geeks");

        System.out.println(tm1);
    }
}
