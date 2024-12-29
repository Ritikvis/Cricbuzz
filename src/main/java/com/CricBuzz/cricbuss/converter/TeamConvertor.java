package com.CricBuzz.cricbuss.converter;

import com.CricBuzz.cricbuss.dtos.request.TeamRequest;
import com.CricBuzz.cricbuss.dtos.response.TeamResponse;
import com.CricBuzz.cricbuss.model.Team;

public class TeamConvertor {

    // Convert TeamRequest to Team
    public static Team teamRequestToTeam(TeamRequest teamRequest) {
        Team team = new Team();
        team.setTeamName(teamRequest.getTeamName());
        team.setRanking(teamRequest.getRanking());
        team.setIccPoints(teamRequest.getIccPoints());
        return team;
    }

    // Convert Team to TeamResponse
    public static TeamResponse teamToTeamResponse(Team team) {
        TeamResponse teamResponse = new TeamResponse();
        teamResponse.setRanking(team.getRanking());
        teamResponse.setTeamName(team.getTeamName());
        return teamResponse;
    }
}