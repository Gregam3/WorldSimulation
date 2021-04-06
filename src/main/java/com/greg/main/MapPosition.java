package com.greg.main;

public class MapPosition {
    private int x;
    private int y;

    public MapPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(x:" + this.x + ", y" + this.y + ")";
    }
}
