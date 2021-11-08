package com.javacollections.priorityqueuecodes;

import java.util.PriorityQueue;

public class PriorityQueueExample3 {
    public static void main(String[] args)
    {

        // Creating a priority queue
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");
        System.out.println("PriorityQueue: " + pq);

        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
