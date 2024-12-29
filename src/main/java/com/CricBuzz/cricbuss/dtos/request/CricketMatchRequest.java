package com.CricBuzz.cricbuss.dtos.request;

import com.CricBuzz.cricbuss.model.Enum.MatchType;

public class CricketMatchRequest {
    String title;

    MatchType matchType;

    int overs;

    String place;
    public  CricketMatchRequest(){};

    public CricketMatchRequest(String title, MatchType matchType, int overs, String place) {
        this.title = title;
        this.matchType = matchType;
        this.overs = overs;
        this.place = place;
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
}
