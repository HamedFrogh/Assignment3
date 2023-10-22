package com.adap;

import com.friend.PilotPen;

// PenAdapter class that implements the Pen interface
public class PenAdapter implements Pen {

    // Composition: Create an instance of PilotPen
    PilotPen pp = new PilotPen();

    // Implement the write method from the Pen interface
    @Override
    public void write(String str) {
        // Call the mark method of PilotPen to write with PilotPen
        pp.mark(str);
    }
}
