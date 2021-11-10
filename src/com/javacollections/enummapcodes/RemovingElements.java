package com.javacollections.enummapcodes;

import java.util.EnumMap;

public class RemovingElements {
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
        names.put(Name.PRIYANSHU, 3);

        // print mappings to the console
        System.out.println("EnumMap colors1: " + names);

        // Remove a mapping using the remove() Method
        int value = names.remove(Name.YANSH);
        System.out.println("Removed Value: " + value);

        System.out.println("After removing elements : "+ names);

        //Replacing
        names.replace(Name.PRIYANSHU,3,4);
        names.replace(Name.ADITYA,5);

        System.out.println("After replacing: "+ names);
    }
}
