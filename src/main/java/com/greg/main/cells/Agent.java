package com.greg.main.cells;

import com.greg.main.AgentNeed;
import com.greg.main.AgentNeeds;
import com.greg.main.Cell;
import com.greg.main.MapPosition;

public class Agent extends Cell {
    private AgentNeeds raceNeed;

    public Agent(int x, int y, AgentNeeds raceNeed) {
        super(x, y, 'A');
        this.raceNeed = raceNeed;
    }

    @Override
    public void act(int x, int y) {
        setPosition(x, y);
        printAct("Human", "Do Nothing");
    }
}
