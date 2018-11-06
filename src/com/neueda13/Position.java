package com.neueda13;

public class Position {

    // todo TASK
    /**
     * Represents a position on the chess board as (x,y) coordinates
     * Top-left position should be (0, 0)
     * Create properties, constructor and accessors that represents a single position
     */
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
