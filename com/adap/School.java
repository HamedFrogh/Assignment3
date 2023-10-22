package com.adap;

public class School {
    public static void main(String[] args) {

        // Create a Pen object 'p' by using a PenAdapter
        Pen p = new PenAdapter();

        // Create an AssignmentWork object 'aw'
        AssignmentWork aw = new AssignmentWork();

        // Set the Pen 'p' for the AssignmentWork
        aw.setP(p);

        // Write an assignment using the assigned Pen
        aw.writeAssignment("I'm a bit tired to write an Assignment");
    }
}