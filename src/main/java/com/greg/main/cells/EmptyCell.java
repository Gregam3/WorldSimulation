package com.greg.main.cells;

import com.greg.main.Cell;
import com.greg.main.MapPosition;

public class EmptyCell extends Cell {
    public EmptyCell(int x, int y) {
        super(x, y, '-');
    }

    @Override
    public void act(int x, int y) {

    }
}
