package com.javacollections.treemapcodes;

import java.util.Map;
import java.util.TreeMap;

public class Iteration {
    public static void main(String[] args)
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
        for (Map.Entry mapElement : tm.entrySet()) {
            int key = (int)mapElement.getKey();

            // Finding the value
            String value = (String)mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}


