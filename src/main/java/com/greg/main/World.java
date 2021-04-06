package com.greg.main;

import com.greg.main.cells.EmptyCell;

import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<List<Cell>> content;

    public World(List<List<Cell>> content) {
        this.content = content;
    }

    public List<List<Cell>> getContent() {
        return content;
    }

    public void updateCell(int x, int y, Cell cell) {
        this.content.get(x).set(y, cell);
    }

    public void print() {
        for (List<Cell> row : content) {
            for (Cell cell : row) {
                System.out.print(cell.getIcon());
            }
            System.out.println();
        }
    }
}
