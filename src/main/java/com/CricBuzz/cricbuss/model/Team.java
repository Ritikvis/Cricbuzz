package com.CricBuzz.cricbuss.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String teamName;

    int ranking;

    int iccPoints;

    @OneToMany(mappedBy = "team")
    @JsonIgnore
    List<Player> players = new ArrayList<>();

    @ManyToMany(mappedBy = "teams")
    @JsonIgnore
    List<CricketMatch> matches = new ArrayList<>();
    public  Team(){};

    public Team(int id, String teamName, int ranking, int iccPoints, List<Player> players, List<CricketMatch> matches) {
        this.id = id;
        this.teamName = teamName;
        this.ranking = ranking;
        this.iccPoints = iccPoints;
        this.players = players;
        this.matches = matches;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public int getIccPoints() {
        return iccPoints;
    }

    public void setIccPoints(int iccPoints) {
        this.iccPoints = iccPoints;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<CricketMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<CricketMatch> matches) {
        this.matches = matches;
    }
}