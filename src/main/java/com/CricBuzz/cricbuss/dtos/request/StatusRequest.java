package com.CricBuzz.cricbuss.dtos.request;

public class StatusRequest {
    int runsScored;

    int wicketsTaken;

    double battingAverage;

    double bowlingAverage;
    public StatusRequest(){};

    public StatusRequest(int runsScored, int wicketsTaken, double battingAverage, double bowlingAverage) {
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.battingAverage = battingAverage;
        this.bowlingAverage = bowlingAverage;
    }

    public int getRunsScored() {
        return runsScored;
    }

    public void setRunsScored(int runsScored) {
        this.runsScored = runsScored;
    }

    public int getWicketsTaken() {
        return wicketsTaken;
    }

    public void setWicketsTaken(int wicketsTaken) {
        this.wicketsTaken = wicketsTaken;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getBowlingAverage() {
        return bowlingAverage;
    }

    public void setBowlingAverage(double bowlingAverage) {
        this.bowlingAverage = bowlingAverage;
    }
}
