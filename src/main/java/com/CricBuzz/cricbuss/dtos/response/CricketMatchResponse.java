package com.CricBuzz.cricbuss.dtos.response;

import com.CricBuzz.cricbuss.model.Enum.MatchType;

import java.util.Date;
import java.util.List;

public class CricketMatchResponse {
    String title;

    MatchType matchType;

    int overs;

    String place;

    Date startedAt;

    List<TeamResponse> teams;
    public CricketMatchResponse(){};

    public CricketMatchResponse(String title, MatchType matchType, int overs, String place, Date startedAt, List<TeamResponse> teams) {
        this.title = title;
        this.matchType = matchType;
        this.overs = overs;
        this.place = place;
        this.startedAt = startedAt;
        this.teams = teams;
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

    public List<TeamResponse> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamResponse> teams) {
        this.teams = teams;
    }
}
