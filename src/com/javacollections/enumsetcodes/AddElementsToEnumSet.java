package com.javacollections.enumsetcodes;

import java.util.EnumSet;

class AddElementsToEnumSet {

    enum Game { CRICKET, HOCKEY, TENNIS }

    public static void main(String[] args)
    {

        // Creating an EnumSet using allOf()
        EnumSet<Game> games1 = EnumSet.allOf(Game.class);

        // Creating an EnumSet using noneOf()
        EnumSet<Game> games2 = EnumSet.noneOf(Game.class);

        // Using add method
        games2.add(Game.HOCKEY);

        // printing the elements to the console
        System.out.println("EnumSet Using add(): " + games2);

        // Using addAll() method
        games2.addAll(games1);

        // printing the elements to the console
        System.out.println("EnumSet Using addAll(): "+ games2);
    }
}

