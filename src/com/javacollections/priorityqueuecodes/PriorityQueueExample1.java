package com.javacollections.priorityqueuecodes;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String args[])
    {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        pq.offer("example");

        System.out.println(pq);
    }
}
