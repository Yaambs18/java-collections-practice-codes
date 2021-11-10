package com.javacollections.enummapcodes;

import java.util.EnumMap;

public class AddingElements {
    enum Name {
        YANSH, PRIYANSHU, ADITYA
    }
    public static void main(String[] args)
    {
        // Creating an EnumMap of the Color enum
        EnumMap<Name, Integer> names = new EnumMap<>(Name.class);

        // Insert using put() method
        names.put(Name.YANSH, 1);
        names.put(Name.ADITYA, 2);

        // print mappings to the console
        System.out.println("EnumMap colors1: " + names);

        // Creating an EnumMap of the Color Enum
        EnumMap<Name, Integer> names2 = new EnumMap<>(Name.class);

        // Add using the putAll() Method
        names2.putAll(names);
        names2.put(Name.PRIYANSHU, 3);
        // print mappings to the console
        System.out.println("EnumMap colors2: " + names2);
    }
}
