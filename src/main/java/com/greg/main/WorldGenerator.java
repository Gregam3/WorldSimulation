package com.greg.main;

import com.greg.main.cells.Agent;
import com.greg.main.cells.EmptyCell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class WorldGenerator {
    private static final int HEIGHT = 30;
    private static final int WIDTH = 100;

    public static World generateWorld() {
        List<List<Cell>> worldContent = new ArrayList<>();

        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int y = 0; y < HEIGHT; y++) {
            List<Cell> currentRow = new ArrayList<>();
            for (int x = 0; x < WIDTH; x++) {
                double percentageRoll = getPercentage(random);

                if (percentageRoll > 0.99) {
                    currentRow.add(new Agent(x, y, AgentNeeds.HUMAN));
                } else {
                    currentRow.add(new EmptyCell(x, y));
                }


            }
            worldContent.add(currentRow);
        }

        return new World(worldContent);
    }

    private static double getPercentage(ThreadLocalRandom r) {
        return r.nextDouble(0, 1);
    }
}
