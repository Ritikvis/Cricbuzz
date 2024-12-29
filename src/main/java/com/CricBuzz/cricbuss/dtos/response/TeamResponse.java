package com.CricBuzz.cricbuss.dtos.response;

public class TeamResponse {
    String teamName;

    int ranking;
    public TeamResponse(){};

    public TeamResponse(String teamName, int ranking) {
        this.teamName = teamName;
        this.ranking = ranking;
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
}
