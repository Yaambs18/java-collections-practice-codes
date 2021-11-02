package com.javacollections.hashsetcodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args){
        List<String> list=new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Set<String> set=new HashSet<>(list);
        set.add("Four");
        set.forEach(System.out::println);

    }
}
