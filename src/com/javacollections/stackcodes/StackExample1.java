package com.javacollections.stackcodes;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args)
    {
        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push(4);
        stack1.push("We");
        stack1.push("Programmers");

        stack2.push("Clash");
        stack2.push("of");
        stack2.push("Clans");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
    }
}
