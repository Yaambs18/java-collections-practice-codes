package com.javacollections.enumsetcodes;

import java.util.EnumSet;

public class CreateEnumSet {
    enum Game { CRICKET, HOCKEY, TENNIS }

    public static void main(String[] args)
    {

        // Creating an EnumSet using allOf()
        EnumSet<Game> games = EnumSet.allOf(Game.class);

        // printing EnumSet elements to the console
        System.out.println("EnumSet: " + games);
    }
}
