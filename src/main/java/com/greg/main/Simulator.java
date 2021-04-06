package com.greg.main;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import java.util.List;

public class Simulator {
    private World world;
    private int timeStep = 0;

    public Simulator(@CheckForNull World world) {
        if (world == null) throw new AssertionError("Cannot have a null world");

        this.world = world;
    }

    public void startSimulation() {
        while (true) {
            timeStep++;
            System.out.println("Time:" + timeStep) ;
            world.print();
            System.out.println();
            for (int y = 0; y < world.getContent().size(); y++) {
                List<Cell> rows = world.getContent().get(y);

                for (int x = 0; x < rows.size(); x++) {
                    Cell cell = rows.get(x);
                    cell.act(x, y);
                }
            }
        }
    }
}
