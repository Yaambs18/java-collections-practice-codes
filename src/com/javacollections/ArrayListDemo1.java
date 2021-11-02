package com.javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Yansh");//Adding object in arraylist
        list.add("Priyanshu");
        list.add("Abhay");
        list.add("Nikhil");

        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("Initial size of an fruits: "+ fruits.size());

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Papaya");
        fruits.add("Guava");
        fruits.add(2, "Pear");
        list.addAll(0,fruits); //addall()
        System.out.println(list);

        System.out.println("size after adding elements :"+fruits.size());

        System.out.println("Content of fruits : "+fruits);
        //get()
        System.out.println(fruits.get(3));
        //set()
        System.out.println(fruits.set(3,"Banana"));
        //remove()
        fruits.remove("Papaya");
        fruits.remove(1);
        //removeall()
        list.removeAll(fruits);

        System.out.println(fruits.indexOf("Papaya"));
        System.out.println("size after alteration: "+fruits.size());

        System.out.println("content of fruits"+fruits);

        System.out.println(fruits.toString());
        // toArray
        System.out.println(fruits.toArray());

        String arr[] = new String[fruits.size()];
        arr = fruits.toArray(arr);

        for(String fruit: fruits){
            System.out.println(fruit);
        }

        Collections.sort(fruits);
        fruits.clear();
        System.out.println(fruits.isEmpty());

        fruits = (ArrayList<String>)list.clone();
        System.out.println(fruits);

        fruits.replaceAll(e -> e.toLowerCase());

        System.out.println(fruits);
    }
}
