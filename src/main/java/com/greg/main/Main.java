package com.greg.main;

public class Main {
    public static void main(String[] args) {
        World world = WorldGenerator.generateWorld();

        Simulator simulator = new Simulator(world);
        simulator.startSimulation();
    }
}
