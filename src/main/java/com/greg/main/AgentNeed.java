package com.greg.main;

public class AgentNeed {
    public final static double HIGH_DECAY = .05;
    public final static double MEDIUM_DECAY = .025;
    public final static double LOW_DECAY = .01;
    public final static double NO_DECAY = .0;

    private final double start;
    private final double decayRate;
    private final double contentThreshold;

    public AgentNeed(double start, double decayRate, double contentThreshold) {
        this.start = start;
        this.decayRate = decayRate;
        this.contentThreshold = contentThreshold;
    }

    public double getStart() {
        return start;
    }

    public double getDecayRate() {
        return decayRate;
    }

    public double getContentThreshold() {
        return contentThreshold;
    }
}
