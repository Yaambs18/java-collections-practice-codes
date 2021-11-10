package com.javacollections.treemapcodes;

import java.util.TreeMap;

public class RemovingTreeMapElements {
    public static void main(String args[])
    {
        // Initialization of a TreeMap
        // using Generics
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        // Inserting the Elements
        tm.put(4,"Aligarh");
        tm.put(2, "Bhardwaj");
        tm.put(1, "Yansh");
        tm.put(3, "From");

        System.out.println(tm);

        tm.remove(4);

        System.out.println(tm);
    }
}
