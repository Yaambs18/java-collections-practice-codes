package com.javacollections.hashsetcodes;

import java.util.HashSet;
import java.util.Set;

public  class HashSetExample1{
    public static void main(String[] args){
        //Creating HashSet and adding elements
        Set<String> set=new HashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        for (String num : set) {
            System.out.println(num);
        }
        Set<String> set1=new HashSet<>();
        set1.add("Six");
        set1.add("Seven");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
    }
}
