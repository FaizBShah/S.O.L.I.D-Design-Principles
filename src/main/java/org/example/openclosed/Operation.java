package org.example.openclosed;

// This is good code as other classes could just
// extend it to add their own logic rather than modifying it
public interface Operation {
    public int perform(int number1, int number2);
}
