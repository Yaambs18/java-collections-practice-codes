package com.javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add(2, "Pear");

        Iterator itr=fruits.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());//printing the element and move to next
        }

        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("10");
        numbers.add("20");
        System.out.println(numbers);    // [10]
        ArrayList<String> numbers1 = new ArrayList<>();
        numbers1.add("10");
        numbers1.add("2");
        numbers1.add("3");
        System.out.println(numbers1);   // [1, 2, 3]
        System.out.println(numbers1.retainAll(numbers)); // true
        System.out.println(numbers1);   // [10]
    }
}
