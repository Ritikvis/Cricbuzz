package com.CricBuzz.cricbuss.dtos.request;

public class TeamRequest {
    String teamName;

    int ranking;

    int iccPoints;
    public TeamRequest(){};

    public TeamRequest(String teamName, int ranking, int iccPoints) {
        this.teamName = teamName;
        this.ranking = ranking;
        this.iccPoints = iccPoints;
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
}
