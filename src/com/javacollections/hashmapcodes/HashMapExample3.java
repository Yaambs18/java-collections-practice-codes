package com.javacollections.hashmapcodes;

import java.util.HashMap;

public class HashMapExample3 {
    public static void main(String[] args)
    {
        HashMap<String, String> hm2 = new HashMap<>();

        hm2.put("firstname", "Yansh");
        hm2.put("lastname", "Bhardwaj");
        hm2.put("age", "20");

        System.out.println("Mappings of HashMap are : " + hm2);
        hm2.remove("age");
        System.out.println("Mappings after removal are : " + hm2);

        for (HashMap.Entry<String, String> e : hm2.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

    }
}
