package com.javacollections.hashmapcodes;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String args[])
    {
        // No need to mention the
        // Generic type twice
        HashMap<Integer, String> hm1 = new HashMap<>();

        // Initialization of a HashMap
        // using Generics
        HashMap<String, String> hm2 = new HashMap<>();

        // Add Elements using put method
        hm1.put(1, "Geeks");
        hm1.put(2, "For");
        hm1.put(3, "Geeks");

        hm2.put("firstname", "Yansh");
        hm2.put("lastname", "Bhardwaj");
        hm2.put("age", "20");

        System.out.println("Mappings of HashMap hm1 are : "+ hm1);
        System.out.println("Mapping of HashMap hm2 are : "+ hm2);
    }
}
