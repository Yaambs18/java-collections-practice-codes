package com.javacollections.arraydequecodes;

import java.util.ArrayDeque;

public class ArrayDequeExample3 {
    public static void main(String args[])
    {
        // Creating an empty ArrayDeque
        ArrayDeque<String> dq = new ArrayDeque<String>();

        // Using add() method to add elements into the Deque
        // Custom input elements
        dq.add("Welcome");
        dq.add("To");
        dq.add("Geeks");
        dq.add("4");
        dq.add("Geeks");

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + dq);

        // Displaying the First element
        System.out.println("The first element is: "+ dq.getFirst());

        // Displaying the Last element
        System.out.println("The last element is: "+ dq.getLast());
    }
}
