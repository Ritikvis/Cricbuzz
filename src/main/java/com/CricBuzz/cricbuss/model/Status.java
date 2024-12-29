package com.CricBuzz.cricbuss.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    int runsScored;

    int wicketsTaken;

    double battingAverage;

    double bowlingAverage;

    @OneToOne
    @JoinColumn
    @JsonIgnore
    Player player;
    public Status(){};

    public Status(int id, int runsScored, int wicketsTaken, double battingAverage, double bowlingAverage, Player player) {
        this.id = id;
        this.runsScored = runsScored;
        this.wicketsTaken = wicketsTaken;
        this.battingAverage = battingAverage;
        this.bowlingAverage = bowlingAverage;
        this.player = player;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
