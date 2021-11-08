package com.javacollections.arraydequecodes;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample2 {
    public static void main(String[] args)
    {
        // Initializing a deque
        // since deque is an interface
        // it is assigned the
        // ArrayDeque class
        Deque<String> dq = new ArrayDeque<>();

        // add() method to insert
        dq.add("The");
        dq.addFirst("To");
        dq.addLast("Geeks");

        // offer() method to insert
        dq.offer("For");
        dq.offerFirst("Welcome");
        dq.offerLast("Geeks");

        // Printing Elements of ArrayDeque to the console
        System.out.println("ArrayDeque : " + dq);
    }
}
