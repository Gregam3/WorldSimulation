package com.greg.main;

public enum AgentNeeds {
    HUMAN(
            new AgentNeed(.5, AgentNeed.MEDIUM_DECAY, .8),
            new AgentNeed(.2,  AgentNeed.MEDIUM_DECAY, .8),
            new AgentNeed(.2,  AgentNeed.LOW_DECAY, .25),
            new AgentNeed(.1, AgentNeed.NO_DECAY, 1)
    );

    private AgentNeed hunger;
    private AgentNeed wealth;
    private AgentNeed health;
    private AgentNeed pride;

    AgentNeeds(AgentNeed hunger, AgentNeed wealth, AgentNeed health, AgentNeed pride) {
        this.hunger = hunger;
        this.wealth = wealth;
        this.health = health;
        this.pride = pride;
    }
}
