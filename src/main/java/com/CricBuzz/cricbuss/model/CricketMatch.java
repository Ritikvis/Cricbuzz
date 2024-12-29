package com.CricBuzz.cricbuss.model;

import com.CricBuzz.cricbuss.model.Enum.MatchType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
public class CricketMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String title;

    MatchType matchType;

    int overs;

    String place;

    @CreationTimestamp
    Date startedAt;

    @ManyToMany
    @JoinTable( name = "match_team",
            joinColumns = {
                    @JoinColumn(name = "cricket_match_id") },
            inverseJoinColumns = { @JoinColumn(name = "team_id") })
    List<Team> teams = new ArrayList<>();
    public  CricketMatch(){};

    public CricketMatch(int id, String title, MatchType matchType, int overs, String place, Date startedAt, List<Team> teams) {
        this.id = id;
        this.title = title;
        this.matchType = matchType;
        this.overs = overs;
        this.place = place;
        this.startedAt = startedAt;
        this.teams = teams;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MatchType getMatchType() {
        return matchType;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
