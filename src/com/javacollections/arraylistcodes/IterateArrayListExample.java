package com.javacollections.arraylistcodes;

import java.util.*;

public class IterateArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");

        System.out.println("Iterating through Iterator interface.");
        /*Iterator itr = fruits.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }*/
        System.out.println("Iterating through for-each loop.");
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println("Iterating through ListIterator.");

        ListIterator<String> fruit=fruits.listIterator(fruits.size());
        while(fruit.hasPrevious()){
            System.out.println(fruit.previous());
        }

        System.out.println("Traversing list through forEach() method:");

        fruits.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");

        Iterator<String> itr=fruits.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
    }

}
