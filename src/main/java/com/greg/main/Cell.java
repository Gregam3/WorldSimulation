package com.greg.main;

public abstract class Cell {
    private MapPosition position;
    private char icon;

    public Cell(int x, int y, char icon) {
        this.position = new MapPosition(x, y);
        this.icon = icon;
    }

    public abstract void act(int x, int y);

    public void printAct(String cellContentName, String cellContentAction) {
        System.out.println(position + " - " + cellContentName + " -> " + cellContentAction);
    }

    public MapPosition getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        if (position == null) position = new MapPosition(x, y);
        position.set(x, y);
    }

    public char getIcon() {
        return icon;
    }
}
