package com.adap;

// Define the AssignmentWork class
public class AssignmentWork {

    // Private member variable of type Pen
    private Pen p;

    // Method to write an assignment
    public void writeAssignment(String str) {
        // Delegates the writing task to the Pen instance 'p'
        p.write(str);
    }

    // Getter method for the Pen instance
    public Pen getP() {
        return p;
    }

    // Setter method to assign a Pen instance to 'p'
    public void setP(Pen p) {
        this.p = p;
    }
}
