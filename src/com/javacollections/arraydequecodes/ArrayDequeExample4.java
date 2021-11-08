package com.javacollections.arraydequecodes;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample4 {
    public static void main(String[] args)
    {
        // Initializing a deque
        Deque<String> dq = new ArrayDeque<>();

        // add() method to insert
        dq.add("One");

        // addFirst inserts at the front
        dq.addFirst("Two");

        // addLast inserts at the back
        dq.addLast("Three");

        // print elements to the console
        System.out.println("ArrayDeque : " + dq);

        // remove element as a stack from top/front
        System.out.println(dq.pop());

        // remove element as a queue from front
        System.out.println(dq.poll());

        // remove element from front
        System.out.println(dq.pollFirst());

        // remove element from back
        System.out.println(dq.pollLast());
    }
}
