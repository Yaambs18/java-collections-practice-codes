package com.javacollections.arraydequecodes;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample1 {
    public static void main(String[] args)
    {
        // Initializing an deque
        Deque<String> dq = new ArrayDeque<String>();

        // add() method to insert
        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
    }
}
