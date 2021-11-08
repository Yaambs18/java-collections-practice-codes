package com.javacollections.hashmapcodes;

import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String args[])
    {
        HashMap<String, String> hm2 = new HashMap<>();

        hm2.put("firstname", "Yansh");
        hm2.put("lastname", "Bhardwaj");
        hm2.put("age", "20");

        System.out.println("Initial Map " + hm2);

        hm2.put("firstname", "priyanshu");
        hm2.put("lastname", "shukla");

        System.out.println("Updated Map " + hm2);
    }
}
